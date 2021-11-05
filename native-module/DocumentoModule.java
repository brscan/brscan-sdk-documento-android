package com.brscansdkdocmentoreactnative;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;

import java.util.Arrays;

import br.com.brscan.sdk.captura.activities.DocumentoActivity;
import br.com.brscan.sdk.captura.models.Documento;
import br.com.brscan.sdk.captura.models.Erro;

public class DocumentoModule extends ReactContextBaseJavaModule implements ActivityEventListener {

  private static final String TAG = "DocumentoModule";
  private static final int REQUEST_CODE_DOCUMENTO = 1003;

  private Callback sucessoCallback;
  private Callback erroCallback;
  private DocumentoConfiguracao configuracao;

  public DocumentoModule(ReactApplicationContext context) {
    super(context);
    context.addActivityEventListener(this);
  }

  @NonNull
  @Override
  public String getName() {
    return "DocumentoModule";
  }

  @ReactMethod
  public void start(ReadableMap configuracaoWritable, Callback sucessoCallback, Callback erroCallback) {
    Log.d(TAG, "start: ");
    this.configuracao = new DocumentoConfiguracao();
    this.configuracao.readableMapDocumentoConfiguracao(configuracaoWritable);
    this.sucessoCallback = sucessoCallback;
    this.erroCallback = erroCallback;
    iniciaCaptura();
  }

  private void iniciaCaptura() {
    Intent intent = new Intent(getCurrentActivity(), DocumentoActivity.class);
    intent.putExtra("chave", configuracao.getChave());//Adicionar a chave aqui!
    intent.putExtra("cropDocumento", configuracao.isCropDocumento());//Parametro que faz retornar a imagem cropada!
    intent.putExtra("timeoutCapturaManual", configuracao.getTimeoutCapturaManual());//Tempo para habilitar a captura manual!
    intent.putExtra("wizard", configuracao.isWizard());//Parametro para usar telas default!
    intent.putExtra("aceitaAB", configuracao.isAceitaAB());//Parametro que permite a captura de documento aberto!
    intent.putExtra("tiposDocumentosAceitos", configuracao.getTiposDocumentosAceitos());//Parametro para informar quais documentos podem ser capturados!
    getCurrentActivity().startActivityForResult(intent, REQUEST_CODE_DOCUMENTO);
  }

  @Override
  public void onActivityResult(Activity activity, int requestCode, int resultCode, Intent data) {
    if (resultCode == Activity.RESULT_OK) {
      if (requestCode == REQUEST_CODE_DOCUMENTO) {
        Documento[] documentos = (Documento[]) data.getSerializableExtra("documentos");
        if (documentos != null) {
          Log.d(TAG, "(Sucesso): arquivos: " + Arrays.toString(documentos));

          DocumentoResult.sucesso(documentos,sucessoCallback);

        } else {
          Erro erro = (Erro) data.getSerializableExtra("erro");
          if (erro != null) {
            DocumentoResult.falha(erro,erroCallback);
          }
          Log.i(TAG, "(Erro): " + erro.toString());
        }
      }

    }
  }

  @Override
  public void onNewIntent(Intent intent) {

  }
}
