package Branching_Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class Maze_Path_Problem {

	public static ArrayList<String> getMazePaths(int sr,int sc,int dr,int dc){
		if(sr==dr&& sc==dc) {
			ArrayList<String> bres=new ArrayList<>();
					bres.add("");
			return bres;
		}
		ArrayList<String> hpaths=new ArrayList<>();
		ArrayList<String> vpaths=new ArrayList<>();
		if(sc<dc) {//if in last column then only horizontal move is possible
			hpaths=getMazePaths(sr,sc+1,dr,dc);
		}
		if(sr<dr) {//if in last row then only vertical move is possible
			vpaths=getMazePaths(sr+1,sc,dr,dc);
		}
		ArrayList<String> paths=new ArrayList<>();
		for(String hpath:hpaths) {
			paths.add("h"+hpath);
		}
		for(String vpath:vpaths) {
			paths.add("v"+vpath);
		}
		return paths;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		ArrayList<String> paths=getMazePaths(1,1,n,m);
		System.out.println(paths);

	}

}
