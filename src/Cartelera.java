/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author benja
 */
import java.util.*;
public class Cartelera {
    
      Pelicula car[];
    int pos;
    int cont;
    
    Cartelera()
    {
    car=new Pelicula[50];
    pos=-1;
    cont=0;
    }
    
    
    
    void GuardarPelicula(String N, String G, int A,String P)
    {
     Pelicula temp=new Pelicula(); 
      pos++;
      cont++;
      
      temp.setNombre(N);
      temp.setGenero(G);
      temp.setAnio(A);
      temp.setId(cont);
      temp.setPoster(P);
      car[pos]=temp;
      
    }
    
       void Buscar(int id){
    if(pos>=0){
        for(int x=0;x<=pos;x++){
          if (car[x].getId()==id)
              
          { System.out.println ("Resultado de la busqueda");
              System.out.println ("ID: "+car[x].getId());
            System.out.println ("Nombre: "+car[x].getNombre());
            System.out.println ("Genero: "+car[x].getGenero());
            System.out.println ("Anio de estreno: "+car[x].getAnio());
          }
          }//for
    }else
        System.out.println("La cartelera esta vacia");
    }//buscar

    
    
        void listar(){
      if(pos>=0){
        for(int x=0;x<=pos;x++){
          System.out.println("************LISTADO*************");
           System.out.println ("ID: "+car[x].getId());
           System.out.println ("Nombre: "+car[x].getNombre());
            System.out.println ("Genero: "+car[x].getGenero());
            System.out.println ("Anio de estreno: "+car[x].getAnio());
          
          }//for
    }else
        System.out.println("La cartelera esta vacia");
    }
        
        
  public Pelicula[] lista(){
return car;
}
        
}