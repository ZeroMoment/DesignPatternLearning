package cn.lzm.stu.design.bridge

/**
 * @des: 手机品牌：华为
 * @author: lizhiming
 * @date: 2022/9/6 14:57
 */
class HandsetBrandHuawei : HandsetBrand() {
    override fun run() {
        soft?.run()
    }
}