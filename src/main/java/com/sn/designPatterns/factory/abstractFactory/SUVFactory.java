package com.sn.designPatterns.factory.abstractFactory;

/**
 * Copyright (C), 2002-2018,
 * FileName: SUVFactory
 * Author:  18075555
 * Date: 2018/12/22 11:52.
 * Description: //描述当前类所属模块
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */
public class SUVFactory extends AbstractFactory {
    private static String bmwSUV = "BmwSUV";
    private static String benzSUV = "BenzSUV";
    private static String audiSUV = "AudiSUV";
    @Override
    public Car createCar(String carName) {
        return null;
    }

    @Override
    public SUV createSUV(String suvName) {
        if (benzSUV.equalsIgnoreCase(suvName)){
            return new BenzSUV();
        }else if (bmwSUV.equalsIgnoreCase(suvName)){
            return new BmwSUV();
        }else if (audiSUV.equalsIgnoreCase(suvName)){
            return new AudiSUV();
        }else {
            return null;
        }
    }
}
