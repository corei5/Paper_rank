package code_test;
/**
 *
 * @author tourist800
 */
public class Code_test {
    public static void main(String[] args) {
        
        NodeGeneration ng = new NodeGeneration(1000);
        
        System.out.println("Node list size: " + ng.NodeList.size());
        
        for (int i = 0; i <ng.Size(); i++) {
            Node nd = ng.NodeList.get(i);
            nd.PrintReferenceInfo();
        }
        
        WeightedEdge we = new WeightedEdge(ng.NodeList);
        we.display();
            
    }
            
}
    

