package br.com.carrinho;

public class Aparelho {

    private double precoBase;
    private String cor;
    private char consumoEnergia;
    private float peso;

    public Aparelho() {
        this.cor = "BRANCA";
        this.consumoEnergia = 'F';
        this.precoBase = 1000;
        this.peso = 5;
    }

    public Aparelho(float precoBase, float peso) {
        this.cor = "BRANCA";
        this.consumoEnergia = 'F';
        this.precoBase = precoBase;
        this.peso = peso;
    }

    public Aparelho(double precoBase, String cor, char consumoEnergia, float peso) {
        this.precoBase = precoBase;
        this.cor = cor;
        this.consumoEnergia = consumoEnergia;
        this.peso = peso;
        this.verifiqueConsumodeEnergia();
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public char getConsumoEnergia() {
        return consumoEnergia;
    }

    public void setConsumoEnergia(char consumoEnergia) {
        this.consumoEnergia = consumoEnergia;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    private void verifiqueConsumodeEnergia() {
        if (this.consumoEnergia != 'A'
                && this.consumoEnergia != 'B'
                && this.consumoEnergia != 'C'
                && this.consumoEnergia != 'D'
                && this.consumoEnergia != 'E'
                && this.consumoEnergia != 'F') {
            this.consumoEnergia = 'F';
        }
    }
    
    public void preco_final(){
        switch (this.consumoEnergia) {
            case 'A':
                this.setPrecoBase(this.getPrecoBase()+1000);
                break;
            case 'B':
                this.setPrecoBase(this.getPrecoBase()+800);
                break;
            case 'C':
                this.setPrecoBase(this.getPrecoBase()+600);
                break;
            case 'D':
                this.setPrecoBase(this.getPrecoBase()+500);
                break;
            case 'E':
                this.setPrecoBase(this.getPrecoBase()+300);
                break;
            case 'F':
                this.setPrecoBase(this.getPrecoBase()+100);
                break;
            default:
                break;
        }
    }

}
