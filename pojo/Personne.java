public class Personne{
	private String nom,prenom;
	private int age;
	public Personne(String nom,String prenom,int age){
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	public String getNom(){
		return this.nom;
	}
	public void setNom(String nom){
		this.nom = nom;
	}
	public String getPrenom(){
		return this.prenom;
	}
	public void setPrenom(String prenom){
		this.prenom = prenom;
	}
	public int getAge(){
		return this.age;
	}
	public void setAge(int age){
		this.age = age;
	}
}