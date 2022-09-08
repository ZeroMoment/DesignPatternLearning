package cn.lzm.stu.design.component

import cn.lzm.stu.design.util.LogUtil
import java.util.ArrayList

/**
 * @des: 定义枝节点行为，用来存储子部件，在Component接口中实现与子部件相关的操作，比如add remove
 * @author: lizhiming
 * @date: 2022/9/5 17:12
 */
class Composite(name: String) : Component(name) {

    //一个子对象集合用来存储其下属的枝节点和叶节点
    private val children = ArrayList<Component>()

    override fun add(comp: Component) {
        children.add(comp)
    }

    override fun remove(comp: Component) {
        children.remove(comp)
    }

    /**
     * 显示节点名称，并对其下级进行遍历
     */
    override fun display(depth: Int) {

        if(depth < 1) return
        var stringBuf = StringBuffer()
        for (index in 0 until depth) {
            stringBuf.append("-")
        }
        LogUtil.eLog("$stringBuf$name")

        for (itemComp in children) {
            itemComp.display(depth+2) //目前逻辑固定加俩子节点，写死
        }
    }

    override fun lineOfDuty() {
        //做具体工作
        for (itemComp in children) {
            itemComp.lineOfDuty()
        }
    }
}