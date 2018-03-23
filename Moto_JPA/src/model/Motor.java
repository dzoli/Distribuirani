package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the motor database table.
 * 
 */
@Entity
@NamedQuery(name="Motor.findAll", query="SELECT m FROM Motor m")
public class Motor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idmotora;

	private float cena;

	private String godiste;

	private String marka;

	private String model;

	private String stanje;

	//bi-directional many-to-one association to Vlasnik
	@ManyToOne
	@JoinColumn(name="IDVLASNIKA")
	private Vlasnik vlasnik;

	//bi-directional many-to-one association to Kategorija
	@ManyToOne
	@JoinColumn(name="IDKATEGORIJE")
	private Kategorija kategorija;

	public Motor() {
	}

	public int getIdmotora() {
		return this.idmotora;
	}

	public void setIdmotora(int idmotora) {
		this.idmotora = idmotora;
	}

	public float getCena() {
		return this.cena;
	}

	public void setCena(float cena) {
		this.cena = cena;
	}

	public String getGodiste() {
		return this.godiste;
	}

	public void setGodiste(String godiste) {
		this.godiste = godiste;
	}

	public String getMarka() {
		return this.marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getStanje() {
		return this.stanje;
	}

	public void setStanje(String stanje) {
		this.stanje = stanje;
	}

	public Vlasnik getVlasnik() {
		return this.vlasnik;
	}

	public void setVlasnik(Vlasnik vlasnik) {
		this.vlasnik = vlasnik;
	}

	public Kategorija getKategorija() {
		return this.kategorija;
	}

	public void setKategorija(Kategorija kategorija) {
		this.kategorija = kategorija;
	}

}