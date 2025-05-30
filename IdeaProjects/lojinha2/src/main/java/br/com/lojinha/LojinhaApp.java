package br.com.lojinha;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.pojo.Adicional;
import br.com.lojinha.pojo.Produto;
import br.com.lojinha.pojo.ProdutoInternacional;
import br.com.lojinha.pojo.ProdutoNacional;

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
        System.out.println(meuProduto.getMarca());

        System.out.println("Exibindo adicionais:\n");

        for (Adicional AdicionalAtual : meuProduto.getItensInclusos()){
            System.out.println(AdicionalAtual.getNome());
            System.out.println(AdicionalAtual.getQuantidade());
        }

        System.out.println("Fim da lista de adicionais.\n");

        ProdutoNacional meuProdutoNacional = new ProdutoNacional("Sony", Tamanho.MEDIO);
        System.out.println(meuProdutoNacional.getMarca());
        meuProdutoNacional.setImpostoNacional(0.55678);
        System.out.println(meuProdutoNacional.getImpostoNacional());

        ProdutoInternacional meuProdutoInternacional = new ProdutoInternacional("Nintendo", Tamanho.PEQUENO);
        System.out.println(meuProdutoInternacional.getMarca());
        meuProdutoInternacional.setTaxaImportacao(7.98);
        System.out.println(meuProdutoInternacional.getTaxaImportacao());
        meuProdutoInternacional.setValor(-99.99);
        System.out.println(meuProdutoInternacional.getValor());
    }
}
