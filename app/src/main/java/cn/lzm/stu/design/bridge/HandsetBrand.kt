package cn.lzm.stu.design.bridge

/**
 * @des: 手机品牌
 * @author: lizhiming
 * @date: 2022/9/6 14:53
 */
abstract class HandsetBrand {

    var soft: HandsetSoft? = null

    /**
     * 品牌需要关注软件，所以可以再机器中安装软件（设置手机软件），以备运行
     */
    fun setHandsetSoft(soft: HandsetSoft) {
        this.soft = soft
    }

    abstract fun run()

}