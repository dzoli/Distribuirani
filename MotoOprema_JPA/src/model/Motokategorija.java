package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the MOTOKATEGORIJA database table.
 * 
 */
@Table(name="MOTOKATEGORIJA")
@Entity
@NamedQuery(name="Motokategorija.findAll", query="SELECT m FROM Motokategorija m")
public class Motokategorija implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idkategorije;

	private String naziv;

	//bi-directional many-to-one association to Motooprema
	@OneToMany(mappedBy="motokategorija")
	private List<Motooprema> motoopremas;

	public Motokategorija() {
	}

	public int getIdkategorije() {
		return this.idkategorije;
	}

	public void setIdkategorije(int idkategorije) {
		this.idkategorije = idkategorije;
	}

	public String getNaziv() {
		return this.naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public List<Motooprema> getMotoopremas() {
		return this.motoopremas;
	}

	public void setMotoopremas(List<Motooprema> motoopremas) {
		this.motoopremas = motoopremas;
	}

	public Motooprema addMotooprema(Motooprema motooprema) {
		getMotoopremas().add(motooprema);
		motooprema.setMotokategorija(this);

		return motooprema;
	}

	public Motooprema removeMotooprema(Motooprema motooprema) {
		getMotoopremas().remove(motooprema);
		motooprema.setMotokategorija(null);

		return motooprema;
	}

}