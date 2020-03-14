package ruangong;

import java.util.*;
public  class Findshortestroad_changed {

		public static int[][] maze; 
		public static int mazeofsize;      //矩阵大小
		public static int min;    //最短步长
		@SuppressWarnings("resource")
		public final static void main(String[] args){
			final Scanner  sc = new Scanner(System.in);
			mazeofsize = sc.nextInt();
			min = mazeofsize*mazeofsize;
			maze = new int[mazeofsize][mazeofsize];
			for(int i=0;i<mazeofsize;i++) {
				for(int j=0;j<mazeofsize;j++){
					maze[i][j] = sc.nextInt();
					}
				}
			recursion(1, 1, 0);   //起始点为（1，1），初始步长为0
			if(min==mazeofsize*mazeofsize)
			{
				System.out.println("No solution");
			}
			else 
			{
				System.out.println(min);
			}
		}
		public static void recursion(final int coord_x,final int coord_y,final int count) {
			if(coord_x==mazeofsize-2 && coord_y==mazeofsize-2)   //跳出条件，走到[n-2][n-2]位置即为终点
				{
					min = Math.min(count, min);
				}
			else {
				maze[coord_x][coord_y]=1;//走过的位置不能重复走，故而走过就设为1（障碍物）
				if(coord_y<mazeofsize-1 && maze[coord_x][coord_y+1]==0) {
					recursion(coord_x, coord_y+1, count+1);			//右
				}
				if(coord_x<mazeofsize-1 && maze[coord_x+1][coord_y]==0) {
					recursion(coord_x+1, coord_y, count+1);			//下
				}
				if(coord_x>1 && maze[coord_x-1][coord_y]==0) {
					recursion(coord_x-1, coord_y, count+1);			//上
				}
				if(coord_y>1 && maze[coord_x][coord_y-1]==0) {
					recursion(coord_x, coord_y-1, count+1);			//左
				}
				//回溯，恢复原来的状态，
				maze[coord_x][coord_y]=0;//即从该处相邻地方出发没有找到完整路径，所以将之前走过的这条路径状态恢复
			}
		}
	}

