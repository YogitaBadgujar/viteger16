//15) Design a method to return nth smallest element.

package com.jsp.ArrayNewAssignmentQuestions;

import java.util.Scanner;

public class PrintNthSmallestElementInArray15
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array = ");
		int n = sc.nextInt();
		
		int a[] = new int[n];
		
		System.out.print("Enter "+n+" Array Elements = ");
		for(int i=0;i<a.length;i++)
		{
			a[i] = sc.nextInt();
		}
		
		System.out.print("Enter which smallest element you want : ");
		int smallest = sc.nextInt();
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			
		}
		
		for(int i=0;i<a.length;i++)
		{
			if(smallest==i)
			{
				System.out.println(i+" Smallest Element are = "+a[i-1]);
			}
		}
		
		
		
		

	}

}
