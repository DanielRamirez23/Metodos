
package metodos;



public class MisMetodos  {
  
  public  void main(String[] args) {
        // TODO code application logic here
    
    imprimir(2, 3);
    imprimir(5, 6);
    imprimir(8, 9);
    imprimir(3, 83);
    imprimir(92, 12);
    
    int resultado=sumar(1, 2);
    System.out.println(
            concatenar("El resultado es", "" +resultado));
    
    int resultado2= sumar(sumar(1, 2), 7);
   
    boolean mayor= comprobar(resultado2);
    
    if(comprobar(resultado2))
        System.out.println("Es mayor");
    else
        System.out.println("No es mayor");
   
    }      
//Metdos Estaticos:Estan presente durante todo el programa
    //Metodos no Estaticos:No estan presentes en la creacion del programa solamente al compilar
   //El metodo se ejecuta sin regresar ningun valor
    public  void imprimir(/*Parametros*/int n1, int n2) {
        int resultado=n1+n2;
        System.out.println("Suma: "+ resultado);
   
    }
    //El metodo se ejucuta y regresa un int
    public  int sumar(int n1,int n2) {
        //return termina el metodo y debe regresar una respuesta del mismo tió que el metodo
        return n1 + n2;
    }
    
    
    public String concatenar (String cadena1, String cadena2){
        return cadena1.concat(" ".concat(cadena2));
    }
    
    
    public  String separar(String cadena1, String cadena2) {
    
        return cadena1.concat(" ").concat(cadena2);
    
    }
    public  boolean comprobar(int n){
        return n > 10;
    }
    
            
    } 
  
          
     
    
    
          

