package curs8;

public class StaticExample {

	public static String nume;
	public static String departament="QA";
	
	public static void main(String[] args) {
		
		//JVM incarca prima data static care nu este asociat cu ob ci cu clasa
		//JVM incarca obiectele(StaticExample persoana1= new StaticExample();

		//nume este asociat cu StaticExample nu cu obiectul
		
        
		//persoana1
		StaticExample persoana1= new StaticExample();
		persoana1.nume = "Oana ";
		System.out.println(persoana1.nume + departament);
		
		//persoana2
		StaticExample persoana2= new StaticExample();
		persoana2.nume = "Ioana ";
		System.out.println(persoana2.nume + departament);
		
		//persoana3
		departament= "DEV";
		StaticExample persoana3= new StaticExample();
		persoana3.nume = "Matei ";
		System.out.println(persoana3.nume + departament);
		
		System.out.println("------------------------------------------");
		System.out.println(persoana1.nume + departament);
		System.out.println(persoana2.nume + departament);
		System.out.println(persoana3.nume + departament);


	}

}
