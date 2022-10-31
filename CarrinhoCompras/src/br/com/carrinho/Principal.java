
package br.com.carrinho;

import java.util.ArrayList;
import java.util.List;


public class Principal {

    public static void main(String[] args) {
        
        ArrayList<Aparelho> carrinho = new ArrayList<Aparelho>();
        Televisao t1 = new Televisao();
        Televisao t2 = new Televisao();
        Televisao t3 = new Televisao();
        Televisao t4 = new Televisao();
        MaquinaLavarRoupa m1 = new MaquinaLavarRoupa();
        MaquinaLavarRoupa m2 = new MaquinaLavarRoupa();
        MaquinaLavarRoupa m3 = new MaquinaLavarRoupa();
        MaquinaLavarRoupa m4 = new MaquinaLavarRoupa();
        MaquinaLavarRoupa m5 = new MaquinaLavarRoupa();
        MaquinaLavarRoupa m6 = new MaquinaLavarRoupa();
        
        carrinho.add(t1);
        carrinho.add(t2);
        carrinho.add(t3);
        carrinho.add(t4);
        carrinho.add(m1);
        carrinho.add(m2);
        carrinho.add(m3);
        carrinho.add(m4);
        carrinho.add(m5);
        carrinho.add(m6);
        
        for (Aparelho aparelho : carrinho) {
            aparelho.preco_final();
            System.out.println(aparelho.getPrecoBase());
        }
        
        
        
    }
    
}
