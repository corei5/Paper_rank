package code_test;
/**
 *
 * @author tourist800
 */
public class Code_test {
    
    public static int NoN = 50; //Non-> Number of nodes
    
    public static void main(String[] args) {
        if (NoN < 31) NoN = 30;
          
        NodeGeneration ng = new NodeGeneration(NoN);
        
        System.out.println("Node list size: " + ng.NodeList.size());
        
        for (int i = 0; i <ng.Size(); i++) {
            Node nd = ng.NodeList.get(i);
            nd.PrintReferenceInfo();
        }
        
        WeightedEdge we = new WeightedEdge(ng.NodeList);
        we.display();
            
    }
            
}
    

