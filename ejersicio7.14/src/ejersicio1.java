  import java.util.Scanner;

  public class ejersicio1  {  
 
  Scanner entrada = new Scanner(System.in);
  int Tamano_Arreglo = 10;
 
  public void Recibe()
  {         
  int Arreglo[] = new int[Tamano_Arreglo];

  for (int i = 0; i < Tamano_Arreglo; i++ )
  {     
  System.out.printf("\nPor favor introduzca el numero %d\n", i + 1);
  Arreglo[i] = entrada.nextInt();
  }      

  System.out.printf("\nEl producto es %d\n",  Multiplica( Arreglo ));

  }          
  public int Multiplica( int A[])
  {  
  int producto = 1;
 
  for ( int j = 0; j < A.length; j++ )
  {     
  producto *= A[j];
  }     
  return producto;
  }  
  }    