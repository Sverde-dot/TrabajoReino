/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reino;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Yo
 */
public class metodos extends valores{
    
    public metodos(){        
    super();    
    } 
    //Comprobar si perdiste
    public void Fin (){
        if(Pueblo <= 0) {
            System.out.println("Mi rey nuestro pueblo nos ha abandonado ya no tenemos gente a la que gobernar");
            System.exit(0);
        } 
        if(Pueblo >= 100) {
            System.out.println("Mi lord el pueblo esta prosperando demasiado la opinion publica ya no le necesita");
            System.exit(0);
        }
        if(Dinero <= 0) {
            System.out.println("Señor las arcas del reino estan vacias a este paso no sobreviviremos");
            System.exit(0);
        } 
        if(Dinero >= 100) {
            System.out.println("Mi rey somos ricos hagamos un banquete en honor a usted \n unas horas mas tarde el rey se encuentra muerto debido al exeso de comida");
            System.exit(0);
        } 
        if(Ejercito <= 0) {
            System.out.println("Señor, no tenemos ejercito y nuestros enemigos estan a las puertas del castillo");
            System.exit(0);
        } 
        if(Ejercito >= 100) {
            System.out.println("Mi rey los altos cargos de nuestro ejercito se han rebelado contra usted quieren su cabeza");
            System.exit(0);
        }
        if(Recursos <= 0) {
            System.out.println("Mi lord nuestros recursos se acabaron y el pueblo se muere de hambre");
            System.exit(0);
        } 
        if(Recursos >= 100) {
            System.out.println("Mi rey las cosechas este año son geniales hagamos un banquete en su nombre \n unas horas mas tarde el rey se encuentra muerto debido al exeso de comida");
            System.exit(0);
        }
    }
    //1subir Pueblo bajar Recursos
    public void invertirMateriales(){                
        Pueblo = Pueblo +20;        
        Recursos = Recursos -10;      
    }
    //2Baja Pueblo sube Dinero
    public void recaudarImpuestos(){
        Pueblo = Pueblo -15;        
        Dinero = Dinero +15;                       
    }
    public void conseguirRecursos(){
        Recursos = Recursos +20;        
        Dinero = Dinero +15; 
        Pueblo = Pueblo -20;
    }
    //3Ejercito sube dinero baja
    public void conseguirSeguridad(){
        Ejercito = Ejercito +25;        
        Dinero = Dinero -15;                                     
    }
    //4Ejercito Sube Pueblo baja DInero baja
    public void mejorarEjercito(){                
        Ejercito = Ejercito +35;        
        Seguridad = Seguridad +5;
        Dinero = Dinero -30;                
    }
    //5Contruir seguridad
    public void invertirSeguridad(){        
        Ejercito = Ejercito +20;                        
        Recursos = Recursos -20;
    }
    //6Recursos sube dinero baja pueblo baja
    public void construirTorre(){
        Seguridad = Seguridad +25;        
        Ejercito = Ejercito +15;
        Dinero = Dinero -40;
        Recursos = Recursos -25;    
    }
    //7Enfermedad REcursos bajan dinero baja pueblo sube
    public void curarEnfermedad(){
        Pueblo = Pueblo +10;
        Recursos = Recursos -15;
        Dinero = Dinero -25; 
    }
     //8dinero bajan pueblo sube
    public void obserquiarPueblo(){
        Pueblo = Pueblo +10;       
        Dinero = Dinero -10;             
    }
    //9dinero bajan pueblo sube    
    public void cosechar(){
        Pueblo = Pueblo +10;       
        Dinero = Dinero -10;             
    }
    
    //Guardar partida
    public void guardarPartida(File fichero){
    PrintWriter esc = null;
    FileWriter fich;        
        try {
           fich = new FileWriter(fichero);
           esc = new PrintWriter(fich);
           esc.print(" Recursos :"+ Recursos 
                    +", Dinero :"+Dinero 
                    +", Seguridad :"+Seguridad
                    +", Pueblo :"+Pueblo
                    +", Ejercito :" + Ejercito);           
 
        } catch (FileNotFoundException ex) {
           ex.toString();
        }catch (IOException ex){
            ex.toString();           
        }finally{   
            esc.close();
                    }
        
    }     
    
    public void cargarPartida(File fich){
         Scanner sc = null;
         int cont=0;
    try {                
                sc= new Scanner(fich).useDelimiter(":");
                while(sc.hasNext()){                                           
                  String [] opciones =sc.next().split(",");                                 
                   if (cont==1){
                      Recursos = Integer.parseInt(opciones[0]);
                   }else if(cont==2){
                      Dinero = Integer.parseInt(opciones[0]);
                   }else if (cont==3){                           
                      Seguridad = Integer.parseInt(opciones[0]);
                   }else if(cont==4){
                      Pueblo = Integer.parseInt(opciones[0]);
                   }else if (cont==5){
                      Ejercito = Integer.parseInt(opciones[0]);                    
                   }
                   cont++;
                }
            } catch (FileNotFoundException ex) {

                System.out.println("Erro lectura palabra"+ex.toString());   
             }finally{
                sc.close();
             }
    }
}