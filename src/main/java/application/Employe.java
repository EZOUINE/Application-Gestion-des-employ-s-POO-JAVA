package application;

public class Employe {
    //Déclaration des variables
    private int id;
    private String nom;
    private String poste;
    private Double salaire;
    //Constructeurs avec tous les paramétres
    public Employe(int id, String nom, String poste, Double salaire) {
        this.id = id;
        this.nom = nom;
        this.poste = poste;
        this.salaire = salaire;
    }
    //Constructeurs sans paramétres
    public Employe() {
    }
    //Getters & Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }

    public Double getSalaire() {
        return salaire;
    }

    public void setSalaire(Double salaire) {
        this.salaire = salaire;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", poste='" + poste + '\'' +
                ", salaire=" + salaire +
                '}';
    }
    //Méthode statique pour comparer 2 employes par leur salaire
    public static int compareParSalaiare(Employe e1, Employe e2){
        return Double.compare(e1.getSalaire(),e2.getSalaire());
    }
}
