package com.geno1024.metrikx

import java.util.*

/**
 *
 * @author Geno1024 (Y. Z. Chen)
 * @date 2020-05-25 02:22:55
 */
data class PsnAccount(
    val zhName: String = "",
    val wxid: String = "",
    val historyName: List<String> = emptyList(),
    val company: Company? = null,
    val school: School = School(),
    val lastUpdatedOfThisInfo: GregorianCalendar = GregorianCalendar()
) : Account()
{
}