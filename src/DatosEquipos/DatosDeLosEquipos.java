/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatosEquipos;

/**
 *
 * @author Katty
 */
public class DatosDeLosEquipos {

    public DatosDeLosEquipos() {
        
    }        
    
    //----------------------Estados
    public String EstadosDeciados(String estado){
        String inicio="";
        if(estado.equalsIgnoreCase("Que Gane Local")){
            inicio="ganaLocal";
        }
        if(estado.equalsIgnoreCase("EMPATE")){ 
            inicio="empate";
        }
        if(estado.equalsIgnoreCase("Que Gane Visitante")){
            inicio="ganaVisitante";
        }
        
        return  inicio;
        
    }
    
    
    //----------------------equipos
     public String Plantilla(String num_jugadores){
         String jugadores="";
         int plantilla=Integer.parseInt(num_jugadores);
         if(plantilla<=20){
             jugadores="menosDe20";             
         }
         if(plantilla>20&&plantilla<=25){
             jugadores="entre20y25";
         }
         if(plantilla>25&&plantilla<=30){
             jugadores="entre25y30";
         }
         if(plantilla>30){
             jugadores="masDe30";
         }
         
         
         return jugadores;
     }
     
     public String SistemaTactico(String sistema){
         String tactica="";
         if(sistema.equalsIgnoreCase("otro sistema")){             
             tactica="diferentesTacticas";
         }
         if(sistema.equalsIgnoreCase("4 2 3 1")){
             tactica="s4231";
         }
         if(sistema.equalsIgnoreCase("4 3 3")){
             tactica="s433";
         }
         if(sistema.equalsIgnoreCase("4 4 2")){
             tactica="s442";
         }
         
         return tactica;
     }
   
     public String Presupuesto(String dinero){
         String resultados="";
         int presupuesto = Integer.parseInt(dinero);
         if(presupuesto<=60){
             resultados="bajo";
         }
         if(presupuesto>60&&presupuesto<=450){
             resultados="medio";
         }
         if(presupuesto>450){
             resultados="alto";
         }
         
         return resultados;
     }
     
     
    
}
