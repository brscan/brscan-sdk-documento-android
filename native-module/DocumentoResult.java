package com.brscansdkdocmentoreactnative;


import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;

import br.com.brscan.sdk.captura.models.Documento;
import br.com.brscan.sdk.captura.models.Erro;

public class DocumentoResult {

  public static void sucesso(Documento[] documentos, Callback callback) {

    WritableArray documentosWritable = Arguments.createArray();

    for (Documento documento : documentos) {
      WritableMap documentoMap = Arguments.createMap();

      documentoMap.putString("path", documento.getPath());
      documentoMap.putString("tipo", documento.getTipo());
      documentoMap.putString("score", documento.getScore());
      documentosWritable.pushMap(documentoMap);
    }
    callback.invoke(documentosWritable);
  }


  public static void falha(Erro erro, Callback callback) {
    WritableMap erroMap = Arguments.createMap();
    erroMap.putInt("codigo", erro.getCodigo());
    erroMap.putString("descricao", erro.getDescricao());
    callback.invoke(erroMap);
  }
}
