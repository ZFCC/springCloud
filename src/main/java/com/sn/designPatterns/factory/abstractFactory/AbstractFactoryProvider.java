package com.sn.designPatterns.factory.abstractFactory;

import javax.validation.constraints.Null;

/**
 * Copyright (C), 2002-2018,
 * FileName: AbstractFactoryProvider
 * Author:  18075555
 * Date: 2018/12/22 15:14.
 * Description: //描述当前类所属模块
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */
public class AbstractFactoryProvider {

//AbstractFactoryProvider来获取 AbstractFactory，通过传递类型信息来获取实体类的对象。
    public AbstractFactory getFactory(String factory){
        if (factory.equalsIgnoreCase("Car")){
            return new CarFactory();
        }else if (factory.equalsIgnoreCase("SUV")){
            return new SUVFactory();
        }else {
            return null;
        }
    }
}
