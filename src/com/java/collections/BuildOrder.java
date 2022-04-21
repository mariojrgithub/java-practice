package com.java.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

class Graph {
	
// Total number of vertices present in the graph
	private int noOfVertices;
	
// Adjacency List
	private ArrayList<ArrayList<Character>> adjacencyList;


	Graph(int noOfNodes) {
		noOfVertices = noOfNodes;
		// creating the the adjacency list
		adjacencyList = new ArrayList<ArrayList<Character>>(noOfNodes);
		for (int i = 0; i < noOfNodes; ++i) {
			adjacencyList.add(new ArrayList<Character>());
		}
	}

// create an edge between two nodes of the Directed Acyclic Graph
	void createEdge(Character v, Character w) {
//	subtract by 65 to get 0-5 indexes
		adjacencyList.get((int) (v - 65)).add(w);
	}

//visit the nodes that are adjacent to the current node using recursion
	void topologicalSortUtil(char node, boolean visited[], Stack<Character> stk) {
		System.out.println(node);
// Mark the current node as visited by setting its value to true
		visited[(int) (node - 65)] = true;
		Character j;
		
// iterate through the adjacency list
		Iterator<Character> itr = adjacencyList.get((int) (node - 65)).iterator();
		while (itr.hasNext()) {
			// fetching the adjacent node
			j = itr.next();
			// adjacent node must not be visited
			if (visited[(int) (j - 65)] == false) {
				// recursively traversing the adjacent nodes
				topologicalSortUtil(j, visited, stk);
			}
		}
// Pushing current node to the stack
		stk.push(new Character(node));
	}

// method that does Topological Sorting.
	void topologicalSorting() {
// creating a stack
		Stack<Character> stk = new Stack<Character>();
// creating a boolean array of size equal to number of vertices
		boolean visited[] = new boolean[noOfVertices];
// At First, marking all the nodes as not visited, by assigning false value
		for (int i = 0; i < noOfVertices; i++) {
			visited[i] = false;
		}
// Call the utility method on every node that is not visited
		for (int j = 0; j < noOfVertices; j++) {
			if (visited[j] == false) {
				topologicalSortUtil((char) (j + 65), visited, stk);
			}
		}
// Displaying contents of the stack
		while (stk.empty() == false) {
			System.out.print(stk.pop() + " ");
		}
	}
}

public class BuildOrder {

	public static void main(String argvs[]) {

//		Example:
//		Input:
//		projects: a, b, c, d, e, f
//		dependencies: (a, d), (f, b), (b, d), (f, a), (d, c)
//		Output: f, e, a, b, d, c
		
		Graph g = new Graph(6);
		g.createEdge('A', 'D'); // A -> D
		g.createEdge('F', 'B'); // F -> B
		g.createEdge('B', 'D'); // B -> D
		g.createEdge('E', 'B'); // E -> B
		g.createEdge('F', 'A'); // F -> A
		g.createEdge('D', 'C'); // D -> C
		
// Invoking the method topologicalSorting()
		g.topologicalSorting();
	}
}