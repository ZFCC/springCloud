package com.sn.designPatterns.factory.methodFactory;

/**
 * Copyright (C), 2002-2018,
 * FileName: MethodFactoryDemo
 * Author:  18075555
 * Date: 2018/12/22 11:04.
 * Description: //描述当前类所属模块
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */
public class MethodFactoryDemo {

    public static void main(String[] args){

        CarFactory benzCarFactory = new BenzCarFactory();
        String benzCar = benzCarFactory.createCar().getName();
        System.out.println(benzCar);

        CarFactory audiCarFactory = new AudiCarFactory();
        String audiCar = audiCarFactory.createCar().getName();
        System.out.println(audiCar);

        CarFactory bmwCarFactory = new BmwCarFactory();
        String bmwCar = bmwCarFactory.createCar().getName();
        System.out.println(bmwCar);

    }
}
