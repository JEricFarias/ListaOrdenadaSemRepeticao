package listaOrdenadaSemRepeticao;

public class App {
	public static void main(String[] args){
		System.out.print("test test\n");
	    ListaOrdenadaSemRepeticao v = new ListaOrdenadaSemRepeticao();
	    System.out.print("test test1\n");
	    v.add(5);
	    System.out.print("test test2\n");
	    v.add(2);
	    System.out.print("test test3\n");
	    v.add(4);
	    System.out.print("test test4\n");
	    v.add(6);
	    System.out.print("test test5\n");
	    v.add(1);
	    System.out.print("test test6\n");
	    v.add(3);
	    System.out.print("test test7\n");
	    
	    for(int i = 1; i < 100; i++){
	        System.out.println(v.get(i));
	    }

	}
}
