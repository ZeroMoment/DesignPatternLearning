package cn.lzm.stu.design.proxy.dynamic

import cn.lzm.stu.design.proxy.static.TV

/**
 * @des:
 * @author: lizhiming
 * @date: 2022/9/7 16:48
 */
class TVFactoryNew : TVCompanyNew {
    override fun produceTv(): TV {
        println("TV factory---new--- produce TV...");
        return TV("小米电视机", "长沙市")
    }

    override fun repair(tv: TV): TV {
        println("TV  is repair finished...");
        return TV("小米电视机", "永州市维修点")
    }
}