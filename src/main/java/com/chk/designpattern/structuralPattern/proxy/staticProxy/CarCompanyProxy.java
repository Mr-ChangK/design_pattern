package com.chk.designpattern.structuralPattern.proxy.staticProxy;

/**
 * @author changhongkai
 * @date 2018/12/25 下午8:42
 */
public class CarCompanyProxy implements Company {
    private CarCompany carCompany;

    @Override
    public void sale() {
        carCompany.sale();
    }
}
