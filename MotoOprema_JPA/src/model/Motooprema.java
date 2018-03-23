package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the MOTOOPREMA database table.
 * 
 */
@Table(name="MOTOOPREMA")
@Entity
@NamedQuery(name="Motooprema.findAll", query="SELECT m FROM Motooprema m")
public class Motooprema implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idopreme;

	private String naziv;

	private String opis;

	private String stanje;

	//bi-directional many-to-one association to Motokategorija
	@ManyToOne
	@JoinColumn(name="idkategorije")
	private Motokategorija motokategorija;

	public Motooprema() {
	}

	public int getIdopreme() {
		return this.idopreme;
	}

	public void setIdopreme(int idopreme) {
		this.idopreme = idopreme;
	}

	public String getNaziv() {
		return this.naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getOpis() {
		return this.opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public String getStanje() {
		return this.stanje;
	}

	public void setStanje(String stanje) {
		this.stanje = stanje;
	}

	public Motokategorija getMotokategorija() {
		return this.motokategorija;
	}

	public void setMotokategorija(Motokategorija motokategorija) {
		this.motokategorija = motokategorija;
	}

}