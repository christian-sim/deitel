/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7.pkg17;

import java.util.Random;
import java.util.Scanner;

public class Ramdon {
 Scanner lee = new Scanner(System.in); 
 Random aleatorio = new Random();
 
 private int num;
 int arreglo [];
public void Recibir(){
    System.out.println("Cuantas veces quiere lanzar el dado");
    num = lee.nextInt();
arreglo = new int [num];
lanzar();
}
public void lanzar(){
int n1 , n2 ;
for(int i = 0; i < arreglo.length;i++){
n1 = 1 + aleatorio.nextInt(6);
n2 = 1 + aleatorio.nextInt(6);
 arreglo[i] = n1+n2;
}
Contar();
}
public void Contar(){
int contador []= new int [14];
for(int i = 0;i<arreglo.length;i++){
for (int j = 0; j<contador.length;j++){
if (arreglo[i]==j)
    contador[j]++;
}
}
Imprimir (contador);
}
public void Imprimir (int b[]){
for (int i = 0;i < b.length;i++){
    System.out.printf("\nEl lanzamiento sumo\n", + b[i], i);
}    
}
}
