/**
 * 适配器模式
 * 将一个类的接口转换成客户希望的另外一个接口。Adapter模式使得原本由于接口不兼容而不能一起工作的那些类可以在一起工作
 * 角色
 * 目标接口（Target）：客户所期待的接口。目标可以是具体的或抽象的类，也可以是接口。
 * 需要适配的类（Adaptee）：需要适配的类或适配者类。
 * 适配器（Adapter）：通过包装一个需要适配的对象，把原接口转换成目标接口。
 * 两种实现，类的适配器（采用继承实现），对象适配器（采用对象组合方法实现)
 * <p>
 * 如果使用者需要一个target的对象，但是想用adaptee，这个时候就可以使用适配器
 *
 * @author changhongkai
 * @date 2018/12/24 上午11:52
 */
package com.chk.designpattern.structuralPattern.Adapter;