/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baralho;

/**
 * Uma abstracao para cartas que contem naipe e um valor.
 * @author alexandre
 */
@SuppressWarnings("EqualsAndHashcode")
public class Carta {
    public final Naipe naipe;
    public final ValorCarta valor;
    
    /***
     * Um construtor publico para carta que inicializa todas suas constantes
     * @param n O naipe da instancia da carta.
     * @param v O valor da instancia da carta.
     */
    public Carta(Naipe n, ValorCarta v) {
        naipe = n;
        valor = v;
    }
    
    @Override
    public String toString() {
        return valor + " de " + naipe;
    }
    
    /**
     * Compara dois objetos Java e retorna o resultado da comparacao.
     * @param o O outro objeto a ser comparado.
     * @return True se e somente se o outro objeto for uma carta e esta tiver o mesmo naipe e valor.
     */
    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Carta))
            return false;
        Carta c = (Carta) o;
        return c.naipe == naipe && c.valor == valor;
    }
}
