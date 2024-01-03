package com.ziping.yinyang.util

class ElementsUtil {
    companion object {
        @JvmField
        val FIVE_ELEMENTS = listOf("金", "水", "木", "火", "土")

        @JvmField
        val RELATIONS = listOf("比和", "我生", "我克", "克我", "生我")

        @JvmField
        val CHARACTERS = listOf("兄弟", "子孙", "妻财", "官鬼", "父母")

        @JvmStatic
        fun getRelation(self: String, other: String) : Int {
            val posSelf = FIVE_ELEMENTS.indexOf(self)
            val posOther = FIVE_ELEMENTS.indexOf(other)
            return (posOther - posSelf + 5) % 5
        }
    }
}