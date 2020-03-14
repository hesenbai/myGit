package ruangong;

import java.util.*;
public  class Findshortestroad_changed {

		public static int[][] maze; 
		public static int mazeofsize;      //�����С
		public static int min;    //��̲���
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
			recursion(1, 1, 0);   //��ʼ��Ϊ��1��1������ʼ����Ϊ0
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
			if(coord_x==mazeofsize-2 && coord_y==mazeofsize-2)   //�����������ߵ�[n-2][n-2]λ�ü�Ϊ�յ�
				{
					min = Math.min(count, min);
				}
			else {
				maze[coord_x][coord_y]=1;//�߹���λ�ò����ظ��ߣ��ʶ��߹�����Ϊ1���ϰ��
				if(coord_y<mazeofsize-1 && maze[coord_x][coord_y+1]==0) {
					recursion(coord_x, coord_y+1, count+1);			//��
				}
				if(coord_x<mazeofsize-1 && maze[coord_x+1][coord_y]==0) {
					recursion(coord_x+1, coord_y, count+1);			//��
				}
				if(coord_x>1 && maze[coord_x-1][coord_y]==0) {
					recursion(coord_x-1, coord_y, count+1);			//��
				}
				if(coord_y>1 && maze[coord_x][coord_y-1]==0) {
					recursion(coord_x, coord_y-1, count+1);			//��
				}
				//���ݣ��ָ�ԭ����״̬��
				maze[coord_x][coord_y]=0;//���Ӹô����ڵط�����û���ҵ�����·�������Խ�֮ǰ�߹�������·��״̬�ָ�
			}
		}
	}

