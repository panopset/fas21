package com.panopset.fsb.marin.oldswpkg.games.blackjack

import com.panopset.fsb.engine.Card
import com.panopset.fsb.marin.oldswpkg.games.blackjack.config.ImageMapCachePatch
import com.panopset.marin.fx.ImageMapCache
import javafx.scene.image.Image

class CardPathKeys(private val basePath: String, private val ext: String) {
    fun getImage(card: Card): Image? {
        return find(card)
    }

    fun find(card: Card): Image? {
        var rtn = ImageMapCache[card.name()]
        if (rtn == null) {
            val path = getPathFor(card)
            rtn = ImageMapCachePatch[card.name(), path]
        }
        return rtn
    }

    fun find(id: String): Image? {
        var rtn = ImageMapCachePatch[id]
        if (rtn == null) {
            val path = getPathFor(id)
            rtn = ImageMapCachePatch[id, path]
        }
        return rtn
    }

    fun getPathFor(card: Card): String {
        return getPathFor(getCardSvgName(card))
    }

    fun getPathFor(id: String): String {
        return String.format("%s%s.%s", basePath, id, ext)
    }

    fun getCardSvgName(card: Card): String {
        return card.cardDefinition.key
    }

    val backBlue: Image?
        get() = find("1B")
    val backRed: Image?
        get() = find("2B")
}
