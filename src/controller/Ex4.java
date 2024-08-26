package controller;
import javax.swing.JOptionPane;

import br.edu.fateczl.sort.*;

public class Ex4 {
	public Ex4() {
		super();
	}
	

	public void escolhasort(int[] vet) {
		Ordenacao m = new Ordenacao();
		String escolha = JOptionPane.showInputDialog("Digite Bubble Sort ou Merge Sort");
		if(escolha.contains("Bubble")) {
			m.bubbleSort(vet);
		} else {
			m.mergeSort(vet, 0, vet.length - 1);
		}
		for (int i = 0; i < vet.length; i++) {
			System.out.print(vet[i] + " ");
		}
		System.out.println(" ");
		System.out.println("-----------------------------------------");
	}
}
