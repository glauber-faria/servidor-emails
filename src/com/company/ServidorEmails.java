package com.company;
import java.util.ArrayList;

public class ServidorEmails {
    private ArrayList<CaixaPostal> caixa;

    public void setCaixa(CaixaPostal caixa) {
        this.caixa.add(caixa);
    }

    public ArrayList<CaixaPostal> getCaixa() {
        return caixa;
    }

    public void adicionarCaixa(CaixaPostal caixa){
        this.setCaixa(caixa);
    }

    public void enviaEmail(Email email){
        for (int i=0 ; i<this.getCaixa().size();i++) {
            for (int j =0; j<email.getDestinatario().length; j++){
                if(this.getCaixa().get(i).getNome().contains(email.getDestinatario()[j])) {
                    this.getCaixa().get(i).adicionaEmail(email);
                }
            }
        }
    }

    public void encaminhaEmail(Email email, String nome){
        for (int i=0 ; i<this.getCaixa().size();i++) {
            if(this.getCaixa().get(i).getNome().contains(nome)){
                this.getCaixa().get(i).adicionaEmail(email);
            }
        }

    }
    public ServidorEmails(){
        this.caixa = new ArrayList<CaixaPostal>();
    }
}
