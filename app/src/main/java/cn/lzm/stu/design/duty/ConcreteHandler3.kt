package cn.lzm.stu.design.duty

/**
 * @des: 具体处理类，处理它所负责的请求，可访问它的继任者
 *
 * （有点像状态模式）
 *
 * @author: lizhiming
 * @date: 2022/9/6 17:58
 */
class ConcreteHandler3 : Handler() {
    override fun handleRequest(request: Int) {
        if(request in 20..30) {
            //处理请求
        } else {
            //已经最上级，此请求不符合规则，不予处理
        }
    }
}