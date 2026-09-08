package com.panopset.fsb.tests.fas21engine

import com.panopset.fsb.engine.BlackjackCard
import com.panopset.fsb.engine.BlackjackGameEngine
import com.panopset.fsb.engine.Card
import com.panopset.fsb.engine.CardDefinition
import org.junit.jupiter.api.Assertions

fun verifyRecommendedActions(
    bge: BlackjackGameEngine, expectedActions: Array<String>,
    stackedDeckForTesting: List<Card>
) {
    ScenarioVerifier().verifyRecommendedActions(bge, expectedActions, stackedDeckForTesting)
}

fun performDeviantActions(
    bge: BlackjackGameEngine, expectedActions: Array<String>,
    stackedDeckForTesting: List<Card>
) {
    ScenarioVerifier().performDeviantActions(bge, expectedActions, stackedDeckForTesting)
}

@SafeVarargs
fun verifyRecommendedActionsFastDeal(
    bge: BlackjackGameEngine, expectedActions: Array<String>,
    vararg stackedDeckForTesting: List<Card>
) {
    ScenarioVerifier().verifyRecommendedActionsFastDeal(bge, expectedActions, *stackedDeckForTesting)
}

fun verifyPlayerCards(expected: Array<CardDefinition>, cards: List<BlackjackCard>) {
    Assertions.assertEquals(expected.size, cards.size)
    for ((i, blackjackCard) in cards.withIndex()) {
        Assertions.assertEquals(expected[i], blackjackCard.card.cardDefinition)
    }
}
