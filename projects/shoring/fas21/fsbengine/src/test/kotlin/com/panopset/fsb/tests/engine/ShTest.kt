package com.panopset.fsb.tests.fas21engine

import com.panopset.fsb.engine.*
import org.junit.jupiter.api.Test

class ShTest {
    @Test
    fun test() {
        val bge = BlackjackGameEngine(BlackjackConfigDefault())
        verifyRecommendedActions(
            bge, arrayOf(CMD_DEAL, CMD_HIT, CMD_STAND),
            stackHard16_with_4_vT()
        )
        verifyRecommendedActions(
            bge, arrayOf(CMD_DEAL, CMD_HIT, CMD_STAND),
            stackHard16_with_5_vT()
        )
        verifyRecommendedActions(bge, arrayOf(CMD_DEAL, CMD_HIT), stackHard16vT())
    }
}
