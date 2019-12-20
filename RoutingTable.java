
import java.util.ArrayList;

public class RoutingTable {

    private ArrayList<TableEntry> routingTable;

    public RoutingTable() {
        this.routingTable = new ArrayList<>();
    }

    public RoutingTable(ArrayList<TableEntry> rt) {
        this.routingTable = rt;
    }

    public void addEntry(Node destionationRouter, Node nextRouter, Integer numberHops) {
        TableEntry newEntry = new TableEntry(destionationRouter, nextRouter, numberHops);
        this.routingTable.add(newEntry);
    }

    public void updateEntry(Node destinationRouter, Node nextRouter, Integer totalCost) {

        for (TableEntry entry : this.routingTable) {

            if (entry.getDestinationRouter().equals(destinationRouter)) {

                entry.setCost(totalCost);
                entry.setNextRouter(nextRouter);

            }
        }
    }

    public TableEntry getEntry(Node nDest) {
        for (TableEntry entry : this.routingTable) {

            if (entry.getDestinationRouter().equals(nDest)) {

                return entry;

            }
        }
        return null;
    }

    public ArrayList<TableEntry> getRoutingTable() {
        return routingTable;
    }

    public void setRoutingTable(ArrayList<TableEntry> routingTable) {
        this.routingTable = routingTable;
    }

    @Override
    public String toString() {
        String r = "";
        for (TableEntry e : this.routingTable) {
            r += e.toString() + "\n";
        }
        return r;
    }
}
