
package com.ceep.mipc;
import com.ceep.dominio.*;


public class Test {

    
    public static void main(String[] args) {
        
       
       Teclado teclado1 = new Teclado("usb", "Logiteck");
       Raton raton1 = new Raton("usb", "hp");
       Monitor monitor1 = new Monitor("Hp", 5.8);
       Orden pedido1 = new Orden();
       Computadora C1 = new Computadora("Ordenador 1", monitor1, teclado1, raton1);
       Computadora C2 = new Computadora();
       Computadora C3 = new Computadora();
       pedido1.agregarComputadora(C1);
       pedido1.agregarComputadora(C2);
       pedido1.agregarComputadora(C3);
       pedido1.mostrarOrden();
    }
    
}
