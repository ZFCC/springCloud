package com.sn.designPatterns.factory.abstractFactory;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * Copyright (C), 2002-2018,
 * FileName: AbstractFactory
 * Author:  18075555
 * Date: 2018/12/22 11:34.
 * Description: //描述当前类所属模块
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */
public abstract class AbstractFactory {
    public abstract Car createCar(String carName);
    public abstract SUV createSUV(String suvName);
}
