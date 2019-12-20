/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RIP {

    public static void main(String[] args) {

        List<Node> nodeList = new ArrayList<>();
        Random random = new Random();
        
        Node node0 = new Node("R0");
        Node node1 = new Node("R1");
        Node node2 = new Node("R2");
        Node node3 = new Node("R3");
        Node node4 = new Node("R4");
        Node node5 = new Node("R5");
        Node node6 = new Node("R6");
        Node node7 = new Node("R7");
        Node node8 = new Node("R8");
        Node node9 = new Node("R9");
        Node node10 = new Node("R10");

        System.out.println("Initializing R0 table");
        RoutingTable rt0 = new RoutingTable();
        rt0.addEntry(node1, node0, 1);
        rt0.addEntry(node2, node0, 999);
        rt0.addEntry(node3, node0, 999);
        rt0.addEntry(node4, node0, 999);
        rt0.addEntry(node5, node0, 999);
        rt0.addEntry(node6, node0, 999);
        rt0.addEntry(node7, node0, 999);
        rt0.addEntry(node8, node0, 999);
        rt0.addEntry(node9, node0, 999);
        rt0.addEntry(node10, node0, 999);
        node0.setRoutingTable(rt0);
        nodeList.add(node0);

        System.out.println("Initializing R1 table");
        RoutingTable rt1 = new RoutingTable();
        rt1.addEntry(node0, node1, 1);
        rt1.addEntry(node2, node1, 1);
        rt1.addEntry(node3, node1, 1);
        rt1.addEntry(node4, node1, 999);
        rt1.addEntry(node5, node1, 999);
        rt1.addEntry(node6, node1, 999);
        rt1.addEntry(node7, node1, 999);
        rt1.addEntry(node8, node1, 999);
        rt1.addEntry(node9, node1, 999);
        rt1.addEntry(node10, node1, 999);
        node1.setRoutingTable(rt1);
        nodeList.add(node1);

        System.out.println("Initializing R2 table");
        RoutingTable rt2 = new RoutingTable();
        rt2.addEntry(node0, node2, 999);
        rt2.addEntry(node1, node2, 1);
        rt2.addEntry(node3, node2, 999);
        rt2.addEntry(node4, node2, 999);
        rt2.addEntry(node5, node2, 999);
        rt2.addEntry(node6, node2, 999);
        rt2.addEntry(node7, node2, 999);
        rt2.addEntry(node8, node2, 999);
        rt2.addEntry(node9, node2, 999);
        rt2.addEntry(node10, node2, 999);
        node2.setRoutingTable(rt2);
        nodeList.add(node2);

        System.out.println("Initializing R3 table");
        RoutingTable rt3 = new RoutingTable();
        rt3.addEntry(node0, node3, 999);
        rt3.addEntry(node1, node3, 1);
        rt3.addEntry(node2, node3, 999);
        rt3.addEntry(node4, node3, 1);
        rt3.addEntry(node5, node3, 1);
        rt3.addEntry(node6, node3, 999);
        rt3.addEntry(node7, node3, 999);
        rt3.addEntry(node8, node3, 999);
        rt3.addEntry(node9, node3, 999);
        rt3.addEntry(node10, node3, 999);
        node3.setRoutingTable(rt3);
        nodeList.add(node3);
        
        System.out.println("Initializing R4 table");
        RoutingTable rt4 = new RoutingTable();
        rt4.addEntry(node0, node4, 999);
        rt4.addEntry(node1, node4, 999);
        rt4.addEntry(node2, node4, 999);
        rt4.addEntry(node3, node4, 1);
        rt4.addEntry(node5, node4, 999);
        rt4.addEntry(node6, node4, 1);
        rt4.addEntry(node7, node4, 999);
        rt4.addEntry(node8, node4, 999);
        rt4.addEntry(node9, node4, 999);
        rt4.addEntry(node10, node4, 999);
        node4.setRoutingTable(rt4);
        nodeList.add(node4);
        
        System.out.println("Initializing R5 table");
        RoutingTable rt5 = new RoutingTable();
        rt5.addEntry(node0, node5, 999);
        rt5.addEntry(node1, node5, 999);
        rt5.addEntry(node2, node5, 999);
        rt5.addEntry(node3, node5, 1);
        rt5.addEntry(node4, node5, 999);
        rt5.addEntry(node6, node5, 1);
        rt5.addEntry(node7, node5, 999);
        rt5.addEntry(node8, node5, 1);
        rt5.addEntry(node9, node5, 999);
        rt5.addEntry(node10, node5, 999);
        node5.setRoutingTable(rt5);
        nodeList.add(node5);
        
        System.out.println("Initializing R6 table");
        RoutingTable rt6 = new RoutingTable();
        rt6.addEntry(node0, node6, 999);
        rt6.addEntry(node1, node6, 999);
        rt6.addEntry(node2, node6, 999);
        rt6.addEntry(node3, node6, 999);
        rt6.addEntry(node4, node6, 1);
        rt6.addEntry(node5, node6, 1);
        rt6.addEntry(node7, node6, 1);
        rt6.addEntry(node8, node6, 999);
        rt6.addEntry(node9, node6, 999);
        rt6.addEntry(node10, node6, 999);
        node6.setRoutingTable(rt6);
        nodeList.add(node6);
        
        System.out.println("Initializing R7 table");
        RoutingTable rt7 = new RoutingTable();
        rt7.addEntry(node0, node7, 999);
        rt7.addEntry(node1, node7, 999);
        rt7.addEntry(node2, node7, 999);
        rt7.addEntry(node3, node7, 999);
        rt7.addEntry(node4, node7, 999);
        rt7.addEntry(node5, node7, 999);
        rt7.addEntry(node6, node7, 1);
        rt7.addEntry(node8, node7, 999);
        rt7.addEntry(node9, node7, 999);
        rt7.addEntry(node10, node7, 999);
        node7.setRoutingTable(rt7);
        nodeList.add(node7);
        
        System.out.println("Initializing R8 table");
        RoutingTable rt8 = new RoutingTable();
        rt8.addEntry(node0, node8, 999);
        rt8.addEntry(node1, node8, 999);
        rt8.addEntry(node2, node8, 999);
        rt8.addEntry(node3, node8, 999);
        rt8.addEntry(node4, node8, 999);
        rt8.addEntry(node5, node8, 1);
        rt8.addEntry(node6, node8, 999);
        rt8.addEntry(node7, node8, 999);
        rt8.addEntry(node9, node8, 1);
        rt8.addEntry(node10, node8, 1);
        node8.setRoutingTable(rt8);
        nodeList.add(node8);

        System.out.println("Initializing R9 table");
        RoutingTable rt9 = new RoutingTable();
        rt9.addEntry(node0, node9, 999);
        rt9.addEntry(node1, node9, 999);
        rt9.addEntry(node2, node9, 999);
        rt9.addEntry(node3, node9, 999);
        rt9.addEntry(node4, node9, 999);
        rt9.addEntry(node5, node9, 999);
        rt9.addEntry(node6, node9, 999);
        rt9.addEntry(node7, node9, 999);
        rt9.addEntry(node8, node9, 1);
        rt9.addEntry(node10, node9, 999);
        node9.setRoutingTable(rt9);
        nodeList.add(node9);
        
        System.out.println("Initializing R10 table");
        RoutingTable rt10 = new RoutingTable();
        rt10.addEntry(node0, node10, 999);
        rt10.addEntry(node1, node10, 999);
        rt10.addEntry(node2, node10, 999);
        rt10.addEntry(node3, node10, 999);
        rt10.addEntry(node4, node10, 999);
        rt10.addEntry(node5, node10, 999);
        rt10.addEntry(node6, node10, 999);
        rt10.addEntry(node7, node10, 999);
        rt10.addEntry(node8, node10, 1);
        rt10.addEntry(node9, node10, 999);
        node10.setRoutingTable(rt10);
        nodeList.add(node10);

        
        System.out.println("---------- 초기 테이블 ----------");
        node0.showRoutingTable();
        node1.showRoutingTable();
        node2.showRoutingTable();
        node3.showRoutingTable();
        node4.showRoutingTable();
        node5.showRoutingTable();
        node6.showRoutingTable();
        node7.showRoutingTable();
        node8.showRoutingTable();
        node9.showRoutingTable();
        node10.showRoutingTable();
        System.out.println("---------- 시작 ----------");
        
        try {
            node0.start();
            Thread.sleep(random.nextInt(1500));
            node1.start();
            Thread.sleep(random.nextInt(1500));
            node2.start();
            Thread.sleep(random.nextInt(1500));
            node3.start();
            Thread.sleep(random.nextInt(1500));
            node4.start();
            Thread.sleep(random.nextInt(1500));
            node5.start();
            Thread.sleep(random.nextInt(1500));
            node6.start();
            Thread.sleep(random.nextInt(1500));
            node7.start();
            Thread.sleep(random.nextInt(1500));
            node8.start();
            Thread.sleep(random.nextInt(1500));
            node9.start();
            Thread.sleep(random.nextInt(1500));
            node10.start();
        } catch (InterruptedException ex) {
            Logger.getLogger(RIP.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        System.out.println("---------- 최종 테이블 ----------");
        node0.showRoutingTable();
        node1.showRoutingTable();
        node2.showRoutingTable();
        node3.showRoutingTable();
        node4.showRoutingTable();
        node5.showRoutingTable();
        node6.showRoutingTable();
        node7.showRoutingTable();
        node8.showRoutingTable();
        node9.showRoutingTable();
        node10.showRoutingTable();
        System.out.println("---------- 종료 ----------");
    }

}
