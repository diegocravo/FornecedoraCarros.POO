package Main;

import Entities.Carro;
import Entities.Fornecedor;
import Entities.ItemDoCarro;
import Entities.Peca;

import java.util.Scanner;

public class Menu {

    public static void menu(){

        Scanner ler = new Scanner(System.in);

        try{
            System.out.println("Digite o chassi do carro: ");
            int numChassi = ler.nextInt();
            ler.nextLine();

            System.out.println("Digite o código da peça: ");
            int numCod = ler.nextInt();
            ler.nextLine();

            System.out.println("Digite o CNPJ do Fornecedor do item: ");
            String numCNPJ = ler.nextLine();

            //System.out.println(Carro.carroNaLista(numChassi));
            //System.out.println(Peca.pecaNaLista(numCod));
            //System.out.println(Fornecedor.fornecedorNaLista(numCNPJ));

            if(Peca.pecaNaLista(numCod) && Fornecedor.fornecedorNaLista(numCNPJ) && Carro.carroNaLista(numChassi)){
                ItemDoCarro item = new ItemDoCarro(1, "preto", 150.00f, Fornecedor.retornaFornecedor(), Peca.retornaPeca());
                System.out.println("Item adicionado com sucesso.");
                Carro.retornaCarro().adicionarItemLista(item);
                System.out.println(Carro.retornaCarro());
            }else{
                System.out.println("Peça, carro ou fornecedor não existe.");
            }
        }catch (Exception e){
            System.out.println("Entrada Inválida.");
        }
    }

}
