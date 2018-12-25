package com.chk.designpattern.structuralPattern.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author changhongkai
 * @date 2018/12/25 下午8:44
 */
public class CarCompanyProxy implements InvocationHandler {
    private Company company;

    public CarCompanyProxy(Company company) {
        this.company = company;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("被代理了");
        method.invoke(company);
        return null;
    }
}
