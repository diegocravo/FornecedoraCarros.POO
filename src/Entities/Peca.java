package Entities;

import java.util.ArrayList;
import java.util.List;

public class Peca {

    private int codigoPeca;
    private String descricao;
    private static List<Peca> listaPecas = new ArrayList<Peca>();
    private static int indexPeca;

    public Peca(int codigoPeca,String descricao ){
        this.codigoPeca = codigoPeca;
        this.descricao = descricao;
    }

    public static void adicionarPeca(Peca peca){
        listaPecas.add(peca);
    }

    public static boolean pecaNaLista(int codigo){
        boolean result = false;
        for (var x = 0; x < listaPecas.size(); x++){
            if(listaPecas.get(x).codigoPeca == codigo){
                indexPeca = x;
                result = true;
            }
        }
        return result;
    }

    public static Peca retornaPeca(){
        return listaPecas.get(indexPeca);
    }
}
