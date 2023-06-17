/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herencia_p6_poo_adp;

/**
 *
 * @author Usuario
 */
public class HERENCIA_P6_POO_ADP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Vehiculo  veh = new Vehiculo ();
       Vehiculo  veh1 = new Vehiculo ();
       Automovil auto = new Automovil ();
        Automovil auto1 = new Automovil ();
       Motocicleta moto = new Motocicleta ();
       
       veh.encendido();
       veh1.apagado();
       auto1.apagado();
       auto.encendido();
       moto.encendido();
       
        System.out.println(veh.estado);
        System.out.println(veh1.estado);
        System.out.println(auto.estado);
        System.out.println(auto1.estado);
        System.out.println(moto.estado);
    }
    
}
