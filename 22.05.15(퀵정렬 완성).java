import java.util.Scanner;

// �� ���� �˰��� �ϼ��� ���� ver.
public class Main
{
    public static double[] swap(int j, double result[])
	{
	    double[] swpArr = new double[5];
	    
	    double temp = 0;
		
	    if(result[j-1] > result[j])
		{
    		 temp = result[j-1];
    		 result[j-1] = result[j];
    		  result[j] = temp;
		}
		
		return swpArr;
	}
    
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

      // temp[i]�� arr[i]�� �ε����� �����Ƿ� ���밪 �ּ��� ���� �ش��� ���� arr[�ε���] ���� ���ذ��� �ֱ�
      // �׸��� absNumber < min �� ���� �ּҰ��� �ش��ϴ� absNumber �� min �ּҰ� ������ �־��ְ�
      // ���� absNumber = Math.abs(temp[i]); �������� absNumber ���ιް� ���� absNumber �� min �� ��
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
		        // result[i] = arr[i] �ϴ� ���, ���� if �� �ش����� �ʴ� ��� �پ�ѱ� ������ result[i] �� ���ʷΰ� �ƴ϶� 
		        // �뼺�뼺 �� �� �ֱ� ������ idx �ε����� ���� �����Ͽ� ���ʷ� �� �� �ֵ��� ��.
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
		
		for(int i=0; i<baseIdx; i++)
		{
		    for(int j=1; j<baseIdx-i; j++)
		    {
		        swap(j, result);
		    }
		}
		
		
		for(int i=baseIdx+1; i<result.length; i++)
		{
		    for(int j=baseIdx+2; j<(result.length-i)+(baseIdx+1); j++)
		    {
		        swap(j, result);
		    }
		}
		
	    for(int i=0; i<result.length; i++)
		{
		    System.out.println("result[" + i + "] : " + result[i]);
		}
	}
	
	
}