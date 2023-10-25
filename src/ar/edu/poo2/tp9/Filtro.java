package ar.edu.poo2.tp9;

import java.util.ArrayList;
import java.util.List;

public abstract class Filtro{
	
	private List<WikipediaPage> wiki = new ArrayList<WikipediaPage> ();
	
	public abstract List<WikipediaPage> getSimilarPages(WikipediaPage page, List<WikipediaPage> wiki);
}
