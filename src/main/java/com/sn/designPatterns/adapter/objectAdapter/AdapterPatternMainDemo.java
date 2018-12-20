package com.sn.designPatterns.adapter.objectAdapter;

import com.sn.designPatterns.adapter.classAdapter.MediaMP3Player;

/**
 * Copyright (C), 2002-2018, 苏宁易购电子商务有限公司
 * FileName: AdapterPatternMainDemo
 * Author:  18075555
 * Date: 2018/12/19 20:17.
 * Description: //描述当前类所属模块
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */
public class AdapterPatternMainDemo {

    public static void main(String[] args) {
        MediaMP3Player audioPlayer = new MediaAdapter();
        audioPlayer.play("mp4", "alone.mp4");

    }
}
