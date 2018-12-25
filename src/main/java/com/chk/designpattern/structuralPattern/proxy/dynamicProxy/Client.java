package com.chk.designpattern.structuralPattern.proxy.dynamicProxy;

import java.lang.reflect.Proxy;

/**
 * @author changhongkai
 * @date 2018/12/25 下午8:48
 */
public class Client {
    public static void main(String[] args) {
        Company carCompany = new CarCompany();
        CarCompanyProxy carCompanyProxy = new CarCompanyProxy(carCompany);
        Class clazz = carCompany.getClass();
        Company company = (Company) Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), carCompanyProxy);
        company.sale();
    }
}
