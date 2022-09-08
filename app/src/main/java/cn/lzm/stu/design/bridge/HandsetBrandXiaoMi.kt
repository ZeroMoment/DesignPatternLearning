package cn.lzm.stu.design.bridge

/**
 * @des: 手机品牌：小米
 * @author: lizhiming
 * @date: 2022/9/6 14:56
 */
class HandsetBrandXiaoMi : HandsetBrand() {
    override fun run() {
        soft?.run()
    }
}