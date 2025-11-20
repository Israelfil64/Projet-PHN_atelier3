public class Electricien {
    private String nom;
    private int age;
    private String specialite;
    private int anciennete;
    private String matricule;

    public Electricien(String nom, int age, String specialite, int anciennete, String matricule){
        this.nom = nom;
        this.age = age;
        this.specialite = specialite;
        this.anciennete = anciennete;
        this.matricule = matricule;
    }
    public Electricien(){}

    public void setNom( String nom){
        this.nom = nom;
    }
    public void setAge( int age){
        this.age = age;
    }
    public void setSpecialite( String specialite){
        this.specialite = specialite;
    }
    public void setAnciennete( int anciennete){
        this.anciennete = anciennete;
    }
    public void setMatricule( String matricule){
        this.matricule = matricule;
    }

    public String getNom(){
        return nom;
    }
    public int getAge(){
        return age;
    }
    public String getSpecialite(){
        return specialite;
    }
    public int getAnciennete(){
        return anciennete;
    }
    public String getMatricule(){
        return matricule;
    }
}
