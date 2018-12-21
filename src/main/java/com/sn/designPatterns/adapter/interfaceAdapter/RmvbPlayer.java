package com.sn.designPatterns.adapter.interfaceAdapter; /***********************************************************************
 * Module:  RmvbPlayer.java
 * Author:  suning
 * Purpose: Defines the Class RmvbPlayer
 ***********************************************************************/

import java.lang.annotation.*;
import java.util.*;

/** @pdOid b9ad4b8e-5ee9-4940-b621-67376889d4d0 */
public class RmvbPlayer implements AdvancedMediaPlayer {
   /** @param fileName
    * @pdOid 9bc67c28-d14f-4d12-9ca8-61d58afb3b0d */
   @Override
   public void playVlc(String fileName) {
       
   }
   
   /** @param fileName
    * @pdOid 538b4866-90ec-4867-b3c8-9d0c70f2ac75 */
   @Override
   public void playMp4(String fileName) {
   
   }
   
   /** @param fileName
    * @pdOid 923b9a64-0e0b-4435-abc4-3428c66da8a9 */
   @Override
   public void playRmvb(String fileName) {
    System.out.println("Playing Rmvb file. Name:"+ fileName);
   }

}