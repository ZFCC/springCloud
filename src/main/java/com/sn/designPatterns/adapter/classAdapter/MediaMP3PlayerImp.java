package com.sn.designPatterns.adapter.classAdapter;


import com.sn.designPatterns.adapter.objectsAdapter.MediaMP3Player;

/**
 * Copyright (C), 2002-2018,
 * FileName: MediaMP3PlayerImp
 * Author:  18075555
 * Date: 2018/12/19 20:14.
 * Description: //描述当前类所属模块
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */
public class MediaMP3PlayerImp implements MediaMP3Player {


    @Override
    public void play(String audioType, String fileName) {
      /*  //播放 mp3 音乐文件的内置支持
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file. Name: " + fileName);
        }
        //mediaAdapter 提供了播放其他文件格式的支持
        else if (audioType.equalsIgnoreCase("vlc")
                || audioType.equalsIgnoreCase("mp4")) {


        } else {
            System.out.println("Invalid media. " +
                    audioType + " format not supported");
        }*/

    }
}
