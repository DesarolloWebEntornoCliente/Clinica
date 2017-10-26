package es.altair.clinica.main;

import java.sql.Connection;
import java.util.Scanner;

import org.hibernate.Session;

import es.altair.clinica.bean.Paciente;
import es.altair.clinica.dao.CitaDAO;
import es.altair.clinica.dao.CitaImpDAOHibernate;
import es.altair.clinica.dao.Conexion;
import es.altair.clinica.dao.PacienteDAO;
import es.altair.clinica.dao.PacienteIMpDAOHIbernate;

public class App 
{
	
	private static Scanner sc = new Scanner(System.in);
	private static Scanner tecladoLine = new Scanner(System.in);
	private static Scanner tecladoInt = new Scanner(System.in);
	
	private static PacienteDAO pacienteDAO = new PacienteIMpDAOHIbernate();	
	private static CitaDAO citaDAO = new CitaImpDAOHibernate();

	
    public static void main( String[] args )
    {
        int opcion = 0;
        do {
    			menu();
    			opcion = sc.nextInt();
    			
    			switch (opcion) {
 				case 1:
 					Session sesion = Conexion.abrirConexion();
 						
 						Paciente p1 = new Paciente("Junior","65014877W","954878459");
 						
				        sesion.save(p1);
 				        
				        sesion.getTransaction().commit();
 					
 					Conexion.cerrarConexion(sesion);
 					
 					break;
 				case 2:
 					break;
 				case 3:
 					break;
 				case 4:
 					break;
 				case 5:
 					break;
 				case 6:
 					break;
 				case 7:
 					break;
 					
    			}
    			
    			
    	    	} while (opcion != 0);   
        
        System.out.println("Programa Finalizado !!!");
    			
    	    	sc.close();
    }
    
	private static void menu() {
		// Menu Principal
		System.out.println();
		System.out.println("╔════════════════════════╗");
		System.out.println("║     MENÚ PRINCIPAL     ║");
		System.out.println("╠════════════════════════╣");
		System.out.println("║ 1) Añadir  Paciente    ║");		
		System.out.println("║                        ║");
		System.out.println("║ 2) Añadir  Cita        ║");		
		System.out.println("║                        ║");
		System.out.println("║ 3) Actualizar Paciente ║");		
		System.out.println("║                        ║");
		System.out.println("║ 4) Actualizar Cita     ║");		
		System.out.println("║                        ║");
		System.out.println("║ 5) Borrar Paciente     ║");
		System.out.println("║                        ║");		
		System.out.println("║ 6) Borrar Cita         ║");
		System.out.println("║                        ║");
		System.out.println("║ 7) Mostrar Todo        ║");	
		System.out.println("║________________________║");
		System.out.println("║        0) Salir        ║");
		System.out.println("╚════════════════════════╝");
	}
    
}
