
package com.ceep.dominio;


public class Orden {
    private int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private static int contadorComputadoras;
    private static int max_computadoras;

    
    public Orden() {
        computadoras=new Computadora[Orden.max_computadoras];
        this.idOrden = ++Orden.contadorOrdenes;
    } 
    

    public int getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(int idOrden) {
        this.idOrden = idOrden;
    }

    public Computadora[] getComputadoras() {
        return computadoras;
    }

    public void setComputadoras(Computadora[] computadoras) {
        this.computadoras = computadoras;
    }

    public static int getContadorOrdenes() {
        return contadorOrdenes;
    }

    public static void setContadorOrdenes(int contadorOrdenes) {
        Orden.contadorOrdenes = contadorOrdenes;
    }

    public static int getContadorComputadoras() {
        return contadorComputadoras;
    }

    public static void setContadorComputadoras(int contadorComputadoras) {
        Orden.contadorComputadoras = contadorComputadoras;
    }

    public static int getMax_computadoras() {
        return max_computadoras;
    }

    public static void setMax_computadoras(int max_computadoras) {
        Orden.max_computadoras = max_computadoras;
    }
    
    
    
    
    
    public void agregarComputadora(Computadora computadoras){
                if (Orden.contadorComputadoras < Orden.max_computadoras){
            this.computadoras[Orden.contadorComputadoras++] = computadoras;
            
        }else{
            System.out.println("Has alcanzado el maximo de computadoras por orden de "+
                    +Orden.max_computadoras);
        }
    }
    
    public void mostrarOrden(){
        System.out.println("Id de orden: "+this.idOrden);
        for(int i= 0; i < Orden.contadorComputadoras;i++){
            System.out.println("Nombre computadora: "+ i+ "]->"+computadoras[i]);
            
        }
        
        
        
    }

    
    
    
}
