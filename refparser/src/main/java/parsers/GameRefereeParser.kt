package parsers

import fm.weigl.refdata.games.GameReferee
import tools.TextTool

import javax.inject.Inject

class GameRefereeParser @Inject constructor() {

    companion object {
        private const val SPACE = " "
    }

    fun parseReferee(refereeText: String): GameReferee {

        val parts = refereeText.split(SPACE.toRegex(), 2).toTypedArray()

        val position = parts.getOrElse(0, { "" })
        val name = parts.getOrElse(1, { "" })

        return GameReferee(name, position)

    }

}


