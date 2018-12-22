package com.sn.designPatterns.factory.simpleFactory;

/**
 * Copyright (C), 2002-2018,
 * FileName: SimpleFactoryDemo
 * Author:  18075555
 * Date: 2018/12/22 10:46.
 * Description: //描述当前类所属模块
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */
public class SimpleFactoryDemo {

    public static void main(String[] args){
        SimpleCarFactory simpleCarFactory = new SimpleCarFactory();
        Car bmwcar = simpleCarFactory.creatrCar("bmwcar");
        System.out.println(bmwcar.getName());

        Car audiCar = simpleCarFactory.creatrCar("audicar");
        System.out.println(audiCar.getName());

        Car benzCar = simpleCarFactory.creatrCar("benzCar");
        System.out.println(benzCar.getName());

    }
}


//-------------------
//运行结果
//    build BmwCar
//    build AudiCar
//    build BenzCar