package taller;


public class Inicio {

	public static void main(String[] args) {
		
		Motor motor1= new Motor(001,"Mitsubishi","123-123");
		Motor motor2= new Motor(002,"Samsung","232-122");
		
		Lavadora lavadora1= new Lavadora(201,motor1,"Balay",433);
		Lavadora lavadora2= new Lavadora(210,motor2,"Samsung",533);
		Lavadora lavadora3= new Lavadora(211,motor1,"Edesa",633);
		Lavadora lavadora4= new Lavadora(300,motor2,"LG",431);
		Lavadora lavadora5= new Lavadora(301,motor1,"Samsung",423);
		Lavadora lavadora6= new Lavadora(310,motor2,"Whilpoorl",423);
		Lavadora lavadora7= new Lavadora(311,motor1,"LG",473);
		Lavadora lavadora8= new Lavadora(400,motor2,"Beko",333);
		Lavadora lavadora9= new Lavadora(410,motor1,"Beko",453);
		Lavadora lavadora10= new Lavadora(411,motor2,"Balay",233);
		Lavadora lavadora11= new Lavadora(500,motor1,"LG",443);
		Lavadora lavadora12= new Lavadora(501,motor2,"Candy",333);
		Lavadora lavadora13= new Lavadora(510,motor1,"Candy",234);
		Lavadora lavadora14= new Lavadora(511,motor2,"Daewoo",464);
		Lavadora lavadora15= new Lavadora(600,motor1,"Balay",768);
		Lavadora lavadora16= new Lavadora(601,motor2,"Balay",123);
		Lavadora lavadora17= new Lavadora(610,motor1,"Daewoo",223);
		Lavadora lavadora18= new Lavadora(611,motor2,"Samsung",454);
		Lavadora lavadora19= new Lavadora(700,motor1,"LG",473);
		Lavadora lavadora20= new Lavadora(701,motor2,"Edesa",833);
		
		//System.out.println(lavadora1.toString());
		
		Taller taller=new Taller();
		taller.addLavadora(lavadora1);
		taller.addLavadora(lavadora2);
		taller.addLavadora(lavadora3);
		taller.addLavadora(lavadora4);
		taller.addLavadora(lavadora5);
		taller.addLavadora(lavadora6);
		taller.addLavadora(lavadora7);
		taller.addLavadora(lavadora8);
		
		System.out.println("\nMostrando lista de lavadoras del 1 al 8...");
		taller.listaLavadoras();
		
		System.out.println("\nBuscando lavadora número 7...\n");
		taller.buscaLavadora(311);
		
		System.out.println("\nBorrando la lavadora número 7...");
		taller.borrarLavadora(311);
		
		System.out.println("\nMostrando lista de lavadoras...");
		taller.listaLavadoras();
		
	}

}
