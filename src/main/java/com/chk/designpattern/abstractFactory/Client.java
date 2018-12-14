package com.chk.designpattern.abstractFactory;

/**
 * @author changhongkai
 * @date 2018/12/14 下午2:42
 */
public class Client {
    public void consume(){
        CarFactoryAbstract factory=new BMWCarFactory();
        factory.build();
    }
}
