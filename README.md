# ejercicios
public class ejercicio4 {
     public static void main(java.lang.String[] args) {
     boolean validar;
     String dni;
     Scanner sc=new Scanner (System.in);
     do{
     System.out.println("Anota DNI");
     dni=sc.nextLine();
     validar=validar_dni(dni);
     }while(validar==false);  
    System.out.println("El dni es falso");
     }
    
}
public static boolean validar_dni(String dni){
    if  (dni.length()!9)
        return false;
    for(int i=0;i<dni.length()-1;i++){
        if (dni.charAt(i)<'0' || dni.charAt(i)>'9')
            return true;
