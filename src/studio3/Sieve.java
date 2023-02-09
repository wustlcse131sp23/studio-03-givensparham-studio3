package studio3;

import java.util.Arrays;
import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("What is the n value? ");
		int n = in.nextInt();
		int[] numbers = new int[n + 1];
		for(int i = 2; i < n; i++)
		{
			numbers[i] = i;
		}
		boolean[] parallel = new boolean [n + 1];
		for(int i = 0; i < n + 1; i++)
		{
			parallel[i] = true;
		}
		for(int x = 2; x < n; x++)
		{
			for(int y = 2; x * y <= n; y++)
			{
				parallel[x * y] = false;
			}
		}
		for(int i = 2; i < n; i++)
		{
			if (parallel[i])
			{
				System.out.println(i);
			}
		}
		//System.out.println(Arrays.toString(parallel));

	}}