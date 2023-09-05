package test;
import modelo.Ceta;
import modelo.Contribuyente;
public class test {

	public static void main(String[] args) {
		Ceta ceta=new Ceta();
		Contribuyente c1= new Contribuyente(1,"romero", "juannn", 23456789, 'm',"20234567895" );
		try {
		System.out.println(c1.validarSexo ('m'));
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("sigue--->");
	}

}
