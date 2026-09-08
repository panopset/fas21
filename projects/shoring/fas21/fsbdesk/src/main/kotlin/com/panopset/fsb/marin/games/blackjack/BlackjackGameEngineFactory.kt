package com.panopset.fsb.marin.games.blackjack

import com.panopset.fsb.engine.BlackjackConfiguration
import com.panopset.fsb.engine.BlackjackGameEngine

object BlackjackGameEngineFactory {

    fun create(config: BlackjackConfiguration): BlackjackGameEngine {
        return BlackjackGameEngine(config)
    }
}
