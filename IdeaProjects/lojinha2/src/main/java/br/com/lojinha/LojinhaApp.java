package br.com.lojinha;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.pojo.Produto;

import java.util.ArrayList;
import java.util.List;

public class LojinhaApp {
    public static void main(String[] args) {
        Produto meuProduto = new Produto();

        meuProduto.setNome("Playstation 4");
        meuProduto.setValor(10);
        meuProduto.setMarca("Sony");
        meuProduto.setTamanho(Tamanho.PEQUENO);

        List<String> itensInclusos = new ArrayList<>();
        itensInclusos.add("2 Controles");
        itensInclusos.add("3 Jogos");
        meuProduto.setItensInclusos(itensInclusos);

        System.out.println(meuProduto.getValor());
        System.out.println(meuProduto.getTamanho());
        System.out.println(meuProduto.getItensInclusos());
    }
}
