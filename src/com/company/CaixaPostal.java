package com.company;
import java.util.ArrayList;

public class CaixaPostal {
    private String nome;
    private ArrayList<Email> emails;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Email> getEmails() {
        return emails;
    }

    public CaixaPostal(String nome) {
        this.setNome(nome);
        this.emails = new ArrayList<Email>();
    }

    public void adicionaEmail(Email email) {
        this.emails.add(email);
    }

    public String toString() {
        String retorno = ">>> Caixa Postal de " + this.nome + " <<<\n";
        for (Email e : emails) {
            if (e != null) {
                retorno = retorno + e;
            } else {
                break;
            }
        }
        return retorno + "\n";

    }

}


