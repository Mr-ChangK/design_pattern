package com.chk.designpattern.structuralPattern.proxy.staticProxy;

/**
 * @author changhongkai
 * @date 2018/12/25 下午8:42
 */
public class CarCompany implements Company {

    @Override
    public void sale() {
        System.out.println("卖车");
    }
}
