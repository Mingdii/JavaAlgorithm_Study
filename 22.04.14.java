import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

// ������ 2���� ������� Ǯ��� 
// ( �����ߴ� test ver. 4���� ����� ������ ������ ��� 2���� ��� ����)

/*
public class Main
{
	public static void main(String[] args) 
	{
		// �� ��° ���
		
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
    		System.out.print("��� ���ϴ� ���� �Է����ּ��� : ");
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
    		        // if (2�� ��� -> �ڵ� ����Ʈ)
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

// �� ��° ���


public class Main
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		
		int[][] gugudan = new int[8][9];
		
		// 2�� ~ 9��
		for (int i=2; i<10; i++)
		{   
		    // 1 ~ 9���� ��
			for(int j=1; j<10; j++)
			{   
			    // 2�� ~ 9���� [0][0]�� �ڸ����� i*j�� ���� �ֱ�
				gugudan[i-2][j-1] = i * j;
			
			//	System.out.print(gugudan[i-2][j-1]);
            //    System.out.print(" ");
			}
	        
	        // �� �ܸ��� �����ϱ� ����
	        System.out.println();
	}
		
		
		List<Integer> primeList = new ArrayList<Integer>();
		Map<Integer, Integer> primeMap = new HashMap<>();
		
		for(;;)
		{
    		System.out.print("��� ���ϴ� ���� �Է����ּ��� : ");
    		int num = sc.nextInt();
    		
    		if (num == 0) 
		        break;
    		
    	//	System.out.println("=======["+ num +"]=======");
    		
    		for(int i=0; i<=8; i++)
    		{
    		    
    		    //System.out.println(num + "*" + (i+1) + "=" + gugudan[num-2][i]);
    		
    		    // �켱, �������� ��� ������ value �� 1�� �ֱ�
    		    primeMap.put(gugudan[num-2][i], 1);
    		    
    		    // 2���� n-1���� �Ҽ��� �Ǻ��ϱ� �� num �� ����� �Է��� "��"�ε� �� num�ΰ�? �� *1 �� �ƴ� *2~*9���� �ϰ� �Ǹ� ���� �� �־� �Ҽ�x
    		    for(int j=2; j<num; j++)
    		    {
    		        // if (2�� ��� -> �ڵ� ����Ʈ)
    		       //else if(num%j==0)
    		       if(num%j==0)     //-- num �� j�� ���������� �������� �Ҽ� x �� value 0���� ������
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

// �� ��° ���

public class Main
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int[][] gugudan = new int[8][9];
		int num;
		
		do
		{
		    System.out.print("��� ���ϴ� ���� �Է����ּ��� : ");
    		num = sc.nextInt();
    		
    		if (num == 0) 
		        break;
		}
		while(num<2 || num>9);
		
		
		// 2�� ~ 9��
		for (int i=2; i<num; i++)
		{   
		    // 1 ~ 9���� ��
			for(int j=1; j<10; j++)
			{   
			    // 2�� ~ 9���� [0][0]�� �ڸ����� i*j�� ���� �ֱ�
				gugudan[i-2][j-1] = i * j;
			
				System.out.print(gugudan[i-2][j-1]);
                System.out.print(" ");
			}
	        
	        // �� �ܸ��� �����ϱ� ����
	        System.out.println();
		}
		
		/*
		List<Integer> primeList = new ArrayList<Integer>();
		Map<Integer, Integer> primeMap = new HashMap<>();


    		for(int i=0; i<=8; i++)
    		{
    		    
    		    //System.out.println(num + "*" + (i+1) + "=" + gugudan[num-2][i]);
    		
    		    // �켱, �������� ��� ������ value �� 1�� �ֱ�
    		    primeMap.put(gugudan[num-2][i], 1);
    		    
    		    // 2���� n-1���� �Ҽ��� �Ǻ��ϱ� �� num �� ����� �Է��� "��"�ε� �� num�ΰ�? �� *1 �� �ƴ� *2~*9���� �ϰ� �Ǹ� ���� �� �־� �Ҽ�x
    		    for(int j=2; j<num; j++)
    		    {
    		        // if (2�� ��� -> �ڵ� ����Ʈ)
    		       //else if(num%j==0)
    		       if(num%j==0)     //-- num �� j�� ���������� �������� �Ҽ� x �� value 0���� ������
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

// �� ��° ���

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
		    System.out.print("��� ���ϴ� ���� �Է����ּ��� : ");
    		num = sc.nextInt();
    		
    		if (num == 0) 
		        break;
		}
		while(num<2 || num>9);
		
		
		// 2�� ~ 9��
		for (int i=2; i<=num; i++)
		{   
		    // 1 ~ 9���� ��
			for(int j=1; j<10; j++)
			{   
			    // 2�� ~ 9���� [0][0]�� �ڸ����� i*j�� ���� �ֱ�
				gugudan[i-2][j-1] = i * j;
			
				System.out.print(gugudan[i-2][j-1]);
                System.out.print(" ");
			}
	        
	        // �� �ܸ��� �����ϱ� ����
	        System.out.println();
		}
		System.out.println();
		
		List<Integer> primeList = new ArrayList<Integer>();
		Map<Integer, Integer> primeMap = new HashMap<>();


    	for(int i=0; i<=8; i++)
    	{
    		//System.out.println(num + "*" + (i+1) + "=" + gugudan[num-2][i]);
    		
    		// �켱, �������� ��� ������ value �� 1�� �ֱ�
    		primeMap.put(gugudan[num-2][i], 1);
    		    
    		// 2���� n-1���� �Ҽ��� �Ǻ��ϱ� �� num �� ����� �Է��� "��"�ε� �� num�ΰ�? �� *1 �� �ƴ� *2~*9���� �ϰ� �Ǹ� ���� �� �־� �Ҽ�x
    		for(int j=2; j<num; j++)
    		{
    		    if (j==2)
    		      primeMap.put(gugudan[num-2][i], 1);
    		    else if(num%j==0)     //-- num �� j�� ���������� �������� �Ҽ� x �� value 0���� ������
    		      primeMap.put(gugudan[num-2][i], 0);
    		}
    	}
    	
    	// keySet() �޼���� key�� ���� ���	    
    	for( Integer key : primeMap.keySet())
    	{
    	    Integer value = primeMap.get(key);
    		
    		// �Ҽ����        
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

//** ���� ***

// ������ 2���� ������� Ǯ��� �ڡ�

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
		    System.out.print("��� ���ϴ� ���� �Է����ּ��� : ");
    		num = sc.nextInt();
    		
    		if (num == 0) 
		        break;
		}
		while(num<2 || num>9);
		
		// 1��
		
		/*
		// 2�� ~ 9��
		for (int i=2; i<=num; i++)
		{   
		    // 1 ~ 9���� ��
			for(int j=1; j<10; j++)
			{   
			    // 2�� ~ 9���� [0][0]�� �ڸ����� i*j�� ���� �ֱ�
				gugudan[i-2][j-1] = i * j;
			
				System.out.print(gugudan[i-2][j-1]);
                System.out.print(" ");
			}
	        
	        // �� �ܸ��� �����ϱ� ����
	        System.out.println();
		}
		System.out.println();
        
        */
     
        
        // 2��
        //==> num ���� �Ҽ����� ��µ��� �ʰ�, , num���� ���� ������ ������ ��� ��µ�.
		List<Integer> primeList = new ArrayList<Integer>();
		Map<Integer, Integer> primeMap = new HashMap<>();

    	for(int i=0; i<=8; i++)
    	{
    		//System.out.println(num + "*" + (i+1) + "=" + gugudan[num-2][i]);
    		
    		// �켱, �������� ��� ������ value �� 1�� �ֱ�
    		primeMap.put(gugudan[num-2][i], 1);
    		    
    		// 2���� n-1���� �Ҽ��� �Ǻ��ϱ� �� num �� ����� �Է��� "��"�ε� �� num�ΰ�? �� *1 �� �ƴ� *2~*9���� �ϰ� �Ǹ� ���� �� �־� �Ҽ�x
    		for(int j=2; j<gugudan[num-2][i]; j++)
    		{
    		    if (gugudan[num-2][i]==2)              // if (2�� ���) �� �ڵ����� �Ҽ��� map �ֱ�
    		      primeMap.put(gugudan[num-2][i], 1);
    		    else if(gugudan[num-2][i]%j==0)     //-- num �� j�� ���������� �������� �Ҽ� x �� value 0���� ������
    		      primeMap.put(gugudan[num-2][i], 0);
    		}
    	}
    	
    	// keySet() �޼���� key�� ���� ���	    
    	for( Integer key : primeMap.keySet())
    	{
    	    Integer value = primeMap.get(key);
    		
    		// �Ҽ����        
    		if(value==1)
    		{
    		   primeList.add(key);
    		   System.out.println(key);
    		}
        }
   
	}  // main method 		    
} // main class
