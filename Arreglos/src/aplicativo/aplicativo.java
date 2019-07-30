
package aplicativo;
import ec.edu.ister.arreglos.Arreglo;
import java.util.Scanner;

public class aplicativo {
    public static void main(String args[]){
    
        int[]vector=new int [10];
        
        Scanner lee=new Scanner(System.in);
        for(int i=0;i<10;i++){
       
        System.out.println("Ingrese el elemento "+(i+1)+":");
        vector[i]=lee.nextInt();
        }
    Arreglo arreglo=new Arreglo(vector);
    Arreglo obj1 =new Arreglo(vector);
        arreglo.imprimir(vector);
        obj1.calcular(vector);
    }                




}
    

