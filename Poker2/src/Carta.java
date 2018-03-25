
public class Carta {
	private int valor;
	private int palo;
	

	public Carta(int valor, int palo) {
		if(valor<1||valor>13){
			System.out.println("El valor de la carta solo puede ser de 1 a 13");System.exit(0);
		}
		if(palo<0||palo>3){
			System.out.println("El palo de la carta solo puede ser de 0 a 3");System.exit(0);
		}
		
		this.valor = valor;
		this.palo = palo;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public int getPalo() {
		return palo;
	}

	public void setPalo(int palo) {
		this.palo = palo;
	}
	
	public boolean compara(Carta cartaAComparar){
		if(valor==cartaAComparar.getValor()&&palo==cartaAComparar.getPalo()){return true;}else
		return false;
	}

	public String toString() {
		String[] valores={"As","Dos","Tres","Cuatro","Cinco","Seis","Siete","Ocho","Nueve","Diez","Sota","Reina","Rey"};
		String[] palos={"Corazones","Pikas","Diamantes","Tréboles"};
		
		
		return valores[valor-1]+" de "+palos[palo];
	}
	
	
	
}


