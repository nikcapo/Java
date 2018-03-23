package taller;

public class Taller {

	private final int MAX_LAVADORAS = 20;
	private Lavadora[] lavadoras=new Lavadora[MAX_LAVADORAS];

	

	public void addLavadora(Lavadora lav) {
		
		for (int i = 0; i <lavadoras.length; i++) {
			// Nullpinter exception por resolver solucionado agregando new Lavadora[MAX_LAVADORAS]
			if (lavadoras[i] == null){
				lavadoras[i] = lav;
				System.out.println("Lavadora guardada en la posición " + i);
				break;
			}

		}

	}

	public void buscaLavadora(int id) {
		for (int i = 0; i < lavadoras.length; i++) {
			if(lavadoras[i]!=null&&lavadoras[i].getId()==id){
				System.out.println(lavadoras[i].toString());
			}
		}

	}

	public void borrarLavadora(int id) {
			for (int i = 0; i < lavadoras.length; i++) {
				if(lavadoras[i]!=null&&lavadoras[i].getId()==id){
					lavadoras[i]=null;
				}
			}
	}
	public void listaLavadoras() {
		// muestra la lista de lavadora
		for (int i = 0; i < lavadoras.length; i++) {
			if (lavadoras[i]!= null) {System.out.println(lavadoras[i].toString());
				
			}
		}

	}
}
