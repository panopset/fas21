package com.panopset.fsb.marin.oldswpkg.games.blackjack

import com.panopset.fsb.engine.BlackjackGameState
import com.panopset.compat.Tile

class LayoutDealer(t: Tile?, cardDim: IntArray?, cs: BlackjackGameState?) : Layout(t!!, cardDim!!, cs!!) {
    var nextDealerX: Int? = null
        get() {
            field = if (field == null) {
                t.left
            } else {
                field!! + cardSpacer
            }
            return field
        }
        private set
}
