package cn.lzm.stu.design.util

import cn.lzm.stu.design.backup.Caretaker
import cn.lzm.stu.design.backup.Originator
import cn.lzm.stu.design.bridge.*
import cn.lzm.stu.design.command.Command1
import cn.lzm.stu.design.command.Command2
import cn.lzm.stu.design.command.Invoker
import cn.lzm.stu.design.command.Receiver
import cn.lzm.stu.design.component.Composite
import cn.lzm.stu.design.component.HrComposite
import cn.lzm.stu.design.component.Leaf
import cn.lzm.stu.design.duty.ConcreteHandler1
import cn.lzm.stu.design.duty.ConcreteHandler2
import cn.lzm.stu.design.duty.ConcreteHandler3
import cn.lzm.stu.design.factory.Coffee
import cn.lzm.stu.design.factory.Drink
import cn.lzm.stu.design.factory.abstractness.AmericaDrinksFactory
import cn.lzm.stu.design.factory.abstractness.ChinaDrinksFactory
import cn.lzm.stu.design.factory.method.AmericaCoffeeFactory
import cn.lzm.stu.design.factory.method.ChinaCoffeeFactory
import cn.lzm.stu.design.factory.method.CoffeeFactory
import cn.lzm.stu.design.factory.simple.SimpleFactory
import cn.lzm.stu.design.flyweight.FlyweightFactory
import cn.lzm.stu.design.flyweight.UnsharedConcreteFlyweight
import cn.lzm.stu.design.prototype.ConcretePrototype
import cn.lzm.stu.design.prototype.TestReference
import cn.lzm.stu.design.proxy.dynamic.TVCompanyNew
import cn.lzm.stu.design.proxy.dynamic.TVFactoryNew
import cn.lzm.stu.design.proxy.dynamic.TVFactoryProxyNew
import cn.lzm.stu.design.proxy.static.TV
import cn.lzm.stu.design.proxy.static.TVFactoryProxy


/**
 * @des: 模拟客户端调用
 * @author: lizhiming
 * @date: 2022/9/5 14:52
 */
class ClientDemo {

    companion object {

        private fun print(c: Array<Coffee>) {
            for (coffee in c) {
                println(coffee.getName())
            }
        }

        fun printDrink(drink: Drink?) {
            if (drink == null) {
                println("产品：--")
            } else {
                println("产品：" + drink.getName())
            }
        }

        fun testFactory() {

            //简单工厂
            val latte = SimpleFactory.createInstance("latte")
            println("创建的咖啡实例为:" + latte.getName())
            val cappuccino = SimpleFactory.createInstance("cappuccino")
            println("创建的咖啡实例为:" + cappuccino.getName())

            //工厂方法
            val chinaCoffeeFactory: CoffeeFactory = ChinaCoffeeFactory()
            val chinaCoffees = chinaCoffeeFactory.createCoffee()
            println("中国咖啡工厂可以生产的咖啡有：")
            print(chinaCoffees)
            val americaCoffeeFactory: CoffeeFactory = AmericaCoffeeFactory()
            val americaCoffees = americaCoffeeFactory.createCoffee()
            println("美国咖啡工厂可以生产的咖啡有：")
            print(americaCoffees)

            //抽象工厂
            val chinaDrinksFactory = ChinaDrinksFactory()
            var coffee: Coffee = chinaDrinksFactory.createCoffee()
            var tea : Drink? = chinaDrinksFactory.createTea()
            var sodas : Drink? = chinaDrinksFactory.createSodas()
            println("中国饮品工厂有如下产品：")
            printDrink(coffee)
            printDrink(tea)
            printDrink(sodas)

            val americaDrinksFactory = AmericaDrinksFactory()
            coffee = americaDrinksFactory.createCoffee()
            tea = americaDrinksFactory.createTea()
            sodas = americaDrinksFactory.createSodas()
            println("美国饮品工厂有如下产品：")
            printDrink(coffee)
            printDrink(tea)
            printDrink(sodas)

        }

        fun testProxy() {
            //静态代理
//            val tvProxy = TVFactoryProxy()
//            val tv: TV = tvProxy.produceTV()
//            println(tv)

            //动态代理
            val target : TVCompanyNew = TVFactoryNew()
            val tvCompany: TVCompanyNew = TVFactoryProxyNew(target).getProxy() as TVCompanyNew
            //使用动态代理，每次运行具体方法之前，都调用到invoke里
            val tv = tvCompany.produceTv()
            tvCompany.repair(tv)

        }

        fun testProtoType() {
            //测试原型模式
            val concretePrototype = ConcretePrototype("1111")
            val cloneType = concretePrototype.methodClone() as ConcretePrototype

            // clone 浅拷贝，对引用类型直接拷贝的引用。拷贝类中引用类型属性的修改不想影响原数据的，需要对该属性（引用类型）也实现Cloneable接口
            cloneType.testReference = concretePrototype.testReference.methodClone() as TestReference

            LogUtil.eLog("concretePrototype-id: ${concretePrototype.getId()}")
            LogUtil.eLog("cloneType-id: ${cloneType.getId()}")
            LogUtil.eLog("concretePrototype-reference-type: ${concretePrototype.testReference.getType()}")
            LogUtil.eLog("cloneType-reference-type: ${cloneType.testReference.getType()}")

            cloneType.testReference.setType(666)
            cloneType.setId("33333")

            LogUtil.eLog("clone-setId-----------")

            LogUtil.eLog("concretePrototype-id: ${concretePrototype.getId()}")
            LogUtil.eLog("cloneType-id: ${cloneType.getId()}")
            LogUtil.eLog("concretePrototype-reference-type: ${concretePrototype.testReference.getType()}")
            LogUtil.eLog("cloneType-reference-type: ${cloneType.testReference.getType()}")
        }

        fun testBackup() { //备忘录模式

            val originator = Originator()
            originator.state = "On"
            originator.show()

            val caretaker = Caretaker()  //保存状态时，由于有了很好的封装，可以隐藏Originator的实现细节（具体备份哪些数据的细节）
            caretaker.memento = originator.createMemento()

            originator.state = "Off"
            originator.show()

            originator.setMemento(caretaker.memento) //恢复备份
            originator.show()

        }

        fun testComponent() { //组合模式

            //生成树根root，根上长出两叶
            val root = Composite("北京总公司")
            root.add(Leaf("总公司财务部"))
            root.add(HrComposite("总公司人力资源部"))

            //根上分支Composite X  分支上也有两叶
            val compX = Composite("上海华东分公司")
            compX.add(Leaf("华东分公司财务部"))
            compX.add(HrComposite("华东分公司人力资源部"))

            root.add(compX)

            //在Composite X又长出分支 Composite XY，分支上也有两叶
            val compXY = Composite("南京办事处")
            compXY.add(Leaf("南京办事处财务部"))
            compXY.add(HrComposite("南京办事处人力资源部"))

            compX.add(compXY)

            //增加华中分公司
            val compCenter = Composite("长沙华中分公司")
            compCenter.add(Leaf("华中分公司财务部"))
            compCenter.add(HrComposite("华中分公司人力资源部"))

            root.add(compCenter)

            val compWH = Composite("武汉办事处")
            compWH.add(Leaf("武汉办事处财务部"))
            compWH.add(HrComposite("武汉办事处人力资源部"))

            compCenter.add(compWH)


            root.add(Leaf("永州市特别发改委"))

            LogUtil.eLog("公司架构")
            root.display(1)

//            LogUtil.eLog("部门职责")
//            root.lineOfDuty()
        }


        fun testBridge() { //桥接模式

            var hb : HandsetBrand

            hb = HandsetBrandXiaoMi()
            hb.setHandsetSoft(HandsetGame()) //给小米手机设置游戏
            hb.run()
            hb.setHandsetSoft(HandsetAddressList())//给小米手机设置通讯录
            hb.run()

            hb = HandsetBrandHuawei()
            hb.setHandsetSoft(HandsetGame()) //给华为手机设置游戏
            hb.run()
            hb.setHandsetSoft(HandsetAddressList())//给华为手机设置通讯录
            hb.run()

            //后续想增加手机品牌或手机软件，增加对应实现类即可，不用动原来结构
        }


        fun testCommand() { //命令模式

            val receiver = Receiver()
            val command1 = Command1(receiver)
            val command2 = Command2(receiver)
            //....假设这里还有很多其他命令

            //开始统筹所有命令
            val invoker = Invoker()
            invoker.setCommand(command1)
            invoker.setCommand(command2)
            /**
             * invoker.setCommand(aaa)
             * invoker.setCommand(bbb)
             * .....很多其他指令一起添加
             */

            invoker.executeCommand()
        }

        //职责链
        fun testDuty() {

            val h1 = ConcreteHandler1()
            val h2 = ConcreteHandler2()
            val h3 = ConcreteHandler3()
            //设置继任者（自己处理不了，让继任者继续处理）
            h1.successor = h2
            h2.successor = h3

            var requests = intArrayOf(2, 3, 15, 22, 30, 40)

            for (requestInt in requests) {
                h1.handleRequest(requestInt)
            }
        }

        fun testFlyweight() { //享元

            var extrinsicState = 22 //外部状态

            val ff = FlyweightFactory()

            val fx = ff.getFlyweight("x")
            fx?.operation(--extrinsicState)

            val fy = ff.getFlyweight("y")
            fy?.operation(--extrinsicState)

            val fz = ff.getFlyweight("z")
            fz?.operation(--extrinsicState)


            //非共享状态类，不使用享元工厂
            val uf = UnsharedConcreteFlyweight()
            uf.operation(--extrinsicState)

            var strA = "大话设计模式"
            var strB = "大话设计模式"

            LogUtil.eLog("strA == strB=${strA == strB}")
            //结果就是true 引用也相等。这就是享元
            LogUtil.eLog("strA === strB=${strA === strB}") //引用是否相等

        }

    }

}