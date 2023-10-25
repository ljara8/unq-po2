package ar.edu.poo2.tp10;

import java.util.ArrayList;
import java.util.List;

public class Dividida implements Parcela{
	private List<Parcela> cultivos = new ArrayList<Parcela>();

	@Override
	public double getGanancia(Parcela p) {
		return this.getGananciaTotalDeCultivos( p) / 4;
	}
	
	public double getGananciaTotalDeCultivos(Parcela p) {
		return this.getParcelasDeTipo(p).stream().mapToDouble(s->s.getGanancia(p)).sum();
	}
	
	public List<Parcela> getParcelasDeTipo(Parcela p){
		return cultivos.stream().filter(s-> s.esDeTipo(p)).toList();
	}

	@Override
	public boolean esDeTipo(Parcela p) {
		return p.esDeTipo(p);
	}
	
	

}
