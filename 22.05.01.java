import java.util.Scanner;

// �������� ����

public class Main
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
	   
	  int temp = 0; 
	   
	  for(int i=0; i<arr.length; i++)  //-- Ƚ��
	  {
	      for(int j=1; j<arr.length-i; j++) //-- �� swap
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