package cn.lzm.stu.design.backup

import cn.lzm.stu.design.util.LogUtil

/**
 * @des: 发起人类（使用类）
 * @author: lizhiming
 * @date: 2022/9/5 14:45
 */
class Originator {

    var state: String? = null //要保存的属性，可能有多个

    /**
     * 创建备忘录，将当前需要保存的信息导入并实例化出一个memento对象
     */
    fun createMemento() : Memento {
        return Memento(state)
    }

    /**
     * 恢复备忘录，将memento导入并将相关数据恢复
     */
    fun setMemento(memento: Memento?) {
        state = memento?.state
    }

    /**
     * 显示数据
     */
    fun show() {
        LogUtil.eLog("stata: $state")
    }

}