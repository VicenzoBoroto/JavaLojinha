package br.com.lojinha.pojo;

import java.util.List;

public class Produto {
    private String nome;
    private String marca;
    private double valor;
    private String tamanho;
    private List<String> itensInclusos;

    public double getValor() {
        return this.valor;
    }

    public void setValor(double novoValor) {
        if(novoValor > 0) {
            this.valor = novoValor;
        } else {
            throw new IllegalArgumentException("Valores devem ser maiores que 0.");
        }
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String novaMarca) {
        this.marca = novaMarca;
    }

    public String getTamanho() {
        return this.tamanho;
    }

    public void setTamanho(String novoTamanho) {
        this.tamanho = novoTamanho;
    }

    public List<String> getItensInclusos() {
        return this.itensInclusos;
    }

    public void setItensInclusos(List<String> novosItens) {
        this.itensInclusos = novosItens;
    }
}
