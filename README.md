# Activité Pratique N°3 - Spring MVC, Spring Data JPA, Thymeleaf

## Partie 1 : Développement de l'application de gestion des patients
[Vidéo de référence](https://www.youtube.com/watch?v=jDm-q-jEbiA)

### Objectif
Créer une application Web JEE basée sur Spring MVC, Thymeleaf et Spring Data JPA permettant de gérer les patients avec les fonctionnalités suivantes :
- Afficher les patients
- Pagination
- Recherche des patients
- Suppression d'un patient
- Améliorations supplémentaires

### Étapes de réalisation
1. **Configuration du projet :**
   - Créer un nouveau projet Spring Boot.
   - Ajouter les dépendances nécessaires pour Spring MVC, Thymeleaf, Spring Data JPA, H2 database, Lombok et Spring Boot Devtools dans le fichier `pom.xml`.


2. **Création de l'entité Patient :**
   - Définir l'entité `Patient` avec les attributs suivants : id, nom, date de naissance, score, malade.
   - Utiliser les annotations JPA pour mapper cette entité à une table de base de données.
     ![image](https://github.com/ducloser90/SD_Activite3/assets/167253342/54d4c5f3-5234-4258-ac9c-e52ae9b4e10d)


3. **Création du repository :**
   - Créer une interface `PatientRepository` qui étend `JpaRepository`.

4. **Création du service :**
   - Implémenter un service pour gérer la logique métier liée aux patients (ajout, suppression, recherche, pagination).

5. **Création des contrôleurs :**
   - Définir les contrôleurs Spring MVC pour gérer les requêtes HTTP et retourner les vues Thymeleaf.

6. **Création des vues Thymeleaf :**
   - Créer des templates Thymeleaf pour afficher la liste des patients, les formulaires de recherche et de suppression, etc.
  
### Objectifs Réalisés

- **Affichage des patients :**

![4](https://github.com/ducloser90/SD_Activite3/assets/167253342/acafcd50-9a65-4983-b5fd-a549eb003430)

- **Pagination :**

![9](https://github.com/ducloser90/SD_Activite3/assets/167253342/4e182b3d-54cd-4e6c-aac2-0599819a6f17)


- **Recherche des patients :**

![12](https://github.com/ducloser90/SD_Activite3/assets/167253342/c70bd73b-0316-475f-8f3f-c1ca7f4567e7)

- **Suppression d'un patient :**

![13](https://github.com/ducloser90/SD_Activite3/assets/167253342/ee3d2f72-012b-4b80-9685-e75a70f19384)


- **Améliorations supplémentaires :**

![15](https://github.com/ducloser90/SD_Activite3/assets/167253342/15ccdb7d-5ee3-41e9-9387-a6bad4ec8f34)



## Partie 2 : Création d'une page template et validation des formulaires
[Vidéo de référence](https://www.youtube.com/watch?v=eoBE745lDE0)

### Objectif
Créer une page template et implémenter la validation des formulaires.

### Étapes de réalisation
1. **Création d'une page template :**
   - Définir une structure de page commune (header, footer, menu) dans un template Thymeleaf.

2. **Validation des formulaires :**
   - Utiliser les annotations de validation (`@NotNull`, `@Size`, `@Email`, etc.) sur l'entité `Patient`.
   - Configurer la validation dans les contrôleurs.
   - Afficher les messages d'erreur de validation dans les vues Thymeleaf.

## Partie 3 : Sécurité avec Spring Security
### Objectif
Implémenter la sécurité de l'application en utilisant Spring Security.

#### InMemory Authentication
[Vidéo de référence](https://www.youtube.com/watch?v=7VqpC8UD1zM)

1. **Configurer l'authentification InMemory :**
   - Ajouter les dépendances Spring Security dans le fichier `pom.xml`.
   - Configurer les utilisateurs et rôles en mémoire dans le fichier de configuration Spring Security.

#### JDBC Authentication
[Vidéo de référence](https://www.youtube.com/watch?v=Haz3wLiQ5-0)

1. **Configurer l'authentification JDBC :**
   - Configurer une source de données pour les utilisateurs et les rôles.
   - Utiliser Spring Security pour authentifier les utilisateurs à partir de la base de données.

#### UserDetails Service
[Vidéo de référence](https://www.youtube.com/watch?v=RTiS9ygyYs4)

1. **Implémenter UserDetailsService :**
   - Créer une classe qui implémente `UserDetailsService`.
   - Charger les détails de l'utilisateur à partir de la base de données.
   - Configurer Spring Security pour utiliser cette implémentation de `UserDetailsService`.

## Références
- [Vidéo Partie 1](https://www.youtube.com/watch?v=jDm-q-jEbiA)
- [Vidéo Partie 2](https://www.youtube.com/watch?v=eoBE745lDE0)
- [Vidéo Partie 3 - InMemory Authentication](https://www.youtube.com/watch?v=7VqpC8UD1zM)
- [Vidéo Partie 3 - JDBC Authentication](https://www.youtube.com/watch?v=Haz3wLiQ5-0)
- [Vidéo Partie 3 - UserDetails Service](https://www.youtube.com/watch?v=RTiS9ygyYs4)
