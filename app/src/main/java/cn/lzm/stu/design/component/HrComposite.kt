package cn.lzm.stu.design.component

import cn.lzm.stu.design.util.LogUtil

/**
 * @des: hr部门（其他多余无意义抽象不想用，可以中间弄个实现类隔离一下）
 * @author: lizhiming
 * @date: 2022/9/5 18:15
 */
class HrComposite(name : String) : Component(name) {
    override fun add(comp: Component) {
    }

    override fun remove(comp: Component) {
    }

    override fun display(depth: Int) {
        if(depth < 1) return
        var stringBuf = StringBuffer()
        for (index in 0 until depth) {
            stringBuf.append("-")
        }
        LogUtil.eLog("$stringBuf$name")
    }

    override fun lineOfDuty() { //hr职责
        LogUtil.eLog("$name 员工招聘、培训管理")
    }
}