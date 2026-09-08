package com.panopset.fsb.tests.fas21engine

import com.panopset.fsb.engine.*
import org.junit.jupiter.api.Test

class Soft18vThit8thenBtest {
    @Test
    fun test() {
        val bge = BlackjackGameEngine(BlackjackConfigDefault())
        verifyRecommendedActions(bge, arrayOf(CMD_DEAL, CMD_HIT, CMD_HIT), soft18vThit8thenBtest())
    }
}
