
package ec.edu.ister.arreglos;


public class Arreglo {
   private int [] vector = new int[10];

    public Arreglo(int[]vector){
     this.vector=vector;
    }  
      
    public void setVector(int[] vector) {
        this.vector = vector;
    }
    public int[] getVector() {
        return vector;
    }
   
    public void imprimir(int vector[]){
        for(int i=0;i<1;i++){
 //   System.out.print( vector[i]+"->");
        }}
     public void calcular (int vector[]){
       int suma=0,promedio=0;
         for(int i=0;i<10;i++){
    suma+=vector[i];
    promedio=suma/10;
        }
    System.out.print("\nla suma es:"+suma);
    
    System.out.print("\nel promedio es:"+promedio);
     }
    public void menor(int vector[])
    {
        
    
    }
     
     
}
