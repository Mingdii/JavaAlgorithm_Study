import java.util.Scanner;

// ���� �����ؼ� ���� ���� ���α׷� ¥����

public class Main
{
	public static void main(String[] args) 
	{
	    // 10���� ������ ���� �迭 ����
	    int[] arr = new int[10];
	    
	    // ��ĳ�� ��ü ����
	    Scanner sc = new Scanner(System.in);
	    
	    // �Է�ī��Ʈ ���� ����
	    int count=0;
	    
	    // ����� �Է� ���� ����
	    int n;
	    
	    // ����ڿ��� �ȳ� �޼��� ���� �� �Է°� �ޱ�
	    System.out.print("���� 10���� �Է����ּ��� : ");
	    
	    
	    while(true)
	    {
	        n = sc.nextInt();
	        
	        if(count>=10)
	        {
	            break;
	        }
	        
	        if(n<1)
	        {
	            System.out.println("1 �̻��� ������ �Է����ּ���.");
	            break;
	        }
	        
	        arr[count] = n;
	        count++;
	    }
	    

	    // ����, ��� ���� ����
	    int sum=0;
	    double avg=0;
	    
	    // ����� ���ϱ� ���� �ݺ��� ���
	    for (int i=0; i<arr.length; i++)
	    {
	       sum += arr[i];
	    }
	    
	    avg = sum / (double)arr.length;
	    
	    System.out.println("���� 10���� ������ : " + sum);
	    System.out.println("���� 10���� ����� : " + avg);

        // ���ذ� ���� ����
        int a=0;
        
        int[] temp = new int[10];
        
   
        
        // ���밪�񱳸� ���� ���� a �� ���ذ� �ֱ�
        for(int i=0; i<arr.length; i++)
        {
            temp[i] = Math.abs(avg-arr[i]);
            
            if(temp[i] < temp[i+1])  
            {
                a = temp[i];
            }
        }
        
        
        // ��� ���� �迭 ����
        int[] result = new int[10];
        
        // ���ذ� a�� ���ؼ� ������� sortedArr �� ��Ƴ���
        for(int i=0; i<arr.length; i++)
        {
           if(arr[i] < a)
           {
              result[i] = arr[i];
           }
           else if(arr[i] > a)
           {
               result[i] = arr[i];
           }
        }
        
        
	}
}