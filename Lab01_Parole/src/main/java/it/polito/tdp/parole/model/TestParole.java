package it.polito.tdp.parole.model;

public class TestParole {

	public static void main(String[] args) {
		
		Parole dizionario = new Parole();
		dizionario.addParola("ciao");
		dizionario.addParola("sono");
		dizionario.addParola("aaaaa");
		
		System.out.println(dizionario.getElenco());
		
		dizionario.remove("ciao");
		System.out.println(dizionario.getElenco());
		
		dizionario.reset();
		System.out.println(dizionario.getElenco());
		

	}

}
