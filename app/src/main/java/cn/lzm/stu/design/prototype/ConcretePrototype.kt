package cn.lzm.stu.design.prototype

/**
 * @des:
 * @author: lizhiming
 * @date: 2022/8/31 17:47
 */
class ConcretePrototype(id: String) : Prototype(id) {

//    @Throws(CloneNotSupportedException::class)
//    public override fun clone(): Prototype {
//        return super.clone() as  ConcretePrototype
//    }

    var testReference :TestReference = TestReference(id.toInt())

    override fun methodClone() : Any {
        return super.methodClone()
    }

}