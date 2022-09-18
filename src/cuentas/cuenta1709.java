/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuentas;

import javax.swing.JOptionPane;

/**
 *
 * @author jorge
 */
public class cuenta1709 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here}
        
        final int saldo_inicialm = 300;  
        final int saldo_iniciala = 200;
   
        float ingreso, saldoActual, retira;
        
        int opciones; 
       int pas1;
           int pas2;
        
        
        
        
        
        
        
        opciones = Integer.parseInt(JOptionPane.showInputDialog("Bien venido seleccione el tipo de cuenta\n"
            
            +"1.Cuenta Monetaria\n"
                    +"2.Cuenta de Ahorro\n"
                    +"3.Salir"
        
            ));
              
        
        
        
        switch(opciones){
            
            
            
            case 1:
        
        
            pas1 = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opción para la cuenta Monetaria\n"
            
            +"1.Ingresar saldo\n"
                    +"2.Retirar saldo\n"
                     +"3.Ver saldo de cuenta\n"
            +"4.salir"));
             
           
             
             switch(pas1){
                
                 case 1:
                     ingreso = Float.parseFloat(JOptionPane.showInputDialog("ingrese el saldo a depositar"));
                     saldoActual= saldo_inicialm + ingreso;
                     JOptionPane.showMessageDialog(null, "El saldo total de spues del deposito es: "+saldoActual);
                    
                     break;
                             case 2:
                                 retira = Float.parseFloat(JOptionPane.showInputDialog("ingrese el saldo a retirar"));
                                 
                                   if(retira > saldo_inicialm){ 
                                       
                                        JOptionPane.showMessageDialog(null,"El saldo no es suficiente");
      
                                   }
                                    else {
                                       
                                       
                                 saldoActual = saldo_inicialm - retira;
                                 JOptionPane.showMessageDialog(null, "El saldo total despues del retiro es: "+saldoActual);
                                   }
                           break;  
                           
                  
                           case 3:
                               
                               JOptionPane.showMessageDialog(null, "El saldo total es: " + saldo_inicialm);
                               
                               break;
                               
                             case 4:
                         
                                 
                             default: JOptionPane.showMessageDialog(null, "Gracias por la preferencia");
                          break;       
                       
             }
            
             
            case 2:
            
              float saldoActual2;
            
                    pas2 = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opción para la cuenta de Ahorro\n"
            
            +"1.Ingresar saldo\n"
                    +"2.Retirar saldo\n"
                     +"3.Ver saldo de cuenta\n"
            +"4.salir"));
             
                    switch(pas2){
                
                 case 1:
                     ingreso = Float.parseFloat(JOptionPane.showInputDialog("ingrese el saldo a depositar"));
                     saldoActual2= saldo_iniciala + ingreso;
                     JOptionPane.showMessageDialog(null, "El saldo total de spues del deposito es: "+saldoActual2);
                    
                     break;
                             case 2:
                                 retira = Float.parseFloat(JOptionPane.showInputDialog("ingrese el saldo a retirar"));
                                 
                                   if(retira > saldo_iniciala){ 
                                       
                                        JOptionPane.showMessageDialog(null,"El saldo no es suficiente");
      
                                   }
                                    else {
                                       
                                       
                                 saldoActual2 = saldo_inicialm - retira;
                                 JOptionPane.showMessageDialog(null, "El saldo total despues del retiro es: "+saldoActual2);
                                   }
                           break;   
                           
                           
                            case 3:
                               
                               JOptionPane.showMessageDialog(null, "El saldo total es: " + saldo_iniciala);
                               
                               break;
                             case 4:
                                 
                                 
                                 
                             default: JOptionPane.showMessageDialog(null, "Gracias por la preferencia");
                             break;
                                 
                    }
                    
                    case 3:
                      
                           default: JOptionPane.showMessageDialog(null, "!Gracias por su preferencia!");
                       
         
                           break;
        }    
      
        
    }
    }
    

