package com.sn.designPatterns.factory.methodFactory;

/**
 * Copyright (C), 2002-2018,
 * FileName: BmwCarFactory
 * Author:  18075555
 * Date: 2018/12/22 11:03.
 * Description: //描述当前类所属模块
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */
public class BmwCarFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new BmwCar();
    }
}
