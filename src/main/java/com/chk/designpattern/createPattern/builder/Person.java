package com.chk.designpattern.createPattern.builder;

import com.google.common.annotations.VisibleForTesting;
import org.junit.jupiter.api.Test;

/**
 * 感觉建造者模式这样用比较爽
 * @author changhongkai
 * @date 2018/12/15 下午11:26
 */
public class Person {
    private String name;
    private int age;
    private int sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }
    private Person(PersonBuilder bulider){
        this.age=bulider.age;
        this.name=bulider.name;
        this.sex=bulider.sex;
    }

    public static class PersonBuilder{
        private String name;
        private int age;
        private int sex;


        public PersonBuilder name(String var){
            this.name=var;
            return this;
        }
        public PersonBuilder age(int var){
            this.age=var;
            return this;
        }
        public PersonBuilder sex(int var){
            this.sex=var;
            return this;
        }
        public Person build(){
            return new Person(this);
        }
    }
}
