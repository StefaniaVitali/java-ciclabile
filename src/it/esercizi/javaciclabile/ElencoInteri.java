package it.esercizi.javaciclabile;

/*
 * Vogliamo realizzare una classe che contenga un elenco di interi x e 
 * che ci permetta di ciclarli (dal primo all’ultimo).
Dovrà offrire due metodi :
- int getElementoSuccessivo() (che restituisce il prossimo elemento rispetto all’ultima volta che 
è stato invocato. Cioè la prima volta restituisce il primo elemento, la seconda volta il secondo, …)
- boolean hasAncoraElementi() (che deve restituire true se ci sono ancora elementi da restituire)
La classe deve avere un costruttore che prende come parametro un array di interi 
(che sarà l’elenco che viene gestito internamente)
Internamente alla classe vogliamo mantenere l’elenco di interi come array, no ArrayList o simili. x
Bonus :
prevedere anche un costruttore che non prenda parametri e un metodo addElemento che permetta di aggiungere un nuovo intero all’elenco da ciclare.
Buon lavoro!
 * 
 */

public class ElencoInteri {
	
	private int [] intArray;
	private int index = 0;	
	private int totaleNumeri;
	

	public ElencoInteri (int [] intArray) {
		this.intArray= intArray;
		this.totaleNumeri= intArray.length;
	}
	
	//GETTER E SETTER
	

	public int getIndex() {
		return index;
	}

	public int getTotaleNumeri() {
		return totaleNumeri;
	}

	public int [] getIntArray() {
		return intArray;
	}

	public void setIntArray(int [] intArray) {
		this.intArray = intArray;
	}
	
	//METODO getElementoSuccessivo
	//int getElementoSuccessivo() (che restituisce il prossimo elemento rispetto all’ultima volta che 
    // è stato invocato. Cioè la prima volta restituisce il primo elemento, la seconda volta il secondo, …)
	
	public int getElementoSuccessivo () {				
		int elementoArray = index;
	    index++;		
		return elementoArray;	
	
	}	
	
	//METODO hasAncoraElementi()
	
	public boolean hasAncoraElementi() {
		return index < intArray.length;
			
	}

}

//COMMENTO CORREZIONE:
//servono 3 elementi per far funzionare il codice
// indice e il numero degli elementi dell'array
