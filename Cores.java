package Frameworks_exerc1_3bim;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Cores {
public static void main(String[] args) {
	ArrayList<String> cores = new ArrayList<String>();
	cores.add("Azul");
	cores.add("Vermelho");
	cores.add("Rosa");
	
	System.out.println(cores.toString());
	
	int linha = 1;
	for (String cor : cores) {
		System.out.println(linha + "-" + cor);
		linha++;
	}
	
	cores.add(0, "Azul");
	 System.out.println("Lista após adição na primeira posição: " + cores);
	 
	 cores.remove(2);
     System.out.println("Lista após remoção do terceiro elemento: " + cores);
		
     ArrayList<String> copiaCores = new ArrayList<>(cores);
     System.out.println("Lista original: " + cores);
     System.out.println("Cópia da lista: " + copiaCores);
     
     Collections.sort(cores);
     System.out.println("Lista ordenada: " + cores);
     
     Collections.reverse(cores);
     System.out.println("Lista invertida: " + cores);
	}

	
}
