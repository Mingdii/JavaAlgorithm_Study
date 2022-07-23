import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class Main
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		/*

			System.out.println("세 개의 정수를 입력하세요 : ");
			
			int a = stdIn.nextInt();
			int b = stdIn.nextInt();
			int c = stdIn.nextInt();
			
			int maxNum = 0;
			 
			if (a >= maxNum)
			{
				maxNum = a;
			}
			if (b >= maxNum)
			{
			  maxNum = b;
			}
			if (c >= maxNum)
			{
			   maxNum = c;
			}

		*/
		
		int[] arr = new int[3];
		
		System.out.print("세 개의 정수를 입력해주세요.");
		
		for (int i=0; i < arr.length; i++)
		{
		    arr[i] = stdIn.nextInt();
		}
		int maxNum = 0;
		
		for (int i=0; i < arr.length; i++)
		{
		    if( arr[i] >= maxNum)
		    {
		        maxNum = arr[i];
		    }
	
		}
		// 배열 arr 을 asList 로 
		Integer[] num2= {1,2,3,4,5};
		//List tmpList = Arrays.asList(arr);
		List<Integer> tmpList = Arrays.asList(num2);
		//List<Integer> tmpList2 = Arrays.asList(1,2,3);
		
		Collections.shuffle(tmpList);
	    //-> object 타입으로 변환
	    
	    // tmpList 의 object 를 num 으로 빼서 쓰기
	    for(int num : tmpList)
	    {
	        if( num >= maxNum)
		    {
		        maxNum = num;
		    }
	    }
		
		
	}
}
