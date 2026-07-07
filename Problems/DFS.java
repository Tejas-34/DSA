import java.util.* ;

class DFS {
    
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // Code here
         
        Stack<Integer> s = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();
        int visited[] = new int[adj.size()];
        
        s.push(0);
        
        while(!s.isEmpty()){
            int node = s.pop();
             
            if(visited[node] == 1)
                continue;
                
            visited[node] = 1;
            ans.add(node);
            
            ArrayList<Integer> list = adj.get(node);
            for(int i=list.size()-1; i>=0; i--){
                if(visited[list.get(i)] != 1){
                    s.push(list.get(i));
                }                    
            }
        }
        
        // resDFS(0, adj, ans, visited);
        return ans;
        
    }
    
    
    private void resDFS(int node, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> ans, int visited[] ){
        visited[node] = 1;
        ans.add(node);
        
        ArrayList<Integer> list = adj.get(node);
        for(int i=0; i<list.size(); i++){
            if(visited[list.get(i)] != 1)
                resDFS(list.get(i), adj, ans, visited);
        }
    }


    public static void main(String[] args) {
        DFS obj = new DFS();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        
        for(int i=0; i<5; i++)
            adj.add(new ArrayList<>());
        
        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(0).add(3);
        
        adj.get(1).add(0);
        adj.get(1).add(4);
        
        adj.get(2).add(0);
        
        adj.get(3).add(0);
        
        adj.get(4).add(1);
        
        System.out.println(obj.dfs(adj));
    }
    
    
}