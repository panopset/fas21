package com.panopset.fsb.engine

import com.panopset.compat.random

class Deck(private val isBlue: Boolean) {
    private val shuffled: MutableList<Card> = ArrayList()

    init {
        shuffle()
    }

    private fun shuffle() {
        val cards: MutableList<Card> = ArrayList()
        for (cd in CardDefinition.entries) {
            cards.add(Card(cd, isBlue))
        }
        while (cards.isNotEmpty()) {
            shuffled.add(cards.removeAt(random(0, cards.size - 1)))
        }
    }

    fun remaining(): Int {
        return shuffled.size
    }

    fun deal(): Card {
        return shuffled.removeAt(0)
    }
}
