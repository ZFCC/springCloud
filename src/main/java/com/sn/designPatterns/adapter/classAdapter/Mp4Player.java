package com.sn.designPatterns.adapter.classAdapter;


/**
 * Copyright (C), 2002-2018, 苏宁易购电子商务有限公司
 * FileName: Mp4Player
 * Author:  18075555
 * Date: 2018/12/19 20:08.
 * Description: //描述当前类所属模块
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing Mp4 file. Name:"+ fileName);
    }
}
