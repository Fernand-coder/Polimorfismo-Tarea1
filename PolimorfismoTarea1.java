/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismotarea1;

/**
 *
 * @author Fernando Padilla
 */

class DiagnosticoBateria{
    public void CapacidadCarga(){
        System.out.println("Capacidad de 100% con 12.65V");
    }
}

class BateriaCalcio extends DiagnosticoBateria{
    public void CapacidadCarga(){
        System.out.println("Capacidad de carga de 75%");
    }
}

class BateriaLitio extends DiagnosticoBateria{
    public void CapacidadCarga(){
         System.out.println("Capacidad de carga de 50%");
    }
}

class BateriaCeldaHumeda extends DiagnosticoBateria{
    public void CapacidadCarga(){
        System.out.println("Capacidad de carga de 80%");
    }
}

class BateriaVRL extends DiagnosticoBateria{
    public void CapacidadCarga(){
        System.out.println("Capacidad de carga de 65%");
    }
}

class BateriaCicloProfundo extends DiagnosticoBateria{
    public void CapacidadCarga(){
        System.out.println("Capacidad de carga de 78%");
    }
}

public class PolimorfismoTarea1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DiagnosticoBateria bateria1=new BateriaCalcio();
        DiagnosticoBateria bateria2=new BateriaLitio();
        DiagnosticoBateria bateria3=new BateriaCeldaHumeda();
        DiagnosticoBateria bateria4=new BateriaVRL();
        DiagnosticoBateria bateria5=new BateriaCicloProfundo();
        System.out.println("       UNIVERISIDAD DE LAS FUERZAS ARMADAS ESPE");
        System.out.println("MATERIA: PROGRAMACION");
        System.out.println("NRC: 7450");
        System.out.println("Carrea: Ingenieria Automotriz");
        
        System.out.println("------------------------------------\n");
        
        System.out.println("* La Bateria de Calcio tiene: ");
        bateria1.CapacidadCarga();
        System.out.println("* La Bateria de Litio tiene: ");
        bateria2.CapacidadCarga();
        System.out.println("* La Bateria de Celda Humeda tiene: ");
        bateria3.CapacidadCarga();
        System.out.println("* La Bateria VRL tiene: ");
        bateria4.CapacidadCarga();
        System.out.println("* La Bateria de Ciclo Profundo tiene: ");
        bateria5.CapacidadCarga();
    }
}
    
