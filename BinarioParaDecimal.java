package br.com.alef.tentando;

import java.io.IOException;


import javax.swing.JOptionPane;

public class BinarioParaDecimal {

	public static void main(String[] args) throws IOException {
		
		String binario = JOptionPane.showInputDialog(null, "Informe numero de 8 digitos binario", "Binario em decimal", 3);
		
		try {verifica��otamanho(binario); verifica��ocaracteres(binario);}
		catch (IllegalArgumentException  ex){
			
			JOptionPane.showMessageDialog(null,"Numeros digitados s�o diferentes de 8 digitos ou diferem de 0 e 1", "Erro na transforma��o",0);
		}
		
		if(verifica��otamanho(binario) && verifica��ocaracteres(binario) == true) JOptionPane.showMessageDialog(null, String.valueOf(Integer.parseInt(binario ,2)), "A transforma��o em decimal", 1);	
	}

	private static boolean verifica��ocaracteres(String binario) {
		for(int i =0; i ==7 ; i++) {
			char result = binario.charAt(i);
			if(result != 0) {
			return false;
			}else if(result != 1) {
			return false;
			}
		}
		return true;
		
	}

	private static boolean verifica��otamanho(String binario) {
		
		if(binario.length()>8) {
			throw new IllegalArgumentException();
		}else if(binario.length()<8) {
			throw new IllegalArgumentException();}
		return true;
		} 
		
	}
