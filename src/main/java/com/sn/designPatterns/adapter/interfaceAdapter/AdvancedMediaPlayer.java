package com.sn.designPatterns.adapter.interfaceAdapter; /***********************************************************************
 * Module:  AdvancedMediaPlayer.java
 * Author:  suning
 * Purpose: Defines the Interface AdvancedMediaPlayer
 ***********************************************************************/

import java.util.*;


public interface AdvancedMediaPlayer {

   void playVlc(String fileName);

   void playMp4(String fileName);

   void playRmvb(String fileName);

}