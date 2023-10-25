package ar.edu.poo2.tp10;

import java.util.ArrayList;
import java.util.List;

public class Cultivos {
	
	public double getGananciaTotalDeParcela(Parcela tipo) {
		return tipo.getGanancia(tipo);
		
	}
}
