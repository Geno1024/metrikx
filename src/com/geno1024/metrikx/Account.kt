package com.geno1024.metrikx

/**
 *
 * @author Geno1024 (Y. Z. Chen)
 * @date 2020-05-25 01:28:06
 */
data class Account(
    val zhName: String,
    val ghid: String,
    val historyName: String,
    val company: Company,
    val school: School
)
{
}