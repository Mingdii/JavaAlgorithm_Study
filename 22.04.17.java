import java.util.Scanner;

public class Study_0417
{
	public static void main(String[] args) 
	{
	    int[] arr = new int[5];
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int count=0;
	    
	    System.out.print("5���� ���ڸ� �Է����ּ��� : ");
	    
	    while(true)
	    {
	      if(count>=5)
	      {
	          break;
	      }
	      
	      arr[count] = sc.nextInt();
	      count++;
	    }
	    
	   /* for(int num : arr)
	   {
	       System.out.print(num + " ");
	   }*/
	   
	   // ���� ����� ��� �迭
	   int[] sortedArr = new int[5];
	   // �迭 �����ϴ� �߰� array
	   int[][] tempArr = new int[5][2];
	   
	   // �� ���� -> ���������� arr[i][0] ��°�� arr�� ���� �ְ�, [][1]��°�� 0���� ����
	   for(int i=0; i<arr.length; i++)
	   {
	       tempArr[i][0] = arr[i];
	       tempArr[i][1] = 0;
	   }
	   
	   int max = Integer.MAX_VALUE;
	   int cmp = max;
	   //System.out.print(max);
	   
	   // ��
	   int temp=0;
	   for(int x=0; x < arr.length; x++)
	   {
    	   for(int i=0; i<arr.length; i++)
    	    {
    	        if(tempArr[i][0] < cmp && tempArr[i][1] == 0)
    	        {
    	            cmp = arr[i];
    	            temp = i;
    	        }
    	    }

    	    tempArr[temp][1] = 1;
     	    sortedArr[x] = cmp;
     	    cmp = max;
	   }
	    System.out.println();
	    
	    for(int num : sortedArr)
	    {
	        System.out.print(num + " ");
	    }
	    
	   // sortedArr[0] = cmp;
	   //System.out.print(cmp); 
	    
	    
	}
}