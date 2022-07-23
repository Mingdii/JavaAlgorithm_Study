import java.util.Scanner;

public class Study_0417
{
	public static void main(String[] args) 
	{
	    int[] arr = new int[5];
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int count=0;
	    
	    System.out.print("5개의 숫자를 입력해주세요 : ");
	    
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
	   
	   // 최종 결과값 담는 배열
	   int[] sortedArr = new int[5];
	   // 배열 정리하는 중간 array
	   int[][] tempArr = new int[5][2];
	   
	   // 값 세팅 -> 일차적으로 arr[i][0] 번째에 arr의 값을 넣고, [][1]번째에 0으로 세팅
	   for(int i=0; i<arr.length; i++)
	   {
	       tempArr[i][0] = arr[i];
	       tempArr[i][1] = 0;
	   }
	   
	   int max = Integer.MAX_VALUE;
	   int cmp = max;
	   //System.out.print(max);
	   
	   // 비교
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