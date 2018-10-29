/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package update.ejercicios;
import java.util.*;
/**
 *
 * @author Roberto
 */
public class UpdateEjercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        
        boolean validar;
        String dni;
        
        do{
        System.out.println("Introduzca su dni");
        dni=sc.nextLine();
            
        validar=validar_dni(dni);
        
        if(validar==false)
            System.out.println("DNI incorrecto. repita");
        
        }while(validar==false);
        
        if(validar==true)
            System.out.println(dni+" es valido");
            
        
    }
    public static boolean validar_dni(String dni){
        if(dni.length()!=9)
            return false;
        else{
           for(int i=0;i<dni.length()-1;i++){
               if(!Character.isDigit(dni.charAt(i)))
                return false;
           }
           if(!Character.isLetter(dni.charAt(8)))
               return false;
           else
               return true;
          
        }   
    }
    
}
