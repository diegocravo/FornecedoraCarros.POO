package Entities;

import java.util.ArrayList;
import java.util.List;

public class Fornecedor {

    private String cnpj;
    private String razaoSocial;
    private static List<Fornecedor> listaFornecedor = new ArrayList<Fornecedor>();
    private static int indexFornecedor; //index do fornecedor na lista a ser inserido em item do carro

    public Fornecedor(String cnpj, String razaoSocial){
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }

    public static void adicionarFornecedor(Fornecedor fornecedor){
        listaFornecedor.add(fornecedor);
    }

    public static boolean fornecedorNaLista(String cnpj1){
        boolean result = false;
        for (var x = 0; x < listaFornecedor.size(); x++){
            if(listaFornecedor.get(x).cnpj.equals(cnpj1)){
                indexFornecedor = x;
                result = true;
                break;
            }
        }
        return result;
    }

    public static Fornecedor retornaFornecedor(){
        return listaFornecedor.get(indexFornecedor);
    }
}
