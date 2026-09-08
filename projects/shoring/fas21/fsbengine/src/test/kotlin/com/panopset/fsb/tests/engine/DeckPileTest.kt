package com.panopset.fsb.tests.fas21engine

import com.panopset.fsb.engine.DeckPile.pull
import com.panopset.fsb.engine.DeckPile.reset
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class DeckPileTest {
    @Test
    fun test() {
        reset()
        Assertions.assertTrue(pull())
        Assertions.assertFalse(pull())
        Assertions.assertTrue(pull())
    }
}
