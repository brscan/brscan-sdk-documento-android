package com.brscansdkdocmentoreactnative;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

import java.io.Serializable;

public class DocumentoConfiguracao implements Serializable {
  private String chave;
  private boolean cropDocumento;
  private int timeoutCapturaManual;
  private boolean wizard;
  private boolean aceitaAB;
  private String[] tiposDocumentosAceitos;

  public String getChave() {
    return chave;
  }

  public void setChave(String chave) {
    this.chave = chave;
  }

  public boolean isCropDocumento() {
    return cropDocumento;
  }

  public void setCropDocumento(boolean cropDocumento) {
    this.cropDocumento = cropDocumento;
  }

  public int getTimeoutCapturaManual() {
    return timeoutCapturaManual;
  }

  public void setTimeoutCapturaManual(int timeoutCapturaManual) {
    this.timeoutCapturaManual = timeoutCapturaManual;
  }

  public boolean isWizard() {
    return wizard;
  }

  public void setWizard(boolean wizard) {
    this.wizard = wizard;
  }

  public boolean isAceitaAB() {
    return aceitaAB;
  }

  public void setAceitaAB(boolean aceitaAB) {
    this.aceitaAB = aceitaAB;
  }

  public String[] getTiposDocumentosAceitos() {
    return tiposDocumentosAceitos;
  }

  public void setTiposDocumentosAceitos(String[] tiposDocumentosAceitos) {
    this.tiposDocumentosAceitos = tiposDocumentosAceitos;
  }

  public void readableMapDocumentoConfiguracao(ReadableMap configuracaoWritable) {
    String chave = configuracaoWritable.getString("chave");
    boolean cropDocumento = configuracaoWritable.getBoolean("cropDocumento");
    int timeoutCapturaManual = configuracaoWritable.getInt("timeoutCapturaManual");
    boolean wizard = configuracaoWritable.getBoolean("wizard");
    boolean aceitaAB = configuracaoWritable.getBoolean("aceitaAB");
    String[] tiposDocumentosAceitos = readableArrayToStringList(configuracaoWritable.getArray("tiposDocumentosAceitos"));

    this.setChave(chave);
    this.setCropDocumento(cropDocumento);
    this.setTimeoutCapturaManual(timeoutCapturaManual);
    this.setWizard(wizard);
    this.setAceitaAB(aceitaAB);
    this.setTiposDocumentosAceitos(tiposDocumentosAceitos);
  }

  private static String[] readableArrayToStringList(final ReadableArray array) {
    String[] stringList = new String[array.size()];

    for (int i = 0, l = array.size(); i < l; i++) {
      stringList[i] = array.getString(i);
    }

    return stringList;
  }
}
