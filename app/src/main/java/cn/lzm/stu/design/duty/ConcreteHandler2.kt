package cn.lzm.stu.design.duty

/**
 * @des: 具体处理类，处理它所负责的请求，可访问它的继任者
 *
 * （有点像状态模式）
 *
 * @author: lizhiming
 * @date: 2022/9/6 17:58
 */
class ConcreteHandler2 : Handler() {
    override fun handleRequest(request: Int) {
        if(request in 10..20) {
            //处理请求
        } else {
            successor?.handleRequest(request) //转移到下一位
        }
    }
}