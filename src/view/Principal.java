package view;

import BibliLista.Lista;

public class Principal {

	public static void main(String[] args) {
		Lista <Integer> l = new Lista<>();
		try {
			l.addFirst(16);
			l.addFirst(4);
			l.addFirst(13);
			l.addFirst(2);
			l.addFirst(6);
			l.addFirst(7);
			l.addFirst(9);
			l.addFirst(12);
			l.addFirst(18);
			l.addFirst(5);
			l.addFirst(3);
			int tamanho = l.size();
			for (int i=0 ; i < tamanho ; i++ ) {
				System.out.print(l.get(i)+ " ");
			}
			System.out.println();
			for (int i = 0 ; i < tamanho ; i++) {
				int aux = l.get(tamanho-1);
				l.removeLast();
				l.add(aux, i);
			}
			for (int i=0 ; i < tamanho ; i++ ) {
				System.out.print(l.get(i)+ " ");
			}
			
		} catch (Exception e) {
			e.printStackTrace();

	}

}
}