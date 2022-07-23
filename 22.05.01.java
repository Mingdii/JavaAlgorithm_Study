import java.util.Scanner;

// 버블정렬 연습

public class Main
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
	   
	  int temp = 0; 
	   
	  for(int i=0; i<arr.length; i++)  //-- 횟수
	  {
	      for(int j=1; j<arr.length-i; j++) //-- 비교 swap
	      {
	          if(arr[j-1]> arr[j])
	          {
	              temp = arr[j-1];
	              arr[j-1] = arr[j];
	              arr[j] = temp;
	              
	          }
	      }
	  }
	    
	   for(int num : arr)
	   {
	       System.out.println(num);
	   }
		
	}
}