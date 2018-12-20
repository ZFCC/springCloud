package com.sn.designPatterns.adapter.classAdapter;

/**
 * Copyright (C), 2002-2018, 苏宁易购电子商务有限公司
 * FileName: MediaAdapter，创建实现了 MediaMP3Player 接口的适配器类。
 * Author:  18075555
 * Date: 2018/12/19 20:11.
 * Description: //描述当前类所属模块
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */
public class MediaAdapter implements MediaMP3Player {

    //注入类，
    AdvancedMediaPlayer advancedMusicPlayer;


    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("vlc") ){
            advancedMusicPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMusicPlayer.playVlc(fileName);
        }else if(audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer.playMp4(fileName);
        }
    }
}
