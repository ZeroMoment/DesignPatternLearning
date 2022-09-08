package cn.lzm.stu.design

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import cn.lzm.stu.design.prototype.ConcretePrototype
import cn.lzm.stu.design.prototype.TestReference
import cn.lzm.stu.design.util.ClientDemo
import cn.lzm.stu.design.util.LogUtil
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        ClientDemo.testFactory()

        ClientDemo.testProxy()

//        ClientDemo.testComponent()

//        ClientDemo.testFlyweight()

    }
}