package com.panopset.fsb.tests.fas21engine

import com.panopset.fsb.engine.*
import org.junit.jupiter.api.Test

class TwentyV2hitToSoft18test {
    @Test
    fun test() {
        val bge = BlackjackGameEngine(BlackjackConfigDefault())
        verifyRecommendedActions(bge, arrayOf(CMD_DEAL, CMD_STAND), twentyV2hitToSoft18())
    }
}
