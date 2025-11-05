🧩 Application de Gestion des Employés

📖 Description du projet

Ce projet est une application console en Java permettant de gérer les employés d’une entreprise.
Elle applique les principes de la Programmation Orientée Objet (POO) : encapsulation, classes, objets, méthodes statiques et polymorphisme.

L’application manipule un tableau d’objets Employe pour ajouter, modifier, supprimer, trier et afficher les employés.

🎯 Objectifs de l’application

L’application permet de :

1.	➕ Ajouter un nouvel employé
2.	✏️ Modifier un employé existant
3.	❌ Supprimer un employé
4.	📋 Afficher la liste des employés
5.	🔍 Rechercher un employé par nom ou poste
6.	💰 Calculer la masse salariale totale
7.	↕️ Trier les employés par salaire (croissant ou décroissant)

🧱 Structure du projet

🟩 Classe Employe

Représente un employé avec les attributs :

  •	int id

  •	String nom

  •	String poste

  •	double salaire


Méthodes principales :

  •	Constructeurs (par défaut et avec paramètres)

  •	Getters et Setters

  •	toString() → pour afficher les informations d’un employé

  •	compareParSalaire(Employe e1, Employe e2) → méthode statique pour comparer deux salaires

🟦 Classe GestionEmployes

Contient la logique principale et un menu interactif :

 •	Un tableau Employe[] (50 employés max)

 •	Méthodes statiques :

  o	ajouterEmploye()

  o	modifierEmploye()

  o	supprimerEmploye()

  o	afficherEmployes()

  o	rechercherEmploye()

  o	calculerMasseSalariale()

  o	trierEmployesParSalaire(boolean ordreCroissant)

💻 Exemple d’exécution

<img width="505" height="609" alt="image" src="https://github.com/user-attachments/assets/1c690374-4e03-4653-9172-6d1344bbdf81" />

🧠 Concepts utilisés

    •	Programmation Orientée Objet (POO)

    •	Méthodes et attributs statiques
 
    •	Tableaux d’objets (Employe[])

    •	Encapsulation (attributs privés + getters/setters)

    •	Expressions lambda pour le tri (Arrays.sort)

    •	Manipulation interactive avec Scanner
    

🧰 Technologies

    •	Langage : Java

    •	IDE : IntelliJ IDEA

    •	Version minimale : Java 8+

✨ Auteur

👩‍💻 Wissal Ezouine

Étudiante en développement informatique — projet réalisé dans le cadre d’un TP de Programmation Orientée Objet (Java).




