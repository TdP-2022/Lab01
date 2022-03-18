package it.polito.tdp.parole.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Parole {
	
	private List<String> nomi;
		
	public Parole() {
		nomi = new ArrayList<String>();
	}
	
	public void addParola(String p) {
		nomi.add(p);
	}
	
	public List<String> getElenco() {
		List<String> elenco = new ArrayList<String>();
		for(String s : nomi) {
			elenco.add(s);
		}
		Collections.sort(elenco);
		return elenco;
	}
	
	public void reset() {
		nomi = new ArrayList<String>();
	}
	
	public void remove(String parola) {
		nomi.remove(parola);
	}

}
