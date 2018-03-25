
public class Inicio {

	public static void main(String[] args) {
		
		
		Carta c1= new Carta(2,0);
		Carta c2= new Carta(3,0);
		System.out.println(c1.toString());

		System.out.println("Comparando la carta c1 con la carta c2");
		System.out.println(c1.compara((c2)));
		
		
		
	}

}
