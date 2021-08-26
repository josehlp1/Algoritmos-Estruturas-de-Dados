package novalista;
import java.util.Iterator;

public class ListaEstatica <ClasseInformadaProgramador> {
	private ClasseInformadaProgramador[] info;
	private int tamanho;
	
	/*
	 * Criar uma lista vazia
	 * 
	 */
	
	public ListaEstatica() {
		info = (ClasseInformadaProgramador[]) new Object [10];
		tamanho = 0;
	}
	
	public void inserir(ClasseInformadaProgramador valor) {
		if(tamanho == info.length) {
			redimensionar();
		}
		
		info[tamanho] = valor;
		tamanho ++;
	}
	
	/*
	 * Provoca um pseudo redimensionamento de vetor info
	 * */	
	
	public void redimensionar() {
		
		ClasseInformadaProgramador[] novo = (ClasseInformadaProgramador[]) new Object[info.length + 10];
		
		for(int i=0; i<info.length; i++) {
			novo[i] = info[i];
		}
		
		info = novo;
		
		
	}
	
	/*
	 * Exive conteúdo da lista
	 * 
	 * */
	
	public void exibir() {
			for(int i=0; i<tamanho;i++) {
				System.out.println(info[i]);
			}
	}
	
	
	/*
	 * Procura na lista um determinado dado
	 * @param valor Dado a ser pesquisado
	 * @return posição do valor da lista. Caso não seja encontrado
	 * retorna -1.
	 * 
	 * */
	
	public int buscar(ClasseInformadaProgramador valor) {
		for(int i=0;i<tamanho; i++) {
			if(info[i].equals(valor)) {
				return i;
			}
		}
		
		return -1;
	}
	
	
	/*
	 * Retira um dado da lista
	 * @param valor Dado a ser removido
	 * */
	
	public void retirar(ClasseInformadaProgramador valor) {
		int posicao = buscar(valor);
		
		if(posicao > -1) {
			for(int i=posicao; i<tamanho-1; i++) {
				info[i] = info[i+1];
			}
			
			tamanho--;
		}
	}
	
	/*
	 * Limpa a estrutura de dados, de forma que a 
	 * lista esteja vazia
	 * */
	
	public void liberar() {
		info = (ClasseInformadaProgramador[]) new Object[10];
		tamanho = 0;
	}
	
	/*
	 * Retorna o dado armazenado numa determinada posição
	 * da lista
	 * @param posicao Posição do dado
	 * @return Dado localizado
	 * */
	
	public ClasseInformadaProgramador obterElemento(int posicao) {
		if(posicao >=0 &&(posicao < tamanho)) {
			return info[posicao];
		}else {
			throw new IndexOutOfBoundsException();
		}
	}
	
	
	
	/*
	 * Avalia se a lista está vazoa ou contem dados armazenados.
	 * @return true se a lista estiver vazia, senão false.
	 * */
	
	public boolean estaVazia() {
		return tamanho == 0;
	}
	
	
	/*
	 * Retorna o tamanho atual da lista, isto é, 
	 * a quantidade de dados já armazenados na estrutura de dado
	 * @return Quantidade de dados armazenados
	 * */
	
	public int getTamanho() {
		return tamanho;
	}
	
	/*
	 * Retorna string contendo os dados armazenados na lista
	 * */
	
	public String toString() {
		String resultado = "";
		
		for(int i=0; i<tamanho; i++) {
			if(i > 0) {
				resultado += ",";	
				resultado += info[i].toString();
			}
		}
		
		return resultado;
	} 
	
	
	
}
