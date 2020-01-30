package tienda_deportiva;

import java.util.Scanner;

public class Camiseta {
private String Categoria;
private int Numero;
private static final float PRECIOA = 0.10f;
private static final float PRECIOB = 0.05f;
private float PrecioCamisa;
private float TPagar;

Scanner scanner =new Scanner(System.in);
        

//---------------------------------------- set --------------------------------------------------
public void setCategoria(String Categoria){
    if(Categoria.equals("A")&&Categoria.equals("B")&&Categoria.equals("C")){
    this.Categoria = Categoria;
    }
    
}
public void setNumero(int Numero){
    this.Numero = Numero;    
}
public void setPrecioCamisa(float PrecioCamisa){
    this.PrecioCamisa = PrecioCamisa;
}
//---------------------------------------- get --------------------------------------------------
public String getCategoria(){
    return this.Categoria;
}
public int getNumero(){
    return this.Numero;
}
public float getPrecioCamisa(){
    return this.PrecioCamisa;
}
//---------------------------------------- constructor x defecto ------------------------------
public Camiseta(){
    this.Categoria = "A";
    this.Numero = 5;
}
//----------------------------------------Constructor parametrizado---------------------------
public Camiseta(String Categoria,int Numero, float PrecioCamisa){
    this.Categoria = "A";
    this.Numero = 3;
    this.TPagar = 11.00f;
}
//----------------------------------------Metodos--------------------------------------------------
 public void MostrarDatos(){
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>   TIENDA DEPORTIVA   <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<\n\n -------------------------------------------------------------------------------------------------------------------------\n");
       
        System.out.println("\tCategoria:\t\t"+Categoria+"\n\tNumero:\t\t\t"+Numero+"\t\t\t\t\n\tPrecio:\t\t\t"+TPagar+" \n\n -------------------------------------------------------------------------------------------------------------------------");
 } 
 
 public void IngresarDatos(){
     System.out.println("Ingrese la categoria del equipo: ");
     Categoria = scanner.nextLine();
     
     while(!Categoria.equals("A")&&!Categoria.equals("B")&&!Categoria.equals("C")){
         System.out.println("Ingrese un valor correcto...");
         Categoria = scanner.nextLine();
     }
     
     if (Categoria.equals("A")){
         TPagar =10.00f + (10.00f*PRECIOA);
     }
     if (Categoria.equals("B")){
         TPagar =10.00f + (10.00f*PRECIOB);
     }
     if (Categoria.equals("C")){
         TPagar = 10.00f;
     }
     System.out.println("Ingrese el Numero: ");

     Numero = scanner.nextInt();

     if (Numero==7 || Numero == 10){
         TPagar = TPagar + 5.00f;
     }
     MostrarDatos();
     Continuar();
 }
 public void Continuar(){
     String Continuar;
     System.out.println("Desea continuar?\n\t\t yes/no");
           Continuar = scanner.nextLine();
           while(!Continuar.equals("yes")&&!Continuar.equals("no")){
               System.out.println("Ingrese yes/no...");
               Continuar = scanner.nextLine();
 }
           if(Continuar.equals("yes")){
               IngresarDatos();
           }else{
               System.out.println("Programa Finalizado....");
           }
 }
}