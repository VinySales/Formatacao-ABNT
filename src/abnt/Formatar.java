/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abnt;

import com.sun.xml.internal.ws.util.StringUtils;
import javafx.scene.input.KeyEvent;

/**
 *
 * @author vinys
 */
public class Formatar {
    String tituloDoLivro;
    String subtituloDoLivro;
    String autoresDoArtigo;
    String editora;
    String local;
    int numeroDaEdicao;
    int primeiraPagina;
    int ultimaPagina;
    int ano;

    public Formatar(String tituloDoLivro, String subtituloDoLivro, String autoresDoArtigo, String editora, String local, int numeroDaEdicao, int primeiraPagina, int ultimaPagina, int ano) {
        this.tituloDoLivro = tituloDoLivro;
        this.subtituloDoLivro = subtituloDoLivro;
        this.autoresDoArtigo = autoresDoArtigo;
        this.editora = editora;
        this.local = local;
        this.numeroDaEdicao = numeroDaEdicao;
        this.primeiraPagina = primeiraPagina;
        this.ultimaPagina = ultimaPagina;
        this.ano = ano;
    }

    public String getTituloDoLivro() {
        return tituloDoLivro;
    }

    public void setTituloDoLivro(String tituloDoLivro) {
        this.tituloDoLivro = tituloDoLivro;
    }

    public String getSubtituloDoLivro() {
        return subtituloDoLivro;
    }

    public void setSubtituloDoLivro(String subtituloDoLivro) {
        this.subtituloDoLivro = subtituloDoLivro;
    }

    public String getAutoresDoArtigo() {
        return autoresDoArtigo;
    }

    public void setAutoresDoArtigo(String autoresDoArtigo) {
        this.autoresDoArtigo = autoresDoArtigo;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public int getNumeroDaEdicao() {
        return numeroDaEdicao;
    }

    public void setNumeroDaEdicao(int numeroDaEdicao) {
        this.numeroDaEdicao = numeroDaEdicao;
    }

    public int getPrimeiraPagina() {
        return primeiraPagina;
    }

    public void setPrimeiraPagina(int primeiraPagina) {
        this.primeiraPagina = primeiraPagina;
    }

    public int getUltimaPagina() {
        return ultimaPagina;
    }

    public void setUltimaPagina(int ultimaPagina) {
        this.ultimaPagina = ultimaPagina;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public String formataReferencia(){
        //Separando Autores por vírgula e armazenando em um Vetor
        String[] autores = this.getAutoresDoArtigo().split(", "); 
        String ultimoNome;
        String primeirosNomes;
        String fraseDeAutores;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < autores.length ; i++) {
            if (i < autores.length -1) {
                ultimoNome = autores[i].substring(autores[i].lastIndexOf(" "), autores[i].length());
                primeirosNomes = autores[i].replace(ultimoNome, ",");
                fraseDeAutores = ultimoNome.toUpperCase() + " " + primeirosNomes;
                sb.append(fraseDeAutores);
            }
            //Verificando último nome na opsição do Vetor, para remover última vírgula
            if(i == autores.length -1){
                ultimoNome = autores[i].substring(autores[i].lastIndexOf(" "), autores[i].length());
                primeirosNomes = autores[i].replace(ultimoNome, ",");
                fraseDeAutores = ultimoNome.toUpperCase() + " " + primeirosNomes;
                fraseDeAutores = fraseDeAutores.substring(0, fraseDeAutores.length()-1);
                sb.append(fraseDeAutores);
            }
        } 
       
        sb.append("; "+this.getTituloDoLivro() + ": " + 
                    this.getSubtituloDoLivro() + ". " + 
                    this.getNumeroDaEdicao() + ". ed. " +
                    this.getLocal() + ": " + 
                    this.getEditora() + ", " + 
                    this.getAno() + ". p. " + 
                    this.getPrimeiraPagina() + "-" + 
                    this.getUltimaPagina() + ".");
        return sb.toString();
    }
}

