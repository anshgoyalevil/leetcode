class Node{
    
    int src;
    int nbr;
    
    Node(int src, int nbr){
        
        this.src = src;
        this.nbr = nbr;
        
    }
    
}

class Solution {
    
    ArrayList<ArrayList<Node>> adjList = new ArrayList<>();
    
    
    
    public void addEdge(int a, int b){
        
        adjList.get(a).add(new Node(a, b));
        adjList.get(b).add(new Node(b, a));
        
    }
    
    public boolean isPath(ArrayList<ArrayList<Node>> adjList, boolean visited[], int src, int dest){
        
        if(src == dest){
            return true;
        }
        
        visited[src] = true;
        
        for(Node node : adjList.get(src)){
            
            if(visited[node.nbr] == false){
                
                boolean res = isPath(adjList, visited, node.nbr, dest);
                
                if(res){
                    return true;
                }
                
            }
            
        }
        
        return false;
        
    }
    
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        
        for(int i = 0; i<n; i++){
            adjList.add(new ArrayList<>());
        }
        
        for(int i = 0; i<edges.length; i++){
            int a = edges[i][0];
            int b = edges[i][1];
            addEdge(a, b);
        }
        
        boolean[] visited = new boolean[n];
        
        boolean isPath = isPath(adjList, visited, source, destination);
        
        return isPath;
        
    }
}