package com.geno1024.metrikx

import java.util.*

/**
 *
 * @author Geno1024 (Y. Z. Chen)
 * @date 2020-05-25 01:17:45
 */
data class Company(
    val zhName: String = "",
    val tianyanchaId: Long = 0,
    val UID: String = "",
    val url: String = "",
    val lastUpdatedOfThisInfo: GregorianCalendar = GregorianCalendar()
)
{
    fun getTianyanchaURL() = "https://"
}