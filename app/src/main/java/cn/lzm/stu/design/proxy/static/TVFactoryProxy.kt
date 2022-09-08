package cn.lzm.stu.design.proxy.static

/**
 * @des:代理商去下单拿货（静态代理类）
 * @author: lizhiming
 * @date: 2022/9/7 16:27
 */
class TVFactoryProxy : TVCompany {

    private var tvCompany: TVCompany? = null

    override fun produceTV(): TV {
        println("TV proxy get order .... ")
        println("TV proxy start produce .... ")
        if (tvCompany == null) {
            println("machine proxy find factory .... ")
            tvCompany = TVFactory()
        }
        return tvCompany!!.produceTV()
    }
}