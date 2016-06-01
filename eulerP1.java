/*
	Project Euler
	Problem 1
*/
import java.util.*;


public class eulerP1{
	public static void main (String[]args){

		Scanner in = new Scanner(System.in);

		System.out.print("Enter a #:");

		int a = in.nextInt();

		multiSum(a);
	}//main

		public static void multiSum(int a){

			ArrayList<Integer> multiples = new ArrayList<>();
			int sum = 0;

			for(int i=0;i<a;i++){

				if(i%3 == 0 || i%5 == 0){
					multiples.add(i);
				}//if
				for(int j=0;j<multiples.size();j++){
					sum += multiples.get(j);
				}//for
			}//for
			System.out.println("Sum: "+sum);
		}//multiSum
}//eulerP1