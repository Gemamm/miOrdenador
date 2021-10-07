
package com.ceep.dominio;


public class Orden {
    private final int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private static int contadorComputadoras;
    private static final int max_computadoras = 4;

    
    public Orden() {
        this.idOrden = ++contadorOrdenes;
        computadoras = new Computadora[Orden.max_computadoras];
        contadorComputadoras = 0;
        
    }
    
    public void agregarComputadora(Computadora computadoras){
                if (contadorComputadoras < max_computadoras){
            this.computadoras[contadorComputadoras++] = computadoras;
            
        }else{
            System.out.println("Has alcanzado el maximo de computadoras por orden de "+
                    +max_computadoras);
        }
    }
    
    public void mostrarOrden(){
        System.out.println("Id de orden: "+this.idOrden);
        for(int i= 0; i < contadorComputadoras;i++){
            System.out.println(computadoras[i]);
            
        }
        
        
        
    }

    
    
    
}
