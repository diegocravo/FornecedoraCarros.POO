package Entities;

public class ItemDoCarro {

    private int quantidade;
    private String cor;
    private float precoUnitario;
    private float valorItem; //quantidade * valor unitario
    private Fornecedor fornecedor;
    private Peca peca;

    public ItemDoCarro(int quantidade, String cor, float precoUnitario, Fornecedor fornecedor, Peca peca){
        this.quantidade = quantidade;
        this.cor = cor;
        this.precoUnitario = precoUnitario;
        this.valorItem = this.precoUnitario * this.quantidade;
        this.fornecedor = fornecedor;
        this.peca = peca;
    }

    public float getValorItem() {
        return valorItem;
    }
}
