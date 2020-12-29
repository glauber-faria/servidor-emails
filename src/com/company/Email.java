package com.company;

import java.util.Arrays;

public class Email {
    private String remetente;
    private String[] destinatario;
    private String assunto;
    private String mensagem;

    public void setRemetente(String remetente) {
        this.remetente = remetente;
    }

    public String getRemetente() {
        return remetente;
    }

    public void setDestinatario(String[] destinatario) {
        this.destinatario = destinatario;
    }

    public String[] getDestinatario() {
        return destinatario;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return mensagem;
    }

    @Override
    public String toString() {
        return "De: " + remetente + "\n" +
                "Para: " + Arrays.toString(destinatario) +
                assunto + "\n" +
                mensagem + "\n" ;
    }

    public Email(String remetente, String[] destinatario, String assunto, String mensagem){
        setRemetente(remetente);
        setDestinatario(destinatario);
        setAssunto(assunto);
        setMensagem(mensagem);
    }
}
