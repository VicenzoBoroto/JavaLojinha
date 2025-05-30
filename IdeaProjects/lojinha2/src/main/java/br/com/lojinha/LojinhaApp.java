package br.com.lojinha;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.pojo.Adicional;
import br.com.lojinha.pojo.Produto;

import java.util.ArrayList;
import java.util.List;

public class LojinhaApp {
    public static void main(String[] args) {
        Produto meuProduto = new Produto("Sony",Tamanho.MEDIO);

        List<Adicional> itensInclusos = new ArrayList<>();

        Adicional meuAdicional = new Adicional("Jogo", 2);
        itensInclusos.add(meuAdicional);

        Adicional meuAdicional2 = new Adicional("Controle", 2);
        itensInclusos.add(meuAdicional2);

        meuProduto.setNome("Playstation 4");
        meuProduto.setValor(10);
        meuProduto.setItensInclusos(itensInclusos);



        System.out.println(meuProduto.getValor());
        System.out.println(meuProduto.getTamanho());
        System.out.println(meuProduto.getItensInclusos());
        System.out.println(meuProduto.getMarca());

        for (Adicional AdicionalAtual : meuProduto.getItensInclusos()){
            System.out.println(AdicionalAtual.getNome());
            System.out.println(AdicionalAtual.getQuantidade());
        }
    }
}
