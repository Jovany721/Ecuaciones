
package com.mycompany.proyecto_precalculo;

import java.util.ArrayList;

public  class Operaciones {

  
public double obtener_x( ArrayList<Character> ecuacion){
    double x =0;
    char signo=' ';
    char igual=' ';
    String x_texto= "";
 
    for (int i = 0; i < ecuacion.size(); i++) {
        
            if(ecuacion.get(i)=='x')
            {//////
                
                
            String cc =signo+x_texto;//+4
            
            if (signo=='+'&& igual=='=') {
            String c ='-'+x_texto;
            x=x+ Double.parseDouble(c);
            break;}
            
            
            if(signo=='-'&&igual=='=') { 
             String c ='+'+x_texto;
             x= x+Double.parseDouble(c);
             break;}
            
            
             if (signo=='='&&igual=='=') {
             String c ='-'+x_texto;
             x=x+ Double.parseDouble(c);
             break;}
             
            else{
            x= Double.parseDouble(cc)+x;
            x_texto="";}
             
             
             }////////
        
        
         
       if (ecuacion.get(i)=='+') {
       signo='+';
       x_texto="";}
        
       if (ecuacion.get(i)=='-') {
       signo ='-';
       x_texto=""; }
        
       if (ecuacion.get(i)=='=') {
       signo='=';
       igual='=';
       x_texto=""; }

       if(Character.isDigit(ecuacion.get(i)) ){
           
       x_texto = x_texto+ ecuacion.get(i);} 
      
        
        
    }
  

return x;}

public double [] obtener_lado_iz( ArrayList<Character> ecuacion){

 //ArrayList<Character>ecuacion=new ArrayList<>();
    double [] retorno= new double[2];
    double suma = 0;
    double resta=0;
    boolean s =true;
    boolean ss=true;
    String num= "";
    
  //  for (int i = 0; i < ecuacion_e.length; i++) { ecuacion.add(ecuacion_e[i]);  }
    
    
    for (int i = ecuacion.size()-1; i >= 0; i--) {
        
        
        if (ecuacion.get(i)=='='){
        ss=false;}
        
        
        
        if (ss) {
         if (ecuacion.get(i)=='x') { 
         s=false;
         num=""; }
         
        if (ecuacion.get(i)=='+'  && s || ecuacion.get(i)=='=' ) {
            suma = suma+Double.parseDouble(num);
            num="";}  
     
        if (ecuacion.get(i)=='-'&&s) {
                resta = resta+Double.parseDouble(num);
            num="";}
        
        if(ecuacion.get(i)=='+'||ecuacion.get(i)=='='|| ecuacion.get(i)=='-'){
        num="";
        s=true;}

         if(Character.isDigit(ecuacion.get(i))){
          num = ecuacion.get(i)+num;} 
        
        }//if ss
}//for
    
 
    
    

        
   
        retorno[0]=resta;
        retorno[1]=suma;
    
        return retorno;}

public double [] obtener_lado_de( ArrayList<Character> ecuacion){
 //ArrayList<Character>ecuacion=new ArrayList<>();
 
    double [] retorno= new double[2];
    double suma= 0;
    double resta=0;
    boolean s =true;
    boolean ss= false;
    String num= "";
    

   // for (int i = 0; i < ecuacion_e.length; i++) { ecuacion.add(ecuacion_e[i]);  }
    
    for (int i = ecuacion.size()-1; i >= 0; i--) {
    
        if (ss) {
        
            
         if (ecuacion.get(i)=='x') { 
         s=false;
         num="";}
         
        
        if (ecuacion.get(i)=='+'  &&   s) {
            suma = suma+Double.parseDouble(num);
            num="";}  
   
        
        if (ecuacion.get(i)=='-'   &&   s) {
            resta = resta+Double.parseDouble(num);
            num="";}
        
        
        
        
     
        if(ecuacion.get(i)=='+'||ecuacion.get(i)=='='|| ecuacion.get(i)=='-'){
        num="";
        s=true;  }
        

         if(Character.isDigit(ecuacion.get(i))){
             
         num = ecuacion.get(i)+num;}
               
               
               
               
               
               
           }//if ss
           
             if (ecuacion.get(i)=='=') { 
                 ss=true;}   
 }//for
       
      
            retorno[0]=resta;
            retorno[1]=suma;
           return retorno;}

public ArrayList<Character> ecuacion(char [] ecuacion_e){
  ArrayList<Character>ecuacion=new ArrayList<>();
  boolean f = true;
  boolean f2 = false;
  boolean great = false;
  for (int i = 0; i < ecuacion_e.length; i++) { ecuacion.add(ecuacion_e[i]);  }
    for (int i = 0; i < ecuacion.size(); i++) {
        
        if (ecuacion.get(i)=='-'&&f) {
            f=false;    
        }
        if (ecuacion.get(i)!='-'&& f) {
           
             ecuacion.add(i, '+');
             f=false;}
        
        if (ecuacion.get(i)=='=') {
            f2=true;
            continue;
        }
         if (ecuacion.get(i)=='-'&&f2) {
         f2=false;
            
        }
        if (ecuacion.get(i)!= '-' && f2) {
            
            ecuacion.add(i, '+');
         
            f2 = false;
            
        }
              
}
return ecuacion;

}






















public void Desigualdades( char[] ecuacion_2){

ArrayList<Character> ecuacion = new ArrayList<>();
boolean great =false;

    for (int i = 0; i < ecuacion_2.length; i++) {ecuacion.add(ecuacion_2[i]);}
    
    
    for (int i = ecuacion.size()-1; i >= 0; i--) {
        
    
          if (great && ecuacion.get(i)=='+'||ecuacion.get(i)=='-') {
              
              ecuacion.add(i+1, '1');
              great= false;
            
        }
        if (ecuacion.get(i)=='x') {
            great = true;
            
        }
      
        
        
        
        
        
    }
    
    
    for (int i = 0; i < ecuacion.size(); i++) {
        
            System.out.println(ecuacion.get(i));
        
        
        
        
    }
    






}
}
