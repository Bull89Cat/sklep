package model;

import java.math.BigDecimal;

public abstract class Produkt extends Object {

	protected long id;
	protected BigDecimal cena;
	private String nazwa;
	
	private static int generator = 1;
	
	
	public Produkt(BigDecimal cena, String nazwa) {
		super();
		this.cena = cena;
		this.nazwa = nazwa;
		this.id = generator;
		generator ++;
	}
	public BigDecimal getCena() {
		return cena;
	}
	public void setCena(BigDecimal cena) {
		this.cena = cena;
	}
	public String getNazwa() {
		return nazwa;
	}
	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}
	public void set(int index, Produkt produkty) {
		
	}
	public abstract String dajRabat();
	
	public static void wyswietlIloscobiektow() {
		System.out.println(generator);
	}
}
	

