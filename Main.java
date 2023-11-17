import java.util.*;

public class Main {
	
	Endereco e1 = new Endereco("Palhaco de monociclo", 
			666,
			"Das laranjeiras",
			"Pirapora do norte",
			"79080502");
	
	Endereco e2 = new Endereco("Jujuba de cera", 
			123,
			"Beco diagonal",
			"Hogwarts",
			"79080503");
	
	Endereco e3 = new Endereco("Casca do calcanhar", 
			456,
			"Microbrios microbianos",
			"Shlorp",
			"79080504");
	
	Endereco e4 = new Endereco("Pepe moreno", 
			654,
			"Orelhao da rua",
			"Macaubas",
			"79080505");
	
	Endereco e5 = new Endereco("Tacaca", 
			655,
			"Joelma do Calypso",
			"Almeirim",
			"79080506");
	
	Endereco e6 = new Endereco("Afonso Pena", 
			656,
			"Centro",
			"Campo Grande",
			"79080508");
	
	Aeroporto a1 = new Aeroporto("1", e4);
	Aeroporto a2 = new Aeroporto("2", e2);
	Aeroporto a3 = new Aeroporto("3", e5);
	
	CompanhiaAerea ca1 = new CompanhiaAerea("1",
			"Malaria Airlines");
	CompanhiaAerea ca2 = new CompanhiaAerea("2",
			"Emireides Airlines");
	CompanhiaAerea ca3 = new CompanhiaAerea("3",
			"Ar frança");
	
	Calendar origem1 = Calendar.getInstance();
	
	
	Voo v1 = new Voo("1",
			a1,
			a2,
			null,
			null,
			0);
	
	//continuar daqui
    
	
	
}
