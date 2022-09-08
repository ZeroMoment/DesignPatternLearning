package cn.lzm.stu.design.proxy.dynamic

import cn.lzm.stu.design.proxy.static.TV

/**
 * @des:有一天公司增加了业务，出售的商品越来越多，售后也需要更上。但是公司发现原来的代理商，
 * 还要再培训才能完成全部的业务，于是就找了另外的动态代理商B 。 代理商B 承诺无缝对接公司所有的业务，
 * 不管新增什么业务，均不需要额外的培训即可完成。
 * @author: lizhiming
 * @date: 2022/9/7 16:45
 */
interface TVCompanyNew {

    /**
     * 生产电视机
     */
    fun produceTv() : TV

    /**
     * 维修电视（较原来业务，新增的）
     */
    fun repair(tv: TV) : TV

}