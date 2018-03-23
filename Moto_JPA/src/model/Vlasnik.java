package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the vlasnik database table.
 * 
 */
@Entity
@NamedQuery(name="Vlasnik.findAll", query="SELECT v FROM Vlasnik v")
public class Vlasnik implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idvlasnika;

	private String adresa;

	private String ime;

	private String prezime;

	private String telefon;

	//bi-directional many-to-one association to Motor
	@OneToMany(mappedBy="vlasnik")
	private List<Motor> motors;

	public Vlasnik() {
	}

	public int getIdvlasnika() {
		return this.idvlasnika;
	}

	public void setIdvlasnika(int idvlasnika) {
		this.idvlasnika = idvlasnika;
	}

	public String getAdresa() {
		return this.adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public String getIme() {
		return this.ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return this.prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getTelefon() {
		return this.telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public List<Motor> getMotors() {
		return this.motors;
	}

	public void setMotors(List<Motor> motors) {
		this.motors = motors;
	}

	public Motor addMotor(Motor motor) {
		getMotors().add(motor);
		motor.setVlasnik(this);

		return motor;
	}

	public Motor removeMotor(Motor motor) {
		getMotors().remove(motor);
		motor.setVlasnik(null);

		return motor;
	}

}