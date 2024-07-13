package it.esercizi.javaciclabile;

//import java.util.List;

public class Main {

	public static void main (String[] args) {
		System.out.println("Prova!");
		
		int [] arrayInt = {1,2,15,52,45,87};
	
		ElencoInteri elenco1 = new ElencoInteri(arrayInt);
		
	   int prova1 = elenco1.getElementoSuccessivo();
	   int prova2 = elenco1.getElementoSuccessivo();
	   int prova3 = elenco1.getElementoSuccessivo();
	   int prova4 = elenco1.getElementoSuccessivo();
	   int prova5 = elenco1.getElementoSuccessivo();
	   int prova6 = elenco1.getElementoSuccessivo();
//	   int prova7 = elenco1.getElementoSuccessivo();

		System.out.println(prova1);
		System.out.println(prova2);
		System.out.println(elenco1.hasAncoraElementi());
		System.out.println(prova3);
		System.out.println(prova4);
		System.out.println(elenco1.hasAncoraElementi());
		System.out.println(prova5);
		System.out.println(prova6);
//		System.out.println(prova7);
//		System.out.println(prova8);
		System.out.println(elenco1.hasAncoraElementi());
	
	}
	
	
}
