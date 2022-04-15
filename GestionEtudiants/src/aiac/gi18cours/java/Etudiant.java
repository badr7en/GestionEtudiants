package aiac.gi18cours.java;

public class Etudiant {
	private int id;
	private String nom;
	private double note;
	public Etudiant(int A, String name){
		this.id=A;
		this.note=10.0;
		this.nom=name;
		}
	public String toString() {
		return "("+this.nom + ":"+ this.note+")";

}
}