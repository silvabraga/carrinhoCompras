
package br.com.carrinho;


public class Televisao extends Aparelho{
    private float resolucao;
    private boolean receptorTdt;

    public Televisao() {
        this.resolucao = 20;
        this.receptorTdt = false;
    }

    public Televisao(float precoBase, float peso) {
        super(precoBase, peso);
        this.resolucao = 20;
        this.receptorTdt = false;
    }

    public Televisao(float resolucao, boolean receptorTdt, float precoBase, String cor, char consumoEnergia, float peso) {
        super(precoBase, cor, consumoEnergia, peso);
        this.resolucao = resolucao;
        this.receptorTdt = receptorTdt;
    }

    public float getResolucao() {
        return resolucao;
    }

    public void setResolucao(float resolucao) {
        this.resolucao = resolucao;
    }

    public boolean isReceptorTdt() {
        return receptorTdt;
    }

    public void setReceptorTdt(boolean receptorTdt) {
        this.receptorTdt = receptorTdt;
    }
    
    public void precoFinal(){
        if(this.getResolucao() > 40){
            this.setPrecoBase((this.getPrecoBase() + (this.getPrecoBase() * 0.3)));
        }
        if(receptorTdt){
            this.setPrecoBase(this.getPrecoBase() + 500);
            
        }
    }
    
    
    
    
}
