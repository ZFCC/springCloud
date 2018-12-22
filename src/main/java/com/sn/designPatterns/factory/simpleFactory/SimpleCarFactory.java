package com.sn.designPatterns.factory.simpleFactory;

/**
 * Copyright (C), 2002-2018,
 * FileName: CarFactory
 * Author:  18075555
 * Date: 2018/12/22 10:39.
 * Description: //描述当前类所属模块
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */
public class SimpleCarFactory {
    private static String bmwCar = "BmwCar";
    private static String benzCar = "BenzCar";
    private static String audiCar = "AudiCar";

    public Car creatrCar(String carName){
        if (bmwCar.equalsIgnoreCase(carName)){
            return new BmwCar();
        }else if (benzCar.equalsIgnoreCase(carName)){
            return new BenzCar();
        }else if (audiCar.equalsIgnoreCase(carName)){
            return new AudiCar();
        }else {
            return null;
        }

    }
}
