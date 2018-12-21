package com.sn.designPatterns.adapter.interfaceAdapter; /***********************************************************************
 * Module:  VlcPlayer.java
 * Author:  suning
 * Purpose: Defines the Class VlcPlayer
 ***********************************************************************/

import java.lang.annotation.*;
import java.util.*;

/** @pdOid 53b3b924-3dc1-4baf-b565-cf143c33b5a3 */
public class VlcPlayer implements AdvancedMediaPlayer {
   /** @param fileName
    * @pdOid 5159f90c-0ff2-40e7-9302-f27a33df6558 */
   @Override
   public void playVlc(String fileName) {
       System.out.println("Playing vlc file. Name:"+ fileName);
   }
   
   /** @param fileName
    * @pdOid 7df45d6b-d731-4d89-98ce-130506b941c3 */
   @Override
   public void playMp4(String fileName) {
   
   }
   
   /** @param fileName
    * @pdOid 46280ede-824c-4dec-9aaa-a07aa1c28890 */
   @Override
   public void playRmvb(String fileName) {
    
   }

}