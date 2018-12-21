package com.sn.designPatterns.adapter.interfaceAdapter; /***********************************************************************
 * Module:  RmvbPlayerImpl.java
 * Author:  suning
 * Purpose: Defines the Class RmvbPlayerImpl
 ***********************************************************************/

import java.lang.annotation.*;
import java.util.*;

/** @pdOid 035780b6-d7c6-4f8f-b9c9-5f5d080785b1 */
public class RmvbPlayerImpl extends MediaAdapter {
   /** @param fileName
    * @pdOid 7ea32c4f-a489-4389-a3b6-b08f4bb7b9c8 */
   @Override
   public void playRmvb(String fileName) {
    System.out.println("Playing Rmvb file. Name:"+ fileName);
   }

}