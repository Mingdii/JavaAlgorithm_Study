import java.util.Scanner;

/* �������� ¥����

public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.print("5���� ������ �Է����ּ��� : ");
	    int count=0;
	    
	    int arr[] = new int[5];
	    
	    while(true)
	    {

	        // ArrayIndexOutOfBoundsException �� �����ϱ� ���� �̸� �����ϴ� �ڵ�
	        // try-catch ������ �ǵ��� ������� �ʰ� �����ϴ� �ڵ带 �־��� ��.
	       if(count >= 5)
	        {
	            break;
	        }
	        //System.out.print(count);
	        arr[count] = sc.nextInt();
	        count++;
	    }
	   
	    
	    int temp;
	    
	    for(int i=0; i<arr.length; i++)
	    {
	        if(i == arr.length - 1)
	        break;
	        
	        for(int j=i+1; j<arr.length; j++)
	        {
	            if(arr[i] > arr[j])
	            {
	                temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	            }
	        }
	        
	    }
	    
	    for(int num : arr)
	    {
	        System.out.print(num + " ");
	    }
	}
}

------------------------------------------------------------------------------------------*/

import java.util.Scanner;

// �� ���� �׽�Ʈ ver. �� ����(�˰��� �� ���� ���� ����غ� ��) �� 22.05.15 ���Ͽ��� �ϼ���

public class Main
{
	public static void main(String[] args) 
	{
	   int[] arr = {3, 7, 2, 9, 4, 6, 1};
	   for(int num : arr)
	   {
	        System.out.print(num + " ");
	   }
	   System.out.println();
	   
	   //int pivot = arr[0]; // pivot ���� for �� �ۿ� ���� for �� �ȿ��� ��� pivot ���� arr[0] �� ������ ���õ��� ����
	   int pivot = 0;

	   int plIdx = 0;
	   int prIdx = 0;
	   
	   int pivotIdx = 0;//

       for(;;)
       {
           for(int i = pivotIdx; i < arr.length-1; i++)
           if(pivot > arr[i+1])
           {
               plIdx = i+1;
               break;
           }
           
           for(int i = arr.length-1; i >= pivotIdx; i--)
           {
    	       if(pivot < arr[i])
    	       {
    	           prIdx = i;
    	           break;
    	       }
    	       
    	       if(i == pivotIdx)
    	       {
    	           pivotIdx++;
    	       }
           }
           
           if(prIdx - plIdx < 0)
           {
               int temp = arr[prIdx];
               arr[prIdx] = pivot; // arr[0] = pivot �ٸ� pivot �ٲ�� ���� ��Ȯ�ϰ� �ϱ� ����
               arr[pivotIdx] = temp;
           }
           else
           {
               int temp = arr[prIdx];
               arr[prIdx] = arr[plIdx];
               arr[plIdx] = temp;
           }
           
           System.out.println(pivotIdx);
           if(pivotIdx == arr.length-1) break;
       }
       for(int num : arr)
	   {
	        System.out.print(num + " ");
	   }
	 
	}
}
