
public class TableEntry {

    private Node destinationRouter;
    private Node nextRouter;
    private Integer cost;

    public TableEntry(Node destionationRouter, Node nextRouter, Integer c) {
        this.destinationRouter = destionationRouter;
        this.nextRouter = nextRouter;
        this.cost = c;
    }

    public Node getDestinationRouter() {
        return destinationRouter;
    }

    public void setDestinationRouter(Node destionationRouter) {
        this.destinationRouter = destionationRouter;
    }

    public Node getNextRouter() {
        return nextRouter;
    }

    public void setNextRouter(Node nextRouter) {
        this.nextRouter = nextRouter;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer numberHops) {
        this.cost = numberHops;
    }

    @Override
    public String toString() {
        return getDestinationRouter() +" | "+ getNextRouter() +" | "+ getCost();
    }
    
    

}
