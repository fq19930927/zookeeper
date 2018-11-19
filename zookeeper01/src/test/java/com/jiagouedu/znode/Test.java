package com.jiagouedu.znode;

import com.jiagouedu.zookeeper.znode.ZookeeperCrud;
import org.apache.zookeeper.KeeperException;

public class Test {
   public static void main(String[] args) throws KeeperException, InterruptedException {
      ZookeeperCrud zookeeperCrud=new ZookeeperCrud();
      if(null!=zookeeperCrud.exists("/wukong"))
      zookeeperCrud.delete("/wukong");
      zookeeperCrud.createPersistent("/wukong","abc");
      System.out.println(zookeeperCrud.getData("/wukong"));;

   }
}
