package model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="messagerie")
public class Message {
	@Id
	private int id;
	private int etudiant;
	private int chefDepart;
	private Date date;
	private Boolean vu;
	private String sujet;
	public int getChefDepart() {
		return chefDepart;
	}
	public void setChefDepart(int chefDepart) {
		this.chefDepart = chefDepart;
	}
	private String message;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getEtudiant() {
		return etudiant;
	}
	public void setEtudiant(int etudiant) {
		this.etudiant = etudiant;
	}
	
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Boolean getVu() {
		return vu;
	}
	public void setVu(Boolean vu) {
		this.vu = vu;
	}
	public String getSujet() {
		return sujet;
	}
	public void setSujet(String sujet) {
		this.sujet = sujet;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Message(int id, int etudiant, int enseignant, Date date, Boolean vu,
			String sujet, String message) {
		super();
		this.id = id;
		this.etudiant = etudiant;
		this.chefDepart = enseignant;
		this.date = date;
		this.vu = vu;
		this.sujet = sujet;
		this.message = message;
	}
	public Message() {
		super();
	}
	
	

}
