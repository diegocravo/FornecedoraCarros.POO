package Main;

import Entities.*;

import java.util.Scanner;

public class Index {
    public static void main(String[] args) {

        //instanciar Peças por atribuição direta
        Peca peca1 = new Peca(10, "Pneu tamanho 175/65/15");
        Peca peca2 = new Peca(17, "Parabrisa tamanho grande");
        Peca peca3 = new Peca(25, "Caixa câmbio automático CVT");
        Peca peca4 = new Peca(27, "Volate com controle de som");
        Peca peca5 = new Peca(30, "Banco Motorista");
        Peca.adicionarPeca(peca1);
        Peca.adicionarPeca(peca2);
        Peca.adicionarPeca(peca3);
        Peca.adicionarPeca(peca4);
        Peca.adicionarPeca(peca5);

        //instanciar Fornecedores por atribuição direta
        Fornecedor fornecedor1 = new Fornecedor("123", "Mopar");
        Fornecedor fornecedor2 = new Fornecedor("456", "Pirelli");
        Fornecedor fornecedor3 = new Fornecedor("789", "SKF");
        Fornecedor.adicionarFornecedor(fornecedor1);
        Fornecedor.adicionarFornecedor(fornecedor2);
        Fornecedor.adicionarFornecedor(fornecedor3);

        //instanciar Carros por atribuição direta
        Carro carro1 = new Carro("Jeep", "Renegade", 1010, 2020);
        Carro carro2 = new Carro("Jeep", "Compass", 1011, 2019);
        Carro carro3 = new Carro("Fiat", "Toro", 1012, 2021);
        Carro.adicionarCarro(carro1);
        Carro.adicionarCarro(carro2);
        Carro.adicionarCarro(carro3);

        //instanciar ItemDoCarro por atribuição direta (Também será atribuido via teclado)
        ItemDoCarro item1 = new ItemDoCarro(1, "transparente", 200.00f, fornecedor1, peca2);
        ItemDoCarro item2 = new ItemDoCarro(4, "preto", 350.00f, fornecedor2, peca1);
        carro1.adicionarItemLista(item1);
        carro1.adicionarItemLista(item2);

        Menu.menu();

    }
}
