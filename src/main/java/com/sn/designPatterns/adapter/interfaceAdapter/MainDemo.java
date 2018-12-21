package com.sn.designPatterns.adapter.interfaceAdapter;

/**
 * Copyright (C), 2002-2018, 苏宁易购电子商务有限公司
 * FileName: MainDemo
 * Author:  18075555
 * Date: 2018/12/21 8:59.
 * Description: //描述当前类所属模块
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */
public class MainDemo {

    public static void main(String[] args){
        RmvbPlayerImpl rmvbPlayer = new RmvbPlayerImpl();
        rmvbPlayer.playRmvb("text.rmvb");
    }
}
