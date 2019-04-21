/**
 * Este código serve para pegar a data do sistema. 
 * This code is used to pick up the system date.
 */
package com.spoticode.entity;

import java.util.Date;

/**
 * @author Alex
 * @version 1.0
 */
public class GetDate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Instancia objeto data, do pacote java.util
		// Instance date object, from the java.util package
		
		Date dataSistema = new Date();
		
		//Saida da data do sistema em modelagem padrão
		//Date of the system in standard modeling
		
		System.out.println(dataSistema.toString());
		
		
		

	}

}
