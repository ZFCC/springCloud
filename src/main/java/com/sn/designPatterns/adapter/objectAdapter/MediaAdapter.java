package com.sn.designPatterns.adapter.objectAdapter;

import com.sn.designPatterns.adapter.classAdapter.MediaMP3Player;
import com.sn.designPatterns.adapter.classAdapter.MediaMP3PlayerImp;

/**
 * Copyright (C), 2002-2018, 苏宁易购电子商务有限公司
 * FileName: MediaAdapter
 * Author:  18075555
 * Date: 2018/12/19 20:52.
 * Description: //描述当前类所属模块
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */
public class MediaAdapter extends Mp4Player implements MediaMP3Player {
    @Override
    public void play(String audioType, String fileName) {
        playMp4(fileName);
    }

}
