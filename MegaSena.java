package Frameworks_exerc1_3bim;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class MegaSena {
	public static void main(String[] args) {
   
        ArrayList<Integer> sorteio = new ArrayList<>();
        Random random = new Random();
        
        while (sorteio.size() < 6) {
            int numero = random.nextInt(60) + 1;
            if (!sorteio.contains(numero)) {
                sorteio.add(numero);
            }
        }
        
        ArrayList<Integer> sorteioCollections = new ArrayList<>();
        ArrayList<Integer> numerosDisponiveis = new ArrayList<>();
        
        for (int i = 1; i <= 60; i++) {
            numerosDisponiveis.add(i);
        }
        
        Collections.shuffle(numerosDisponiveis);
        for (int i = 0; i < 6; i++) {
            sorteioCollections.add(numerosDisponiveis.get(i));
        }
        
        Collections.sort(sorteio);
        Collections.sort(sorteioCollections);
        
        System.out.println("Sorteio usando Random: " + sorteio);
        System.out.println("Sorteio usando Collections: " + sorteioCollections);
        
	}
}
