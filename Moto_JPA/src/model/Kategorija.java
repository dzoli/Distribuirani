package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the kategorija database table.
 * 
 */
@Entity
@NamedQuery(name="Kategorija.findAll", query="SELECT k FROM Kategorija k")
public class Kategorija implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idkategorije;

	private String nazivkategorije;

	//bi-directional many-to-one association to Motor
	@OneToMany(mappedBy="kategorija")
	private List<Motor> motors;

	public Kategorija() {
	}

	public int getIdkategorije() {
		return this.idkategorije;
	}

	public void setIdkategorije(int idkategorije) {
		this.idkategorije = idkategorije;
	}

	public String getNazivkategorije() {
		return this.nazivkategorije;
	}

	public void setNazivkategorije(String nazivkategorije) {
		this.nazivkategorije = nazivkategorije;
	}

	public List<Motor> getMotors() {
		return this.motors;
	}

	public void setMotors(List<Motor> motors) {
		this.motors = motors;
	}

	public Motor addMotor(Motor motor) {
		getMotors().add(motor);
		motor.setKategorija(this);

		return motor;
	}

	public Motor removeMotor(Motor motor) {
		getMotors().remove(motor);
		motor.setKategorija(null);

		return motor;
	}

}