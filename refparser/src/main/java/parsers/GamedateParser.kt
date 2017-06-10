package parsers


import tools.TextTool

import javax.inject.Inject
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Date

/**
 * Created by asco on 08.07.16.
 */
class GamedateParser @Inject constructor() {

    companion object {
        private val UHR = "Uhr"
    }


    private val dateFormat = SimpleDateFormat("dd.MM.yyyy HH:mm")
    //    09.07.2016  15:00 Uhr

    @Throws(ParseException::class)
    fun parseDate(dateAndTimeText: String): Date {

        val cleanedDateAndTimeText = dateAndTimeText.replace(UHR, "").trim()

        return dateFormat.parse(cleanedDateAndTimeText)

    }
}