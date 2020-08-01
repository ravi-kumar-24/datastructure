package com.graph;


import java.util.*;

/**
 * http://www.geeksforgeeks.org/breadth-first-traversal-for-a-graph/
 * http://www.geeksforgeeks.org/depth-first-traversal-for-a-graph/
 */
public class GraphTraversal {

    public void DFS1(Graph<Integer> graph){
       Set<Long> visitedVertex = new HashSet<>();
        Deque<Vertex<Integer>> deque = new ArrayDeque<>();

        for (Vertex<Integer> vertex: graph.getAllVertex()) {
            deque.add(vertex);

            while (!deque.isEmpty() ) {
                visitedVertex.add(vertex.getId());
                System.out.print(vertex.getId()+" ");
                Vertex<Integer> ve = deque.poll();
                for ( Vertex v : ve.getAdjacentVertexes()) {
                    if(!visitedVertex.contains(v.getId()))
                    deque.add(v);
                }

            }

        }

    }

    public void DFS(Graph<Integer> graph){
        Set<Long> visited = new HashSet<Long>();
        for(Vertex<Integer> vertex : graph.getAllVertex()){
            if(!visited.contains(vertex.getId())){
                System.out.println("In DFS "+vertex.getId());
                DFSUtil(vertex,visited);
            }
        }

    }

    private void DFSUtil(Vertex<Integer> v,Set<Long> visited){
        visited.add(v.getId());
        System.out.print(v.getId() + " ");
        for(Vertex<Integer> vertex : v.getAdjacentVertexes()){
            if(!visited.contains(vertex.getId()))
                DFSUtil(vertex,visited);
        }
    }

    public void BFS(Graph<Integer> graph){
        Set<Long> visited = new HashSet<Long>();
        Queue<Vertex<Integer>> q = new LinkedList<Vertex<Integer>>();

        for(Vertex<Integer> vertex: graph.getAllVertex()){
            if(!visited.contains(vertex.getId())){
                q.add(vertex);
                visited.add(vertex.getId());
                while(q.size() != 0){
                    Vertex<Integer> vq = q.poll();
                    System.out.print(vq.getId()+ " ");
                    for(Vertex<Integer> v : vq.getAdjacentVertexes()){
                        if(!visited.contains(v.getId())){
                            q.add(v);
                            visited.add(v.getId());
                        }
                    }
                }
            }
        }

    }

    public void BFS1(Graph<Integer> graph){
        Set<Long> visited = new HashSet<Long>();
        Stack<Vertex<Integer>> q = new Stack<>();

        for(Vertex<Integer> vertex: graph.getAllVertex()){
            if(!visited.contains(vertex.getId())){
                q.add(vertex);
                visited.add(vertex.getId());
                while(q.size() != 0){
                    Vertex<Integer> vq = q.pop();
                    System.out.print(vq.getId()+ " ");
                    for(Vertex<Integer> v : vq.getAdjacentVertexes()){
                        if(!visited.contains(v.getId())){
                            q.add(v);
                            visited.add(v.getId());
                        }
                    }
                }
            }
        }

    }


    public static void main(String args[]){

        Graph<Integer> graph = new Graph<Integer>(true);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 4);
        graph.addEdge(4, 6);
        graph.addEdge(6, 5);
       // graph.addEdge(5, 1);
        graph.addEdge(5,3);

        GraphTraversal g = new GraphTraversal();

        g.BFS(graph);
        System.out.println();
        g.DFS(graph);
        System.out.println();
        g.BFS1(graph);
    }
}