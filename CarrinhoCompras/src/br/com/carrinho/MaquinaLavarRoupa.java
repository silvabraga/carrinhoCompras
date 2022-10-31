
package br.com.carrinho;


public class MaquinaLavarRoupa extends Aparelho{
    private int capacidade;

    public MaquinaLavarRoupa() {
        this.capacidade = 5;
    }

    public MaquinaLavarRoupa(float precoBase, float peso) {
        super(precoBase, peso);
        this.capacidade = 5;
    }

    public MaquinaLavarRoupa(int capacidade, float precoBase, String cor, char consumoEnergia, float peso) {
        super(precoBase, cor, consumoEnergia, peso);
        this.capacidade = capacidade;
    }

    public int getCapacidade() {
        return capacidade;
    }
    
    public void precoFinal(){
        if(this.getCapacidade() > 30){
            this.setPrecoBase(this.getPrecoBase() + 500);
        }
    }
    
    
}
