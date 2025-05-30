package br.com.lojinha.pojo;

public class Adicional {
    private String nome;
    private int quantidade;

    public Adicional(String novoNome, int novaQuantidade) {
        this.nome = novoNome;
        this.quantidade = novaQuantidade;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String novoNome){
        this.nome = novoNome;
    }

    public int getQuantidade(){
        return this.quantidade;
    }

    public void setQuantidade(int novaQuantidade){
        this.quantidade = novaQuantidade;
    }
}
