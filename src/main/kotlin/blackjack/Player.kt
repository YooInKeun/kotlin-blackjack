package blackjack

import blackjack.card.BlackJackCard

class Player(
    val name: String,
    private val scoreCalculator: ScoreCalculator
) {
    val cards: MutableList<BlackJackCard> = mutableListOf()

    fun drawCard(cards: List<BlackJackCard>) {
        this.cards.addAll(cards)
    }

    fun shouldDraw(): Boolean {
        return resultScore() <= 21
    }

    fun resultScore(): Int {
        return scoreCalculator.calcScore(cards)
    }
}
