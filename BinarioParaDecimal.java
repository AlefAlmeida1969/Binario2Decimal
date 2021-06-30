package br.com.alef.tentando;

import java.io.IOException;


import javax.swing.JOptionPane;

public class BinarioParaDecimal {

	public static void main(String[] args) throws IOException {
		
		String binario = JOptionPane.showInputDialog(null, "Informe numero de 8 digitos binario", "Binario em decimal", 3);
		
		try {verificaçãotamanho(binario); verificaçãocaracteres(binario);}
		catch (IllegalArgumentException  ex){
			
			JOptionPane.showMessageDialog(null,"Numeros digitados são diferentes de 8 digitos ou diferem de 0 e 1", "Erro na transformação",0);
		}
		
		if(verificaçãotamanho(binario) && verificaçãocaracteres(binario) == true) JOptionPane.showMessageDialog(null, String.valueOf(Integer.parseInt(binario ,2)), "A transformação em decimal", 1);	
	}

	private static boolean verificaçãocaracteres(String binario) {
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

	private static boolean verificaçãotamanho(String binario) {
		
		if(binario.length()>8) {
			throw new IllegalArgumentException();
		}else if(binario.length()<8) {
			throw new IllegalArgumentException();}
		return true;
		} 
		
	}
