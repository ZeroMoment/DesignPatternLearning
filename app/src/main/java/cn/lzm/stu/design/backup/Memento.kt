package cn.lzm.stu.design.backup

/**
 * @des: 备忘录类  （当希望备份的是一个实体的部分数据时，使用此模式。否则clone就解决了）
 *
 * 保存备份的细节封装在此类中，后续更改保存的细节，也不影响客户端调用方
 *
 * 适用于功能比较复杂，但需要维护或记录历史属性的类
 * 或当某个角色状态改变时，有可能这个状态无效，这时可以使用暂存的备忘录恢复旧数据
 * @author: lizhiming
 * @date: 2022/9/5 14:35
 */
class Memento(state: String?) {

    var state = state

}