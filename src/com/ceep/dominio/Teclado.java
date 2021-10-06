
package com.ceep.dominio;


public class Teclado extends DispositivoEntrada{
    
    private int idTeclado;
    private static int contadorteclados;

    public Teclado(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
       
    }

    @Override
    public String toString() {
        return "Teclado{" + "idTeclado=" + idTeclado + '}';
    }
    
    
}
