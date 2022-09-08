package cn.lzm.stu.design.state

/**
 * @des: 下班休息状态
 * @author: lizhiming
 * @date: 2022/9/2 18:14
 */
class RestState : State() {
    /**
     * 使用状态模式，原本最外层的多项if/else判断都分离到了各自的状态类中
     */
    override fun writeProgram(work: Work) {
            //当前时间 work.hour点： 下班回家了
    }
}