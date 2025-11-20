public class Ouvrier {
    private String nom;
    private int age;
    private String categorie;
    private int anciennete;
    private String matricule;

    public Ouvrier(String nom, int age, String categorie, int anciennete, String matricule){
        this.nom = nom;
        this.age = age;
        this.categorie = categorie;
        this.anciennete = anciennete;
        this.matricule = matricule;
    }

    public Ouvrier(){}

    public void setNom( String nom){
        this.nom = nom;
    }
    public void setAge( int age){
        this.age = age;
    }
    public void setCategorie( String categorie){
        this.categorie = categorie;
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
    public String getCategorie(){
        return categorie;
    }
    public int getAnciennete(){
        return anciennete;
    }
    public String getMatricule(){
        return matricule;
    }
}
