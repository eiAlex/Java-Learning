/**
 * # JGetResolutionScreen
 * Esse codigo serve para pegar a resolução do sistema operacional.
 * This code is used to get the resolution of the operating system.
 */
package com.spoticode.entity;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 * @author Alex
 * @version 1.0
 */
public class javaResolution {

	public static void main(String[] args) {
		
		Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
		
		int largura = (int) tela.getWidth();
		int altura = (int) tela.getHeight();
		
		System.out.println("A sua resolução é: " +largura +"x"+ altura);
		
	}

}
