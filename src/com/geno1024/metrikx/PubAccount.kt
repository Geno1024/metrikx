package com.geno1024.metrikx

import java.util.*

/**
 *
 * @author Geno1024 (Y. Z. Chen)
 * @date 2020-05-25 01:28:06
 */
data class PubAccount(
    val zhName: String = "",
    val ghid: String = "",
    /**
     * from base64
     */
    val bizid: Long = 0,
    val definedId: String = "",
    val historyName: Map<GregorianCalendar, String> = emptyMap(),
    val company: Company = Company(),
    val school: School = School(),
    val lastUpdatedOfThisInfo: GregorianCalendar = GregorianCalendar()
) : Account()
{
}