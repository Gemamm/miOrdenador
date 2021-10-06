
package com.ceep.mipc;
import com.ceep.dominio.*;


public class Test {

    
    public static void main(String[] args) {
        Computadora C1 = new Computadora();
       Computadora C2 = new Computadora();
       Computadora C3 = new Computadora();
       Orden pedido1 = new Orden();
       pedido1.agregarComputadora(C1);
       pedido1.agregarComputadora(C2);
       pedido1.agregarComputadora(C3);
       pedido1.mostrarOrden();
    }
    
}
