package com.sn.designPatterns.adapter.interfaceAdapter; /***********************************************************************
 * Module:  AdvancedMediaPlayer.java
 * Author:  suning
 * Purpose: Defines the Interface AdvancedMediaPlayer
 ***********************************************************************/

import java.util.*;

/** @pdOid c1150512-3e33-4ba3-8db2-f3d2b6a80b7a */
public interface AdvancedMediaPlayer {
   /** @param fileName
    * @pdOid afa37ee9-44c2-4706-ab82-796ee8234c51 */
   void playVlc(String fileName);
   /** @param fileName
    * @pdOid 657c6c80-dcb4-42b8-8586-7476d8731bd8 */
   void playMp4(String fileName);
   /** @param fileName
    * @pdOid 12f7df80-ff31-43b8-a547-3247f8b0dceb */
   void playRmvb(String fileName);

}