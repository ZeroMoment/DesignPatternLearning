package cn.lzm.stu.design.proxy.static

/**
 * @des: 公司所属的工厂生产电视机
 * @author: lizhiming
 * @date: 2022/9/7 16:25
 */
class TVFactory : TVCompany {
    override fun produceTV(): TV {
        println("TV factory produce TV...");
        return TV("小米电视机", "长沙市")
    }
}