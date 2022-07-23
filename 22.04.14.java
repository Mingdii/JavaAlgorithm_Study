import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

// 구구단 2가지 방법으로 풀어보기 
// ( 실패했던 test ver. 4가지 방법과 성공한 마지막 방법 2가지 모두 포함)

/*
public class Main
{
	public static void main(String[] args) 
	{
		// ① 번째 방법
		
		Scanner sc = new Scanner(System.in);
		
		int[][] gugudan = new int[8][9];
		
		for (int i=2; i<10; i++)
		{
			for(int j=1; j<10; j++)
			{
				gugudan[i-2][j-1] = i * j;
			
			//	System.out.print(gugudan[i-2][j-1]);
            //    System.out.print(" ");
			}
	        
	        System.out.println();
	}
		
		
		List<Integer> primeList = new ArrayList<Integer>();
		Map<Integer, Integer> primeMap = new HashMap<>();
		
		for(;;)
		{
    		System.out.print("출력 원하는 단을 입력해주세요 : ");
    		int num = sc.nextInt();
    		
    		if (num == 0) 
		        break;
    		
    	//	System.out.println("=======["+ num +"]=======");
    		
    		for(int i=0; i<=8; i++)
    		{
    		    
    		    //System.out.println(num + "*" + (i+1) + "=" + gugudan[num-2][i]);
    		
    		    primeMap.put(gugudan[num-2][i], 1);
    		    
    		    for(int j=2; j<num; j++)
    		    {
    		        // if (2인 경우 -> 자동 리스트)
    		       else if(num%j==0)
    		        {
    		             primeMap.put(gugudan[num-2][i], 0);
    		        }
    		    }
    		    
    		    
    		}
    		
    		    for( Integer key : primeMap.keySet())
    		    {
    		        Integer value = primeMap.get(key);
    		        
    		        if(value==1)
    		        {
    		            primeList.add(key);
    		            System.out.println(key);
    		        }
    		    }
		}
		
		
		
		
		
	}
}

//=========================================================================================

// ② 번째 방법


public class Main
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		
		int[][] gugudan = new int[8][9];
		
		// 2단 ~ 9단
		for (int i=2; i<10; i++)
		{   
		    // 1 ~ 9까지 곱
			for(int j=1; j<10; j++)
			{   
			    // 2단 ~ 9단을 [0][0]의 자리부터 i*j의 곱을 넣기
				gugudan[i-2][j-1] = i * j;
			
			//	System.out.print(gugudan[i-2][j-1]);
            //    System.out.print(" ");
			}
	        
	        // 각 단마다 구별하기 위해
	        System.out.println();
	}
		
		
		List<Integer> primeList = new ArrayList<Integer>();
		Map<Integer, Integer> primeMap = new HashMap<>();
		
		for(;;)
		{
    		System.out.print("출력 원하는 단을 입력해주세요 : ");
    		int num = sc.nextInt();
    		
    		if (num == 0) 
		        break;
    		
    	//	System.out.println("=======["+ num +"]=======");
    		
    		for(int i=0; i<=8; i++)
    		{
    		    
    		    //System.out.println(num + "*" + (i+1) + "=" + gugudan[num-2][i]);
    		
    		    // 우선, 구구단의 모든 값들의 value 를 1로 넣기
    		    primeMap.put(gugudan[num-2][i], 1);
    		    
    		    // 2부터 n-1까지 소수를 판별하기 → num 은 사용자 입력한 "단"인데 왜 num인가? → *1 이 아닌 *2~*9까지 하게 되면 나눌 수 있어 소수x
    		    for(int j=2; j<num; j++)
    		    {
    		        // if (2인 경우 -> 자동 리스트)
    		       //else if(num%j==0)
    		       if(num%j==0)     //-- num 을 j로 나누었을때 나눠지면 소수 x → value 0으로 덮어씌우기
    		        {
    		             primeMap.put(gugudan[num-2][i], 0);
    		            
    		        }
    		    }
    		    
    		    
    		}
    		    
    		    for( Integer key : primeMap.keySet())
    		    {
    		        Integer value = primeMap.get(key);
    		        
    		        if(value==1)
    		        {
    		            primeList.add(key);
    		            System.out.println(key);
    		        }
    		    }
		}
		
		
		
		
		
	}
}

//=========================================================================================

// ③ 번째 방법

public class Main
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int[][] gugudan = new int[8][9];
		int num;
		
		do
		{
		    System.out.print("출력 원하는 단을 입력해주세요 : ");
    		num = sc.nextInt();
    		
    		if (num == 0) 
		        break;
		}
		while(num<2 || num>9);
		
		
		// 2단 ~ 9단
		for (int i=2; i<num; i++)
		{   
		    // 1 ~ 9까지 곱
			for(int j=1; j<10; j++)
			{   
			    // 2단 ~ 9단을 [0][0]의 자리부터 i*j의 곱을 넣기
				gugudan[i-2][j-1] = i * j;
			
				System.out.print(gugudan[i-2][j-1]);
                System.out.print(" ");
			}
	        
	        // 각 단마다 구별하기 위해
	        System.out.println();
		}
		
		/*
		List<Integer> primeList = new ArrayList<Integer>();
		Map<Integer, Integer> primeMap = new HashMap<>();


    		for(int i=0; i<=8; i++)
    		{
    		    
    		    //System.out.println(num + "*" + (i+1) + "=" + gugudan[num-2][i]);
    		
    		    // 우선, 구구단의 모든 값들의 value 를 1로 넣기
    		    primeMap.put(gugudan[num-2][i], 1);
    		    
    		    // 2부터 n-1까지 소수를 판별하기 → num 은 사용자 입력한 "단"인데 왜 num인가? → *1 이 아닌 *2~*9까지 하게 되면 나눌 수 있어 소수x
    		    for(int j=2; j<num; j++)
    		    {
    		        // if (2인 경우 -> 자동 리스트)
    		       //else if(num%j==0)
    		       if(num%j==0)     //-- num 을 j로 나누었을때 나눠지면 소수 x → value 0으로 덮어씌우기
    		             primeMap.put(gugudan[num-2][i], 0);

    		    }
    		}
    		    
    		    for( Integer key : primeMap.keySet())
    		    {
    		        Integer value = primeMap.get(key);
    		        
    		        if(value==1)
    		        {
    		            primeList.add(key);
    		            System.out.println(key);
    		        }
    		    }
   
	}   		    
}

//=========================================================================================

// ④ 번째 방법

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Main
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int[][] gugudan = new int[8][9];
		int num;
		
		do
		{
		    System.out.print("출력 원하는 단을 입력해주세요 : ");
    		num = sc.nextInt();
    		
    		if (num == 0) 
		        break;
		}
		while(num<2 || num>9);
		
		
		// 2단 ~ 9단
		for (int i=2; i<=num; i++)
		{   
		    // 1 ~ 9까지 곱
			for(int j=1; j<10; j++)
			{   
			    // 2단 ~ 9단을 [0][0]의 자리부터 i*j의 곱을 넣기
				gugudan[i-2][j-1] = i * j;
			
				System.out.print(gugudan[i-2][j-1]);
                System.out.print(" ");
			}
	        
	        // 각 단마다 구별하기 위해
	        System.out.println();
		}
		System.out.println();
		
		List<Integer> primeList = new ArrayList<Integer>();
		Map<Integer, Integer> primeMap = new HashMap<>();


    	for(int i=0; i<=8; i++)
    	{
    		//System.out.println(num + "*" + (i+1) + "=" + gugudan[num-2][i]);
    		
    		// 우선, 구구단의 모든 값들의 value 를 1로 넣기
    		primeMap.put(gugudan[num-2][i], 1);
    		    
    		// 2부터 n-1까지 소수를 판별하기 → num 은 사용자 입력한 "단"인데 왜 num인가? → *1 이 아닌 *2~*9까지 하게 되면 나눌 수 있어 소수x
    		for(int j=2; j<num; j++)
    		{
    		    if (j==2)
    		      primeMap.put(gugudan[num-2][i], 1);
    		    else if(num%j==0)     //-- num 을 j로 나누었을때 나눠지면 소수 x → value 0으로 덮어씌우기
    		      primeMap.put(gugudan[num-2][i], 0);
    		}
    	}
    	
    	// keySet() 메서드는 key의 값만 출력	    
    	for( Integer key : primeMap.keySet())
    	{
    	    Integer value = primeMap.get(key);
    		
    		// 소수라면        
    		if(value==1)
    		{
    		   primeList.add(key);
    		   System.out.println(key);
    		}
        }
    
	}  // main method 		    
} // main class

*/
//========================================================================================

//** 최종 ***

// 구구단 2가지 방법으로 풀어보기 ★★

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.*;

public class Main
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int[][] gugudan = new int[8][9];
		int num;
		
		do
		{
		    System.out.print("출력 원하는 단을 입력해주세요 : ");
    		num = sc.nextInt();
    		
    		if (num == 0) 
		        break;
		}
		while(num<2 || num>9);
		
		// 1안
		
		/*
		// 2단 ~ 9단
		for (int i=2; i<=num; i++)
		{   
		    // 1 ~ 9까지 곱
			for(int j=1; j<10; j++)
			{   
			    // 2단 ~ 9단을 [0][0]의 자리부터 i*j의 곱을 넣기
				gugudan[i-2][j-1] = i * j;
			
				System.out.print(gugudan[i-2][j-1]);
                System.out.print(" ");
			}
	        
	        // 각 단마다 구별하기 위해
	        System.out.println();
		}
		System.out.println();
        
        */
     
        
        // 2안
        //==> num 단의 소수값만 출력되지 않고, , num단의 값이 임의의 순서로 모두 출력됨.
		List<Integer> primeList = new ArrayList<Integer>();
		Map<Integer, Integer> primeMap = new HashMap<>();

    	for(int i=0; i<=8; i++)
    	{
    		//System.out.println(num + "*" + (i+1) + "=" + gugudan[num-2][i]);
    		
    		// 우선, 구구단의 모든 값들의 value 를 1로 넣기
    		primeMap.put(gugudan[num-2][i], 1);
    		    
    		// 2부터 n-1까지 소수를 판별하기 → num 은 사용자 입력한 "단"인데 왜 num인가? → *1 이 아닌 *2~*9까지 하게 되면 나눌 수 있어 소수x
    		for(int j=2; j<gugudan[num-2][i]; j++)
    		{
    		    if (gugudan[num-2][i]==2)              // if (2인 경우) → 자동으로 소수로 map 넣기
    		      primeMap.put(gugudan[num-2][i], 1);
    		    else if(gugudan[num-2][i]%j==0)     //-- num 을 j로 나누었을때 나눠지면 소수 x → value 0으로 덮어씌우기
    		      primeMap.put(gugudan[num-2][i], 0);
    		}
    	}
    	
    	// keySet() 메서드는 key의 값만 출력	    
    	for( Integer key : primeMap.keySet())
    	{
    	    Integer value = primeMap.get(key);
    		
    		// 소수라면        
    		if(value==1)
    		{
    		   primeList.add(key);
    		   System.out.println(key);
    		}
        }
   
	}  // main method 		    
} // main class
