package com.chk.designpattern.structuralPattern.Adapter.objectAdapter;

/**
 * @author changhongkai
 * @date 2018/12/25 下午4:20
 */
public class Adapter implements Target {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.needAdapterMethod();
    }
}
