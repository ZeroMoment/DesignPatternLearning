package cn.lzm.stu.design.prototype

/**
 * @des:
 * @author: lizhiming
 * @date: 2022/9/1 17:16
 */
class TestReference(type: Int): Cloneable {
    private var mType = type

    fun setType(type :Int) {
        this.mType = type
    }

    fun getType() :Int {
        return mType
    }

    fun methodClone() :Any {
        return this.clone()
    }
}