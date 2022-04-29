package com.java.collections;

import java.util.ArrayList;
import java.util.List;

public class RobotInGrid {
	
	// class to create a point
	class Point{
		int row;
		int col;
		
		public Point(int row, int col) {
			this.row = row;
			this.col = col;
		}
	}
	
	public List<Point> getPath(boolean[][] maze){
		
		// return null if the maze is invalid
		if (maze == null || maze.length == 0) {
			return null;
		}
		
		// create list to hold the result
		List<Point> result = new ArrayList<>();
		
		if(getPath(maze, maze.length - 1, maze[0].length -1, result)) {
			return result;
		}
		
		return null;
	}

	private boolean getPath(boolean[][] maze, int row, int col, List<Point> result) {
		// check if the point is out of bounds or off limits
		if(!maze[row][col] || col < 0 || row < 0) {
			return false;
		}
		
		// create boolean to see if we have made it to the origin
		boolean atOrigin = (row == 0) && (col == 0);
		
		// start from bottom right either up or left and check each adjacent cell or if at the origin
		if(getPath(maze, row, col - 1, result) || getPath(maze, row - 1, col, result) || atOrigin) {
			// create a point and add to result
			Point p = new Point(row, col);
			result.add(p);
			
			return true;
		}
		
		return false;
	}

}
