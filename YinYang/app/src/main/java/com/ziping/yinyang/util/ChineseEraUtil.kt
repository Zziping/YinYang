package com.ziping.yinyang.util

class ChineseEraUtil {
    companion object{
        @JvmField
        val HEAVENLY_STEMS = listOf<String>("甲", "乙", "丙", "丁", "戊", "己", "庚", "辛", "壬", "癸")
        @JvmField
        val EARTHLY_BRANCHES = listOf<String>("子", "丑", "寅", "卯", "辰", "巳",
            "午", "未", "申", "酉", "戌", "亥")

        @JvmStatic
        fun calculateYear(year: Int) : String {
            val builder = StringBuilder()
            return with(builder) {
                append(HEAVENLY_STEMS[(year + 6) % 10])
                append(EARTHLY_BRANCHES[(year + 8) % 12])
                toString()
            }
        }
        @JvmStatic
        fun calculateYear(year: String) : String {
            val yearToInt = year.toInt()
            return calculateYear(yearToInt)
        }

        @JvmStatic
        fun calculateTime(hour: Int) : String {
            return EARTHLY_BRANCHES[((hour + 1) % 24) / 2]
        }
        @JvmStatic
        fun calculateTime(hour: String) : String {
            val hourToInt = hour.toInt()
            return EARTHLY_BRANCHES[((hourToInt + 1) % 24) / 2]
        }
    }
}