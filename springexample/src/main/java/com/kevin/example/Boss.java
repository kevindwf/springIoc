package com.kevin.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//通过Component注释定义 Bean，等同于xml里定义的bean
@Component("boss")
public class Boss {
    //自动从context里找到相同类型的定义来创建实例，等同于xml里的Property设值
    @Autowired
    private Car car;
    @Autowired
    private Office office;

    @Override
    public String toString(){
        return "car:" + car + "\n" + "office:" + office;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void setOffice(Office office) {
        this.office = office;
    }
}
