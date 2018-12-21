package com.sn.designPatterns.adapter.interfaceAdapter; /***********************************************************************
 * Module:  RmvbPlayerImpl.java
 * Author:  suning
 * Purpose: Defines the Class RmvbPlayerImpl
 ***********************************************************************/

import java.lang.annotation.*;
import java.util.*;


public class RmvbPlayerChild extends MediaAdapter {

   @Override
   public void playRmvb(String fileName) {
    System.out.println("Playing Rmvb file. Name:"+ fileName);
   }

}