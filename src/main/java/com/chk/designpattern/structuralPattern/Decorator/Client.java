package com.chk.designpattern.structuralPattern.Decorator;

/**
 * @author changhongkai
 * @date 2018/12/25 下午6:15
 */
public class Client {
    public static void main(String[] args) {
        Human human = new BlackHuman();
        AbstractHumanDecorator decorator = new HumanDecorator(human);
        decorator.walkToWhere();
    }
}
