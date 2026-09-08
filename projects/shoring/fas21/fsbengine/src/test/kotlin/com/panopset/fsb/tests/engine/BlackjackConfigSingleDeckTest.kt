package com.panopset.fsb.tests.fas21engine

object BlackjackConfigSingleDeckTest: BlackjackConfigBaseTest() {
    override fun getDecks(): Int {
        return 1
    }
}