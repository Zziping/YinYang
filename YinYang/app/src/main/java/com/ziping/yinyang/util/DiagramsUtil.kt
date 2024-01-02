package com.ziping.yinyang.util

class DiagramsUtil {
    companion object {
        val EXAMPLE = listOf("", "", "", "", "", "", "", "")

        @JvmField
        val DIAGRAM_8 = listOf("乾", "兑", "离", "震", "巽", "坎", "艮", "坤")

        @JvmField
        val IMAGERY_8 = listOf("天", "泽", "火", "雷", "风", "水", "山", "地")

        @JvmField
        val ELEMENT_TO_DIAGRAM = listOf("金", "金", "火", "木", "木", "水", "土", "土")

        @JvmField
        val DIAGRAM_64 = listOf("乾", "坤", "屯", "蒙", "需", "讼", "师", "比",
            "小畜", "履", "泰", "否", "同人", "大有", "谦", "豫",
            "随", "蛊", "临", "观", "噬嗑", "贲", "剥", "复",
            "无妄", "大畜", "颐", "大过", "坎", "离", "咸", "恒",
            "遯", "大壮", "晋", "明夷", "家人", "睽", "蹇", "解",
            "损", "益", "夬", "姤", "萃", "升", "困", "井",
            "革", "鼎", "震", "艮", "渐", "归妹", "丰", "旅",
            "巽", "兑", "涣", "节", "中孚", "小过", "既济", "未济")

        @JvmField
        val IMAGERY_64 = listOf("天", "地", "水雷", "山水", "水天", "天水", "地水", "水地",
            "风天", "天泽", "地天", "天地", "天火", "火天", "地山", "雷地",
            "泽雷", "山风", "地泽", "风地", "火雷", "山火", "山地", "地雷",
            "天雷", "山天", "山雷", "泽风", "水", "火", "泽山", "雷风",
            "天山", "雷天", "火地", "地火", "风火", "火泽", "水山", "雷水",
            "山泽", "风雷", "泽天", "天风", "泽地", "地风", "泽水", "水风",
            "泽火", "风火", "雷", "山", "风山", "雷泽", "雷火", "火山",
            "风", "泽", "风水", "水泽", "风泽", "雷山", "水火", "火水")

        @JvmField
        val LEVEL_64 = listOf("2", "2", "-2", "-1", "1", "-1", "1", "2",
            "-2", "1", "0", "0", "1", "2", "0", "0",
            "0", "0", "1", "1", "2", "1", "-1", "0",
            "-2", "1", "2", "-1", "-2", "1", "1", "1",
            "-2", "1", "1", "-1", "-2", "-2", "-2", "1",
            "-2", "2", "2", "1", "1", "2", "1", "2",
            "2", "-1", "1", "-1", "2", "-2", "2", "-2",
            "1", "2", "-2", "2", "-2", "1", "1", "-1")

        @JvmField
        val SUGGESTION_64 = listOf("刚健中正", "柔顺伸展", "起始艰难", "启蒙奋发",
            "守正待时", "慎争戒讼", "行险而顺", "诚信团结",
            "蓄养待进", "脚踏实地", "应时而变", "不交不汇",
            "宽容和同", "顺天依时", "内高外低", "乐不忘忧",
            "择善而从", "振疲起衰", "临物有道", "观下瞻上",
            "济之以刑", "饰外实内", "应付衰败", "挫折奋起",
            "自然而得", "知进知退", "颐养蓄力", "非常行动",
            "突破艰难", "附和柔中", "相互感应", "恒以而成",
            "以退为进", "居安思危", "积极进取", "患难成长",
            "诚威治家", "异中求同", "险阻在前", "解难在谍",
            "损下益上", "助人自助", "树德除恶", "制恶未萌",
            "团结力量", "柔顺升进", "困境求通", "济人利物",
            "顺天而变", "稳重成新", "临危不乱", "适可而止",
            "高楼地起", "善始悔终", "日中则斜", "拨乱反正",
            "有容乃大", "内刚外柔", "拯救涣散", "万物有节",
            "诚信立身", "动静有度", "初吉终乱", "事业未竟")
    }
}