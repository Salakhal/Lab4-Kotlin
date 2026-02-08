# Lab 4 – Fonctions avec paramètres et valeur de retour

Ce projet est un exercice pratique portant sur la création de **fonctions avec paramètres** et **valeurs de retour** en Kotlin. Il simule l'évolution du score d'un joueur en fonction de ses actions.

## 🎯 Objectifs du TP
* Apprendre à déclarer une fonction avec le mot-clé `fun`.
* Manipuler des paramètres d'entrée (`Int`).
* Retourner un résultat exploitable par le programme principal.
* Gérer des conditions logiques pour valider les données.

## 🛠️ Fonctionnalités
La fonction principale `getPoints(basePoints, boost)` permet de :
1. Multiplier les points de base par un coefficient (boost).
2. Vérifier si le boost est valide (doit être > 0).
3. Afficher le détail du calcul dans la console.

## 📋 Exemple de Sortie
```text
 Début de la partie
Score initial : 0

Calcul des points : 10 (base) * 1 (boost) = 10
Score après 1ère action : 10

Calcul des points : 20 (base) * 2 (boost) = 40
Score après 2ème action : 50

Alerte : Aucun boost actif (boost <= 0), aucun point ajouté.
Score après 3ème action : 50

Calcul des points : -10 (base) * 1 (boost) = -10

Score final : 40
```
