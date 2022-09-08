package cn.lzm.stu.design.state

/**
 * @des:
 * @author: lizhiming
 * @date: 2022/9/2 18:19
 */
class EveningState : State() {
    override fun writeProgram(workData: Work) {
        if(workData.isFinish) { //晚间，任务完成，转入下班状态
            workData.state = RestState()
            workData.writeProgram()
        } else {
            if (workData.hour < 21) {
                //当前时间 work.hour点：加班很晚，疲累
            } else { //超过21点，转入睡眠状态
                workData.state = SleepingState()
                workData.writeProgram()
            }
        }
    }
}