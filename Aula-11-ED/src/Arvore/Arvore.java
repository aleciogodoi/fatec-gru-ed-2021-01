package Arvore;

public class Arvore {
	No raiz;
	Arvore() {
		raiz = null;
	}
	public void adiciona(int e) {
		No novo = new No(e);
		if (raiz == null) { // Verifica se �rvore est� vazia
			raiz = novo;    // inclui o N� na raiz
		} else {
			No aux1 = raiz, aux2 = raiz;
			while (aux1 != null) {
				aux2 = aux1;
				if (e == aux1.elemento)
					break;
				else if (e < aux1.elemento)					
					aux1 = aux1.esquerda;
				else 
					aux1 = aux1.direita;
			}
			if (e == aux2.elemento) 
				System.out.println("Elemento j� existe!!!");
			else {
				if (e < aux2.elemento)
					aux2.esquerda = novo;
				else
					aux2.direita = novo;
				System.out.println("Elemento inclu�do!!!");
			}
		}
	}
	
	public void adiciona2(int e) {
		No novo = new No(e);
		if (raiz == null) { // Verifica se �rvore est� vazia
			raiz = novo;    // inclui o N� na raiz
		} else {
			No aux1 = raiz, aux2 = raiz;
			while (aux1 != null) {
				aux2 = aux1;
				if (e < aux1.elemento)					
					aux1 = aux1.esquerda;
				else 
					aux1 = aux1.direita;
			}
			if (e < aux2.elemento)
				aux2.esquerda = novo;
			else
				aux2.direita = novo;
			System.out.println("Elemento inclu�do!!!");
		}
	}
}
