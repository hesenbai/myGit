package ruangong;

import java.util.*;
public class Findshortestroad {

		static int[][] maze;//�Թ�����maze n.�Թ� vt.��ʧ��ʹ����
		static int n;//�����С
		static int min;//��̲���
		private static Scanner sc;
		public static void main(String[] args) {
			sc = new Scanner(System.in);
			n = sc.nextInt();
			min = n*n;
			maze = new int[n][n];
			for(int i=0;i<n;i++)
				for(int j=0;j<n;j++) 
					maze[i][j] = sc.nextInt();
			recursion(1, 1, 0);//��ʼ��Ϊ��1��1������ʼ����Ϊ0
			if(min==n*n)
				System.out.println("No solution");
			else 
				System.out.println(min);
		}
		public static void recursion(int x, int y, int count) {
			if(x==n-2 && y==n-2)//�����������ߵ�[n-2][n-2]λ�ü�Ϊ�յ�
				min = Math.min(count, min);
			else {
				maze[x][y]=1;//�߹���λ�ò����ظ��ߣ��ʶ��߹�����Ϊ1���ϰ��
				if(y<n-1 && maze[x][y+1]==0) {
					recursion(x, y+1, count+1);			//��
				}
				if(x<n-1 && maze[x+1][y]==0) {
					recursion(x+1, y, count+1);			//��
				}
				if(x > 1 && maze[x-1][y]== 0) {
					recursion(x-1, y, count+1);			//��
				}
				if(y>1 && maze[x][y-1]==0) {
					recursion(x, y-1, count+1);			//��
				}
				//���ݣ��ָ�ԭ����״̬��
				maze[x][y]=0;//���Ӹô����ڵط�����û���ҵ�����·�������Խ�֮ǰ�߹�������·��״̬�ָ�
			}
		}
	}