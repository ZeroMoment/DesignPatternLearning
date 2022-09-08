package cn.lzm.stu.design.backup

/**
 * @des: 管理类：它的作用是只能将备忘录传递给其他对象（调用方）
 *
 * 负责保存好备忘录（Memento）不能对备忘录的内容进行操作或检查
 *
 * @author: lizhiming
 * @date: 2022/9/5 14:36
 */
class Caretaker {

    var memento: Memento? = null

}