import java.util.Scanner;

/* 선택정렬 짜보기

public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.print("5개의 정수를 입력해주세요 : ");
	    int count=0;
	    
	    int arr[] = new int[5];
	    
	    while(true)
	    {

	        // ArrayIndexOutOfBoundsException 을 방지하기 위해 미리 방지하는 코드
	        // try-catch 구문은 되도록 사용하지 않고 가드하는 코드를 넣어줄 것.
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

// 퀵 정렬 테스트 ver. → 실패(알고리즘 논리 과정 좀더 고민해볼 것) → 22.05.15 파일에서 완성함

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
	   
	   //int pivot = arr[0]; // pivot 값을 for 문 밖에 빼야 for 문 안에서 계속 pivot 값이 arr[0] 의 값으로 세팅되지 않음
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
               arr[prIdx] = pivot; // arr[0] = pivot 다만 pivot 바뀌는 것을 명확하게 하기 위함
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
