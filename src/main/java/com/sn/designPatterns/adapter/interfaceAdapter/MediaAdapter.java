package com.sn.designPatterns.adapter.interfaceAdapter; /***********************************************************************
 * Module:  MediaAdapter.java
 * Author:  suning
 * Purpose: Defines the Class MediaAdapter
 ***********************************************************************/

import java.util.*;

/** @pdOid 498c0748-9352-4d4f-9c9f-c00270fd4253 */
public abstract class MediaAdapter implements AdvancedMediaPlayer {
   /** @param fileName
    * @pdOid 2cb9dc4b-ab94-404c-9658-47981799b00d */
   public void playVlc(String fileName) {}
   
   /** @param fileName
    * @pdOid fbf80ec2-e562-435a-9787-0cd683660f06 */
   public void playMp4(String fileName) {}
   
   /** @param fileName
    * @pdOid a97d2fb5-2a42-4ad1-a09e-b942adbb94b3 */
   public void playRmvb(String fileName) {}

}