package com.sn.designPatterns.adapter.interfaceAdapter; /***********************************************************************
 * Module:  Mp4Player.java
 * Author:  suning
 * Purpose: Defines the Class Mp4Player
 ***********************************************************************/

import java.lang.annotation.*;
import java.util.*;

/** @pdOid c6d1fd0a-1d5e-48f5-a1c2-9e126865658f */
public class Mp4Player implements AdvancedMediaPlayer {
   /** @param fileName
    * @pdOid 5ae09fcf-2544-4aff-8e97-163991f23b24 */
   @Override
   public void playVlc(String fileName) {
   
   }
   
   /** @param fileName
    * @pdOid 3d8f9f51-0425-40e1-8f2e-b7091d5cdbb8 */
   @Override
   public void playMp4(String fileName) {
       System.out.println("Playing Mp4 file. Name:"+ fileName);
   }
   
   /** @param fileName
    * @pdOid 446fc0fc-9867-430e-a617-b3d15e11b778 */
   @Override
   public void playRmvb(String fileName) {
   
   }

}