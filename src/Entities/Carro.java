package Entities;

import java.util.ArrayList;
import java.util.List;

public class Carro {

    private String marca;
    private String modelo;
    private int chassi;
    private int anoFabricacao;
    private float precoCusto;
    private static List<ItemDoCarro> listaItens = new ArrayList<ItemDoCarro>();
    private static List<Carro> listaCarros = new ArrayList<Carro>();
    private static int indexCarro;

    public Carro(String marca, String modelo, int chassi, int anoFabricacao){
        this.marca = marca;
        this.modelo = modelo;
        this.chassi = chassi;
        this.anoFabricacao = anoFabricacao;
    }

    public void setPrecoCusto(Carro carro) {
        this.precoCusto = calcularCusto(carro);
    }

    public float calcularCusto(Carro carro){
        float valor = 0;
        for (var x = 0; x < carro.listaItens.size(); x++){
            valor += carro.listaItens.get(x).getValorItem();
        }
        return valor; // metodo para calcular o preco de custo do carro baseado nas pecas
    }

    public static void adicionarItemLista(ItemDoCarro item){
        listaItens.add(item);
    }

    public static void adicionarCarro(Carro carro){
        listaCarros.add(carro);
    }

    public static boolean carroNaLista(int chassi){
        boolean result = false;
        for (var x = 0; x < listaCarros.size(); x++){
            if(listaCarros.get(x).chassi == chassi){
                indexCarro = x;
                result = true;
            }
        }
        return result;
    }

    public static Carro retornaCarro(){
        return listaCarros.get(indexCarro);
    }

    @Override
    public String toString() {
        return "Carro: \n"
                + "Marca: "
                + marca
                + ", Modelo: "
                + modelo
                + ", Chassi: "
                + chassi
                + ", Ano Fabricação: "
                + anoFabricacao
                + ", Preço Custo: R$"
                + String.format("%.2f", calcularCusto(retornaCarro()));
    }
}
