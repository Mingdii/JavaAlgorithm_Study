import java.util.Scanner;

// �˰������� �� ���� Ǯ��� (sort() �޼ҵ� ��� x)

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
		
		double swap = 0;
		
		/*
		for(int i=0; i<result.length; i++)
		{
		    for(int j=0; j<baseIdx; j++)
		    {
		        for(int k=1; k<baseIdx-j; k++)
		        {
		            swap = result[j];
		            result[j] = result[k];
		            result[k] = swap;
		        }
		    }
		}
		*/
		
		// �׽�Ʈ ����غ���
		/*for(int i=0; i<baseIdx; i++)
		{
		    System.out.println("result[" + i + "] : " + result[i]);
		}
		*/
		
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
		   // System.out.println("i : "  + i);
		    
		    // �������� baseIdx+1 ����Ǿ����� ����ó�� result.length-i �� �ϸ� ������ ó������ ��߳�
		    // ���� ����ó�� result.length-i �� �������� �Բ� �����־�� result.length ��ŭ �񱳹����� ���ư�
		    for(int j=baseIdx+2; j<(result.length-i)+(baseIdx+1); j++)
		    {
		         //System.out.println("j : "  + j);
		        
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

//===>
/*
���� 10���� �Է����ּ��� : 100 3 2 1 4 80 5 6 70 90
���� 10���� ������ : 361
���� 10���� ����� : 36.1
temp[0]=-63.9
temp[1]=33.1
temp[2]=34.1
temp[3]=35.1
temp[4]=32.1
temp[5]=-43.9
temp[6]=31.1
temp[7]=30.1
temp[8]=-33.9
temp[9]=-53.9
baseNum : 6.0
result : 3.0
result : 2.0
result : 1.0
result : 4.0
result : 5.0
result : 6.0
result : 100.0
result : 80.0
result : 70.0
result : 90.0
result[0] : 1.0
result[1] : 2.0
result[2] : 3.0
result[3] : 4.0
result[4] : 5.0
result[5] : 6.0
result[6] : 70.0
result[7] : 80.0
result[8] : 90.0
result[9] : 100.0
*/