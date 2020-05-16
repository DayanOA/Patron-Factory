/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import Planes.PlanTelefonia;
import Planes.PlanTelefoniaFactory;

/**
 *
 * @author Usuario
 */
public class Cliente {

	public static void main(String[] args) {
    	int tipoPaquete = 75000;
   	 
    	PlanTelefoniaFactory factory = new PlanTelefoniaFactory();
    	PlanTelefonia paquete = factory.getPaquete(tipoPaquete);
    	//PlanTelefonia paquete =  new PlanTelefoniaFactory().getPaquete(tipoPaquete);
    	paquete.setTelefono("77587875");
    	String telefono = paquete.getTelefono();
   	 
    	System.out.println("Su numero" + telefono + "Tiene");
    	paquete.descripcionPaquete();
    
	}
    
}
