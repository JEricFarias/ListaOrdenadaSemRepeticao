package listaOrdenadaSemRepeticao;

//import java.util.ArrayList;

public class ListaOrdenadaSemRepeticao {
	 private final int[] vet;
	    private int index;
	    
		public ListaOrdenadaSemRepeticao(){
	            vet = new int[100];
	            this.index = 0;
		}
		
		public void add(int a){
	            if(isUnique(a)){
	                vet[index] = a;
	                ++index;
	                ordenar();
	            }else {
	                System.out.println("Avalor repetido informe um valor único");
	            }
		}
	        
	        public int get(int i){
	            return this.vet[i];
	        }
	        
	        private void ordenar(){
	            int i = -1;
	            for(int j = 1; j < 100; j++){
	            	System.out.println(vet.length);
	                int aux = vet[j];
	                i = j - 1;
	                System.out.println("j = "+j);
	                while(i > -1 && vet[i] > aux){
	                    vet[j] = vet[i];
	                    System.out.println("i = "+i);
	                    --i;
	                }
	                vet[i + 1] = aux;
	            }
	        }
	        
	        private boolean isUnique(Integer a){
	            boolean result = true;
	            for(int i : vet){
	                if(i == a){
	                    result = false;
	                }
	            }
	            return result;
	        }
}
