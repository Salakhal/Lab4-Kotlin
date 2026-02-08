

fun main() {
    var score = 0

    println("Début de la partie ")
    println("Score initial : $score")
  

    // Action 1 : Gain simple
    score += getPoints(10, 1)
    println("Score après 1ère action : $score\n")

    // Action 2 : Gain avec boost multiplicateur
    score += getPoints(20, 2)
    println("Score après 2ème action : $score\n")

    // Action 3 : Test avec un boost nul (cas de sécurité)
    score += getPoints(15, 0)
    println("Score après 3ème action : $score\n")

    // Action 4 : Perte de points (malus)
    score += getPoints(-10, 1)
    
    println("Score final : $score")
}

/**
 * Calcule les points à ajouter au score.
 * Inclut une vérification du boost et un affichage détaillé.
 */
fun getPoints(basePoints: Int, boost: Int): Int {
    // Étape 4 : Logique conditionnelle pour le boost
    if (boost <= 0) {
        println("Alerte : Aucun boost actif (boost <= 0), aucun point ajouté.")
        return 0
    }

    // Étape 5 : Calcul et affichage
    val total = basePoints * boost
    println("Calcul des points : $basePoints (base) * $boost (boost) = $total")
    
    return total
}
