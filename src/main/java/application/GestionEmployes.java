package application;

import javax.print.DocFlavor;
import java.lang.classfile.instruction.SwitchCase;
import java.util.Arrays;
import java.util.Scanner;

public class GestionEmployes {
    public static int capacité = 50;
    public static Employe[] employes = new Employe[capacité];
    public static int taille=0;
    public static Scanner sc = new Scanner(System.in);
    public static void printMenu(){
        System.out.println("--------Menu Gestion des employés------");
        System.out.println("1.Ajouter un employé");
        System.out.println("2.Modifier un employé");
        System.out.println("3.Supprimer un employé");
        System.out.println("4.Afficher un employé");
        System.out.println("5.Rechercher un employé");
        System.out.println("6.Calculer la masse salariale");
        System.out.println("7. Trier les employés par salaire");
        System.out.println("0.Quitter");

    }
    public static void ajouterEmploye(Employe employe){

            if (taille<capacité){
                employes[taille++]= employe;
                System.out.println("Employé ajouté avec succés");
            } else {
                System.out.println("impossible d'ajouter un employé, le tableau est plein!");
                return;
            }
    }
    public static void modifierEmploye(int id, String NVnom, String NVposte,double NVsalaire){
        for(int i=0; i<taille;i++){
            if(employes[i].getId()==id){
                employes[i].setNom(NVnom);
                employes[i].setPoste(NVposte);
                employes[i].setSalaire(NVsalaire);
                System.out.println("Employé modifié avec succés !");
                return;
            }
        System.out.println("le ID saisi n'existe pas !");
        }

    }
    public static void supprimerEmploye(int id){
     for (int i=0;i<taille;i++){
         if (employes[i].getId()==id){
             for (int j = 0; j<taille-1; j++){
                 employes[i]=employes[j+1];
             }
         }taille--;
         System.out.println("Employé supprimé avec succés !");
         return;
     }
        System.out.println("Employé introuvable!");
    }
    public static void afficherEmployes(){
        if (taille==0){
            System.out.println("Aucun employés est enregistrés");
            return;
        }
        System.out.println("\n-------Liste des employés-------");
        for (int i=0; i<taille;i++){
            System.out.println(employes[i]);
        }
    }
    public static void rechercherEmploye(String nomRech){
        boolean trouver = false;
        for(int i=0; i<taille;i++){
            if(employes[i].getNom().equalsIgnoreCase(nomRech)){
                System.out.println(employes[i]);
                trouver=true;
            }
            }if (!trouver){
            System.out.println("l'employé n'existe pas !");
        }
    }
    public static double calculerMasseSalariale() {
     double somme=0;
     for (int i=0;i<taille;i++){
         somme+=employes[i].getSalaire();
     }
     return somme;
    }
    public static void trierEmployeParSalaire(boolean ordreCroi){
            Arrays.sort(employes,0,taille,(e1,e2) ->{
                int cmp =Employe.compareParSalaiare(e1,e2);
                return ordreCroi? cmp : -cmp;
            });
            afficherEmployes();
    }

    public static void main(String[] args) {
       int choix;
       do {
           printMenu();
           System.out.println("Saisir votre choix :");
           choix = sc.nextInt();
           sc.nextLine();
           switch (choix) {
               case 1: {
                   System.out.println("Entrez le ID, le nom , le poste et le salaire de l'employé");
                   int id = sc.nextInt();
                   sc.nextLine();
                   String nom = sc.nextLine();
                   String poste = sc.nextLine();
                   double salaire = sc.nextDouble();
                   ajouterEmploye(new Employe(id, nom, poste, salaire));
                   break;
               }
               case 2: {
                   System.out.println("Entrer le ID d'employé à modifier");
                   int id = sc.nextInt();
                   sc.nextLine();
                   System.out.println("entrez le nouveau nom, poste et salaire");
                   String NVnom = sc.nextLine();
                   String NVposte = sc.nextLine();
                   double NVsalaire = sc.nextDouble();
                   modifierEmploye(id, NVnom, NVposte, NVsalaire);
                   break;
               }
               case 3: {
                   System.out.println("Entrer le ID d'employé à supprimer");
                   int id = sc.nextInt();
                   supprimerEmploye(id);
                   break;
               }
               case 4: {
                   afficherEmployes();
                   break;
               }
               case 5: {
                   System.out.println("Entrer le nom d'employé à rechercher");
                   String nomRech = sc.nextLine();
                   rechercherEmploye(nomRech);
                   break;
               }
               case 6:
                   System.out.println("La masse salariale totale = " + calculerMasseSalariale());
                   break;


               case 7: {
                   System.out.println("Trier par ordre croissant (true/false) :");
                   boolean ordre = sc.nextBoolean();
                   trierEmployeParSalaire(ordre);
                   break;
               }
               case 0:
                   System.out.println(" FIN DU PROGRAMME.");
               default:
                   System.out.println("Choix invalide !");
           }

       }while (choix != 0) ;

    }
}



