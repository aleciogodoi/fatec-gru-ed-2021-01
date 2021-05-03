package Arvore;

public class Teste {

	public static void main(String[] args) {
		Arvore arvore = new Arvore();
		arvore.adiciona(100);
		arvore.adiciona(26);
		arvore.adiciona(32);
		arvore.adiciona(25);
		arvore.adiciona(10);
		arvore.adiciona(10);
		arvore.adiciona(30);
		arvore.adiciona(12);
		arvore.adiciona(10);
		arvore.adiciona(9);
		arvore.adiciona(0);
		arvore.adiciona(-10);
		arvore.adiciona(-2);
		
		System.out.print("\nPré ordem: ");
		arvore.exibirPreOrdem(arvore.raiz);

		System.out.print("\nEm ordem: ");
		arvore.exibirEmOrdem(arvore.raiz);
		
		System.out.print("\nPós ordem: ");
		arvore.exibirPosOrdem(arvore.raiz);
	}

}
