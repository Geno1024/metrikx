package com.geno1024.metrikx.accounts.jinri

import com.geno1024.metrikx.PubAccount
import com.geno1024.metrikx.companies.XueShengHui
import com.geno1024.metrikx.schools.JNU
import java.util.*

/**
 *
 * @author Geno1024 (Y. Z. Chen)
 * @date 2020-05-25 02:45:39
 */
val JiShengHuo = PubAccount(
    zhName = "暨生活",
    ghid = "gh_f42d85453858",
    bizid = 3533534952,
    definedId = "jinrijida",
    historyName = mapOf(
        GregorianCalendar(2017, 12 - 1, 1) to "今日暨大",
        GregorianCalendar(2018, 1 - 1, 13) to "暨生活"
    ),
    company = XueShengHui,
    school = JNU,
    lastUpdatedOfThisInfo = GregorianCalendar(2020, 5 - 1, 25, 2, 53)
)