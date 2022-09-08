package cn.lzm.stu.design.component

import cn.lzm.stu.design.util.LogUtil

/**
 * @des: 组合中的叶节点，叶节点没有子节点（分公司或更下一家办事处）
 * @author: lizhiming
 * @date: 2022/9/5 17:06
 */
class Leaf(name : String) : Component(name) {

    /**
     * 叶节点无子节点，add/remove无意义。
     * 依然保持这个实现不做区分，是为了消除叶节点跟枝节点的抽象层次区别，它们具有完全一致的接口
     */
    override fun add(comp: Component) {
    }
    override fun remove(comp: Component) {
    }

    //显示叶节点名称、级别
    override fun display(depth: Int) {
        if(depth < 1) return
        var stringBuf = StringBuffer()
        for (index in 0 until depth) {
            stringBuf.append("-")
        }
        LogUtil.eLog("$stringBuf$name")
    }

    override fun lineOfDuty() { //demo中，做财务分类用
        //干该干的活
        LogUtil.eLog("$name 公司财务收支管理")
    }
}