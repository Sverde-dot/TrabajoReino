/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reino;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static metodos.Metodos.pedirNombreReino;
import static metodos.Metodos.salir;

/**
 *
 * @author Yo
 */
public class opciones {

    private int Aleatorio;
    private static int vidas=3;
    //arraylist
    ArrayList<metodos>listaReinos = new ArrayList();
    Reino.metodos met = new Reino.metodos();   
    
    public int  mostrarMenu(){        
    int option; 
    
    metodos met = new metodos();
    String menu = null;
    int repetir=0;
    String usuario=System.getProperty("user.name"); 
        String nombre = pedirNombreReino();
        int [] arrayOpciones = new int[15];               
    do{
      menu = "";   
      if (vidas !=0){
         System.out.println("VIDAS -> "+vidas+"\n");
         
      }else{salir();}          
                if ( (arrayOpciones[0]==0)){
                 menu = menu +"1) invertir en Materiales \n";
             }
                if (arrayOpciones[1]==0){
                 menu = menu +"2) recaudarImpuestos \n";
             }
                if (arrayOpciones[2]==0){
                 menu = menu +"3) conseguirRecursos \n";
             }
                if (arrayOpciones[3]==0){
                 menu = menu +"4) conseguirSeguridad \n";
             }
                if (arrayOpciones[4]==0){
                 menu = menu +"5) mejorarEjercito \n";
             }
                if (arrayOpciones[5]==0){
                 menu = menu +"6) invertirSeguridad \n";
             }
                if (arrayOpciones[6]==0){
                 menu = menu +"7) construirTorre \n";
             }
                if (arrayOpciones[7]==0){
                 menu = menu +"8) curarEnfermedad \n";
             }
                if (arrayOpciones[8]==0){
                 menu = menu +"9) obserquiarPueblo \n";
             }
                if (arrayOpciones[9]==0){
                 menu = menu + "10) cosechar \n";
             }
                if (arrayOpciones[10]==0){
                 menu = menu + "11) Guardar partida \n";
             }
                if (arrayOpciones[11]==0){
                 menu = menu + "12) Cargar partida \n";
             }
                    menu = menu + "13) Repetir \n";
                    menu = menu + "15) Salir \n";
            System.out.println(nombre);
            option = Integer.parseInt(JOptionPane.showInputDialog(menu)); 
            switch(option){
                case 1:     
                    if (arrayOpciones[0]==0){
                        met.invertirMateriales();
                    }
                    arrayOpciones[0]=1;
                    break;
                case 2:
                     if (arrayOpciones[1]==0){
                        met.recaudarImpuestos();
                     }
                    arrayOpciones[1]=1;
                    break;                
                case 3:
                    if (arrayOpciones[2]==0){
                        met.conseguirRecursos();
                    }
                    arrayOpciones[2]=1;
                    break;                
                case 4:
                    if (arrayOpciones[3]==0){
                        met.conseguirSeguridad();
                    }
                    arrayOpciones[3]=1;
                    break;
                case 5:    
                    if (arrayOpciones[4]==0){
                        met.mejorarEjercito();
                    }
                     arrayOpciones[4]=1;
                    break;
                case 6:
                    if (arrayOpciones[5]==0){
                        met.invertirSeguridad();
                    }
                     arrayOpciones[5]=1;
                    break;
                case 7:
                    if (arrayOpciones[6]==0){
                        met.construirTorre();
                    }
                     arrayOpciones[6]=1;
                    break;
                case 8:
                    if (arrayOpciones[7]==0){
                        met.curarEnfermedad();
                    }
                     arrayOpciones[7]=1;
                    break;
                case 9:
                    if (arrayOpciones[8]==0){
                        met.obserquiarPueblo();  
                    }
                     arrayOpciones[8]=1;
                    break;
                case 10:
                    if (arrayOpciones[9]==0){
                        met.cosechar();
                    }
                     arrayOpciones[9]=1;
                    break;
                case 11:
                    
                  if ("/".equals(System.getProperty("file.separator"))){                                   
                       File saveFichero = new File("/home/local/DANIELCASTELAO/"+usuario+"/Escritorio/save.txt");
                       
                       met.guardarPartida(saveFichero);                       
                       break; 
                  }
                  else{                   
                       File saveFicheroWindows = new File("C:\\Users\\"+usuario+"\\Desktop\\save.txt");                                                            
                       met.guardarPartida(saveFicheroWindows);                       
                       break;    
                  }
                     
                case 12:                   
                    if ("/".equals(System.getProperty("file.separator"))){                                       
                       File saveFichero = new File("/home/local/DANIELCASTELAO/"+usuario+"/Escritorio/save.txt"); 
                       System.out.println(saveFichero);                      
                       met.cargarPartida(saveFichero);                       
                       break; 
                  }
                  else{                                                                                                             
                       File saveFicheroWindows = new File("C:\\Users\\"+usuario+"\\Desktop\\save.txt");   
                       met.cargarPartida(saveFicheroWindows);                       
                       break;    
                  }
                case 13:                                        
                        for (int i=0;i<arrayOpciones.length;i++){
                        
                            arrayOpciones [i]=0;
                        }
                        vidas--;
                        met.setDinero(50);
                        met.setRecursos(50);
                        met.setEjercito(50);
                        met.setPueblo(50);
                        met.setSeguridad(50);
                    
                    break;
                case 15:   
                   salir();
                    
                default:
                    
                    System.out.println("numero incorrecto"); 
                }            
            met.toString();
            met.Fin();
        }while(15 !=option);
        listaReinos.add(met);
        return repetir;
    } 
    
    
    public void jugar(){
    
        int resultado =mostrarMenu();
    
        if (resultado == 1 ){        
          mostrarMenu();
      }  
}
}
