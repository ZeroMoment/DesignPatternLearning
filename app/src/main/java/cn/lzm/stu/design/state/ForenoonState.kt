package cn.lzm.stu.design.state

/**
 * @des: 上午工作状态
 * @author: lizhiming
 * @date: 2022/9/2 18:14
 */
class ForenoonState : State() {
    /**
     * 使用状态模式，原本最外层的多项if/else判断都分离到了各自的状态类中
     */
    override fun writeProgram(work: Work) {
        if(work.hour < 12) {
            //当前时间 work.hour点：上午工作，精神百倍
        } else { //超过13点，则转入下午工作状态
            work.state = AfternoonState()
            work.writeProgram()
        }
    }
}