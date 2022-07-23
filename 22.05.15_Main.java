import java.util.Scanner;

public class Main
{
	public static void main(String[] args) 
	{
	    // 10���� ������ ���� �迭 ����
	    double[] arr = new double[10];
	    
	    // ��ĳ�� ��ü ����
	    Scanner sc = new Scanner(System.in);
	    
	    // �Է�ī��Ʈ ���� ����
	    int count=0;
	    
	    // ����� �Է� ���� ����
	    double n;
	    
	    // ����ڿ��� �ȳ� �޼��� ���� �� �Է°� �ޱ�
	    System.out.print("���� 10���� �Է����ּ��� : ");
	    
	    
	    while(true)
	    {
	        if(count>=10)
	        {
	            break;
	        }
	     
	        n = sc.nextInt();
	        
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
        double m=0;
        
        double[] temp = new double[10];
        
        // ��տ��� arr[i] �� ���� temp �迭�� �����ϱ�
        for(int i=0; i<arr.length; i++)
        {
            /* �� ���
            m = avg-arr[i];
            
            //System.out.println("m : " + m);
            
            temp[i] = m;
            
            for(double num : temp)
            { 
                System.out.println("num : " + num);
            }
            
            // �� ���
            temp[i] = avg-arr[i];
            
            System.out.println("temp[i] : " + num);
            */
            
            temp[i] = avg-arr[i];
            
        }
        
       
        // temp �迭 ��� �׽�Ʈ
        for(int i=0; i<temp.length; i++) 
        {
            System.out.println("temp["+i+"]="+temp[i]);
        }
       
       double min = Double.MAX_VALUE;
    
       double absNumber=0;
       
       double baseNum=0;

	   for(int i=0; i<temp.length; i++)
		{
			absNumber = Math.abs(temp[i]);
            
            if(absNumber < min)
            {
                baseNum = arr[i];
                min = absNumber;
            }
		}
		
		System.out.println("baseNum : " + baseNum);
		
		double[] result = new double[10];
		
		int idx=0;
		
		for(int i=0; i<result.length; i++)
		{
		    if(arr[i] < baseNum)
		    {
		        result[idx] = arr[i];
		        idx++;
		    }
		}
		
	    result[idx] = baseNum;
	    
	    int baseIdx = idx;
	    
	    for(int i=0; i<result.length; i++)
	    {
	        if(arr[i] > baseNum)
	        {
	            result[idx+1] = arr[i];
	            idx++;
	        }
	    }
	
		for(double num : result)
		{
		    System.out.println("result : " + num);
		}
		
		double swap = 0;
		
		
		for(int i=0; i<baseIdx; i++)
		{
		    for(int j=1; j<baseIdx-i; j++)
		    {
		        if(result[j-1] > result[j])
		        {
    		       swap = result[j-1];
    		       result[j-1] = result[j];
    		       result[j] = swap;
		        }
		    }
		}
		
		for(int i=baseIdx+1; i<result.length; i++)
		{
		   
		    for(int j=baseIdx+2; j<(result.length-i)+(baseIdx+1); j++)
		    {
		       if(result[j-1] > result[j])
		        {
    		       swap = result[j-1];
    		       result[j-1] = result[j];
    		       result[j] = swap;
		        }
		    }
		}
		
	    for(int i=0; i<result.length; i++)
		{
		    System.out.println("result[" + i + "] : " + result[i]);
		}
	}
}