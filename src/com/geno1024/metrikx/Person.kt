package com.geno1024.metrikx

/**
 *
 * @author Geno1024 (Y. Z. Chen)
 * @date 2020-05-25 02:24:42
 */
data class Person(
    val name: String = "",
    val school: School = School(),
    val misc: Map<String, String> = emptyMap()
)
{
}