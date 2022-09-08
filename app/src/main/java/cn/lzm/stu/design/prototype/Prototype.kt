package cn.lzm.stu.design.prototype

/**
 * @des: 原型类
 * @author: lizhiming
 * @date: 2022/8/31 17:43
 */
abstract class Prototype(id: String) : Cloneable {

    private var mId = id

    fun getId(): String {
        return mId
    }

    fun setId(id : String) {
        this.mId = id
    }

//    @Throws(CloneNotSupportedException::class)
//    override fun clone(): Prototype {
//        return super.clone() as Prototype
//    }

    open fun methodClone(): Any {
        return super.clone()
    }

}