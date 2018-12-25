package com.chk.designpattern.structuralPattern.Adapter.objectAdapter;

/**
 * @author changhongkai
 * @date 2018/12/25 下午4:55
 */
public class Client {
    public static void main(String[] args) {
        Adapter adapter = new Adapter(new Adaptee());
        adapter.request();
    }
}
