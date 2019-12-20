import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Node extends Thread {

    private String nodeId;
    private RoutingTable routingTable;

    public Node(String Id) {
        this.nodeId = Id;
    }

    public void updateRoutingTable(RoutingTable neighborTable, Node whoSent) {
        int costToWhoSent = 0;
       
        for (TableEntry neighborEntry : neighborTable.getRoutingTable()) {
            for (TableEntry currentEntry : this.routingTable.getRoutingTable()) {

                Node nDest = neighborEntry.getDestinationRouter();

                    costToWhoSent = this.getRoutingTable().getEntry(whoSent).getCost();
              
                if (currentEntry.getDestinationRouter() == nDest) {
                  
                    int totalCost = (neighborEntry.getCost() + costToWhoSent);
                    if (totalCost < 16) {
                    	if (currentEntry.getCost() == 999 || totalCost < currentEntry.getCost()) {
                    		System.out.println("*-> " + this.getNodeId() + " 업데이트 됨 (광고 "+whoSent+")");
                    		System.out.println("입력 "+ currentEntry);
                    		System.out.println("현재 "+ nDest + " | "+whoSent + " | "+totalCost);
                    		currentEntry.setDestinationRouter(nDest);
                    		currentEntry.setNextRouter(whoSent);
                    		currentEntry.setCost(totalCost);
                    		this.sendUpdateTable();
                    		this.showRoutingTable();
                    	}
                    }
                }
            }
        }
    }

    public void sendUpdateTable() {

        for (Node n : this.getNeighborList()) {
            n.updateRoutingTable(this.routingTable, this);
        }
    }

    public List<Node> getNeighborList() {
        List<Node> nList = new ArrayList<>();
        for (int i = 0; i < this.routingTable.getRoutingTable().size(); i++) {
            if (this.routingTable.getRoutingTable().get(i).getCost() < 999) {
                nList.add(this.routingTable.getRoutingTable().get(i).getDestinationRouter());
            }
        }
        return nList;
    }

    public void showRoutingTable() {
        List<TableEntry> table = routingTable.getRoutingTable();
        System.out.println("------------ " + this.getNodeId() + " RoutingTable -----------");
        System.out.println("|    Dest    |    Next    |    Cost    |");

        for (TableEntry t : table) {
            System.out.println("----------------------------------------");
            System.out.print("      " + t.getDestinationRouter().getNodeId() + "     ");
            System.out.print("      " + t.getNextRouter().getNodeId() + "     ");
            System.out.print("      " + t.getCost());
            System.out.println("");
        }
        System.out.println("----------------------------------------\n");
        
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public RoutingTable getRoutingTable() {
        return routingTable;
    }

    public void setRoutingTable(RoutingTable routingTable) {
        this.routingTable = routingTable;
    }

    @Override
    public String toString() {
        return this.getNodeId();
    }

    @Override
    public void run() {

            try {
                sleep(2000);
                this.sendUpdateTable();
            } catch (InterruptedException ex) {
                Logger.getLogger(Node.class.getName()).log(Level.SEVERE, null, ex);
            }

    }
}
