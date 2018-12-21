package com.sn.designPatterns.adapter.interfaceAdapter; /***********************************************************************
 * Module:  MediaAdapter.java
 * Author:  suning
 * Purpose: Defines the Class MediaAdapter
 ***********************************************************************/

import java.util.*;

public abstract class MediaAdapter implements AdvancedMediaPlayer {

   public void playVlc(String fileName) {}
   

   public void playMp4(String fileName) {}
   

   public void playRmvb(String fileName) {}

}