package com.sn.designPatterns.factory.abstractFactory;

/**
 * Copyright (C), 2002-2018,
 * FileName: AbstractFactoryDemo
 * Author:  18075555
 * Date: 2018/12/22 11:56.
 * Description: //描述当前类所属模块
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */
public class AbstractFactoryDemo {

//使用 FactoryProducer 来获取 AbstractFactory，通过传递类型信息来获取实体类的对象。
    public static void main(String[] args){
        AbstractFactoryProvider abstractFactoryProvider = new AbstractFactoryProvider();
        //获取小汽车工厂
        AbstractFactory carFactory = abstractFactoryProvider.getFactory("car");
        //获取奥迪品牌的小汽车对象
        Car audiCar = carFactory.createCar("audiCar");
        System.out.println(audiCar.getName());
        //获取奔驰品牌的小汽车对象
        Car benzCar = carFactory.createCar("BenzCar");
        System.out.println(benzCar.getName());


        ////获取SUV汽车工厂
        AbstractFactory suvFactory = abstractFactoryProvider.getFactory("suv");
        //获取奥迪品牌的小汽车对象
        SUV audiSUV = suvFactory.createSUV("audiSUV");
        System.out.println(audiSUV.getName());
        //获取奔驰品牌的小汽车对象
        SUV benzSUV = suvFactory.createSUV("BenzSUV");
        System.out.println(benzSUV.getName());
    }

}
