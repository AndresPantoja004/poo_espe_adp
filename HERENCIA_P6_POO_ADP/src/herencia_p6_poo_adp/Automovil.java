/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia_p6_poo_adp;

/**
 *
 * @author Usuario
 */
public class Automovil extends Vehiculo {
    //Este articulo es propio de esta clase
    boolean parabrisas;  
@Override
public void encendido(){
        encendido = true;
        estado = "Automovil encendido";
 }
 @Override
 public void apagado (){
      encendido = false;
        estado = "Automovil apagado";
 }
}

