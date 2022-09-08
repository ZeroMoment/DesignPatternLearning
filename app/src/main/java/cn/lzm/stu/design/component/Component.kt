package cn.lzm.stu.design.component

/**
 * @des: 组合模式 抽象对象定义-为组合中的对象声名接口
 *
 * 一个场景：原本给一个总公司写了一整套OA系统，有hr、财务、业务员等分支管理业务。
 * 后续，此总公司希望这套oa推广整个集团，给之下的分公司也一样使用，又要保持树形管理结构。
 * 还有一些小的分支办事处，删减部分OA功能
 *
 * 既想复用一样的功能定义，又想保持层次归属结构的需求使用此模式
 *
 * @author: lizhiming
 * @date: 2022/9/5 16:59
 */
abstract class Component(name: String) {
    var name = name

    /**
     * 通常都用add和remove方法来提供增加或移除树叶或树枝功能
     */
    abstract fun add(comp: Component)
    abstract fun remove(comp: Component)
    abstract fun display(depth: Int) //显示几层结构

    abstract fun lineOfDuty() //履行职责

}