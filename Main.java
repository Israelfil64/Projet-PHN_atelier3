public class Main {
    public static void main(String[] args){
        Ouvrier ouvrier = new Ouvrier("Yed NT", 18, "Plombier", 15, "A001");
        Macon macon = new Macon("Yed NT", 18, "Macon", 13, "A019");
        Architecte architecte =  new Architecte("Yed NT", 19, "Architecte", 7, "A004");
        Electricien electricien = new Electricien("Yed NT", 31, "Eletricienne", 14, "A003");
        Plombier plombier = new Plombier("Yed NT", 17, "Plombier", 3, "A015");

        System.out.println("L'ouvrier, c'est: "+ouvrier.getNom());
        System.out.println("L'ouvrier a: "+ouvrier.getAge()+" ans");
        System.out.println("L'ouvrier est un : "+ouvrier.getCategorie());
        System.out.println("L'ouvrier a: "+ouvrier.getAnciennete()+" ans d'expérience");
        System.out.println("Le matricule de l'ouvrier, c'est: "+ouvrier.getMatricule());
    }
}