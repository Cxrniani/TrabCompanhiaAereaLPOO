import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

	public static void main(String args[]) {
		Endereco e1 = new Endereco("Palhaco de monociclo", 666, "Das laranjeiras", "Pirapora do norte", "79080502");

		Endereco e2 = new Endereco("Jujuba de cera", 123, "Beco diagonal", "Hogwarts", "79080503");

		Endereco e3 = new Endereco("Casca do calcanhar", 456, "Microbrios microbianos", "Shlorp", "79080504");

		Endereco e4 = new Endereco("Pepe moreno", 654, "Orelhao da rua", "Macaubas", "79080505");

		Endereco e5 = new Endereco("Tacaca", 655, "Joelma do Calypso", "Almeirim", "79080506");

		Endereco e6 = new Endereco("Afonso Pena", 656, "Centro", "Campo Grande", "79080508");

		Aeroporto a1 = new Aeroporto("1", e4);
		Aeroporto a2 = new Aeroporto("2", e2);
		Aeroporto a3 = new Aeroporto("3", e5);

		CompanhiaAerea ca1 = new CompanhiaAerea("1", "Malaria Airlines");
		CompanhiaAerea ca2 = new CompanhiaAerea("2", "Emireides Airlines");
		CompanhiaAerea ca3 = new CompanhiaAerea("3", "Ar frança");

		Calendar horigem1 = Calendar.getInstance();
		Calendar hdestino1 = Calendar.getInstance();
		Calendar horigem2 = Calendar.getInstance();
		Calendar hdestino2 = Calendar.getInstance();
		Calendar horigem3 = Calendar.getInstance();
		Calendar hdestino3 = Calendar.getInstance();
		Calendar horigem4 = Calendar.getInstance();
		Calendar hdestino4 = Calendar.getInstance();
		hdestino1.add(hdestino1.HOUR, 10); // mostra que o destino será após 10 horas da partida (só pra ficar mais realista) 
		hdestino2.add(hdestino2.HOUR, 15);
		hdestino3.add(hdestino3.HOUR, 13);
		hdestino4.add(hdestino4.HOUR, 12);
		horigem2.add(horigem2.HOUR, 5);
		horigem3.add(horigem2.HOUR, 7);
		horigem4.add(horigem2.HOUR, -4);

		Voo v1 = new Voo("1", a1, a2, horigem1, hdestino1, 20);
		Voo v2 = new Voo("2", a3, a2, horigem2, hdestino2, 20);
		Voo v3 = new Voo("3", a2, a1, horigem3, hdestino3, 20);
		Voo v4 = new Voo("4", a1, a3, horigem4, hdestino4, 20);

		Passageiro p1 = new Passageiro("Zeca Pagodinho", "12345678911", "1231241", e1, "6799922222", "18/12/2002",
				"102345");
		Passageiro p2 = new Passageiro("Fulano Silva", "87654321111", "567890", e2, "6799888888", "25/05/1990", "567890");
		Passageiro p3 = new Passageiro("Beltrano Souza", "56781234111", "987654", e3, "6799777777", "30/11/1985",
				"987654");
		Passageiro p4 = new Passageiro("Ciclano Oliveira", "34127856111", "456789", e4, "6799666666", "02/09/1995",
				"456789");
		Passageiro p5 = new Passageiro("Maria Santos", "78901234111", "654321", e5, "6799555555", "14/07/1978", "654321");
		Passageiro p6 = new Passageiro("João Pereira", "12309876111", "789012", e6, "6799444444", "20/03/2000", "789012");
		Passageiro p7 = new Passageiro("Ana Silva", "56789012111", "210987", e2, "6799333333", "05/08/1987", "210987");
		Passageiro p8 = new Passageiro("Carlos Rocha", "87654301111", "109876", e4, "6799222222", "10/02/1998", "109876");
		Passageiro p9 = new Passageiro("Mariana Oliveira", "23456789111", "543210", e5, "6799111111", "22/06/1983",
				"543210");
		Passageiro p10 = new Passageiro("Roberto Souza", "45678901111", "678901", e6, "6799000000", "08/04/1992",
				"678901");

		Passagem pass1 = new Passagem(v1, "1", p1, "Assento 1");
		Passagem pass2 = new Passagem(v2, "2", p2, "Assento 2");
		Passagem pass3 = new Passagem(v3, "3", p3, "Assento 3");
		Passagem pass4 = new Passagem(v4, "4", p4, "Assento 4");
		Passagem pass5 = new Passagem(v1, "5", p5, "Assento 5");
		Passagem pass6 = new Passagem(v2, "6", p6, "Assento 6");
		Passagem pass7 = new Passagem(v3, "7", p7, "Assento 7");
		Passagem pass8 = new Passagem(v4, "8", p8, "Assento 8");
		Passagem pass9 = new Passagem(v1, "9", p9, "Assento 9");
		Passagem pass10 = new Passagem(v2, "10", p10, "Assento 10");

		ArrayList<Passagem> array1 = new ArrayList<Passagem>();
		array1.add(pass1);
		array1.add(pass2);
		ArrayList<Passagem> array2 = new ArrayList<Passagem>();
		array2.add(pass3);
		array2.add(pass4);
		ArrayList<Passagem> array3 = new ArrayList<Passagem>();
		array3.add(pass5);
		array3.add(pass6);
		array3.add(pass7);
		ArrayList<Passagem> array4 = new ArrayList<Passagem>();
		array4.add(pass8);
		array4.add(pass9);
		array4.add(pass10);

		Bilhete<String> b1 = new Bilhete<String>("1", array1, 1100, ca1);
		Bilhete<String> b2 = new Bilhete<String>("2", array2, 1200, ca2);
		Bilhete<String> b3 = new Bilhete<String>("3", array3, 1300, ca3);
		Bilhete<String> b4 = new Bilhete<String>("4", array4, 1400, ca1);
		
		System.out.println("---------------BILHETE 1---------------");
		b1.imprimirBilhete();
		System.out.println("\n");
		System.out.println("---------------BILHETE 2---------------");
		b2.imprimirBilhete();
		System.out.println("\n");
		System.out.println("---------------BILHETE 3---------------");
		b3.imprimirBilhete();
		System.out.println("\n");
		System.out.println("---------------BILHETE 4---------------");
		b4.imprimirBilhete();
		
	}

}
