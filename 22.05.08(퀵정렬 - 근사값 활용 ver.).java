import java.util.Scanner;

// �� ���� - �ٻ簪�� �����ؼ� Ǯ��� �� �� ����غ��� �� ��������

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
        
         double swap = 0;
       
 
        
        // temp �迭 ��� �׽�Ʈ
        for(int i=0; i<temp.length; i++) 
        {
            System.out.println("temp["+i+"]="+temp[i]);
        }
       
       
	   /*
	   ���� 10���� �Է����ּ��� : 12 32 26 54 45 78 89 98 70 29
        ���� 10���� ������ : 533
        ���� 10���� ����� : 53.3 
        -44.7 �� temp[0] �� 98�� ����...
        -35.7
        -24.700000000000003
        -16.700000000000003
        -0.7000000000000028  �� 54�� ��� �ٻ簪. ���̽��ʽ����̸� temp[0] �ƴ�.
        8.299999999999997
        21.299999999999997
        24.299999999999997
        27.299999999999997
        41.3
        
        ���� 10���� �Է����ּ��� : 1 2 3 4 5 6 70 80 90 100
        ���� 10���� ������ : 361
        ���� 10���� ����� : 36.1
        temp[0]=-63.9
        temp[1]=-53.9
        temp[2]=-43.9
        temp[3]=-33.9
        temp[4]=30 �� 6�� ����� �ٻ簪.1 . �÷������̸� ���������� temp[0] �� �ƴ�.
        temp[5]=31.1
        temp[6]=32.1
        temp[7]=33.1
        temp[8]=34.1
        temp[9]=35.1
	   */
	   
	   double[] newArr = new double[10];
	   
	   for(int i=0; i<newArr.length; i++)
	   {
	       newArr[i] = Math.abs(temp[i]);
	   }
	   
	    // newArr �迭 ���������ϱ�
       for(int i=0; i<newArr.length; i++)
       {
           for(int j=1; j<newArr.length-i; j++)
           {
               if(newArr[j-1] > newArr[j])
               {
                   swap = newArr[j-1];
                   newArr[j-1] = newArr[j];
                   newArr[j] = swap;
               }
           }
       }

	   	// newArr �׽�Ʈ���
	    for(int i=0; i<newArr.length; i++) 
        {
            System.out.println("newArr["+i+"]="+newArr[i]);
        }
       
       // new[0] �� ���밪 ���� ��� �ٻ簪. �׷��� ����� + �ؾ�����, - �ؾ����� ��
       
	   
       int idx = 0;
       
       double near = 0;
       
      for(int i=0; i<arr.length; i++)
	  {
           if(avg-arr[i] < 0)
           {
              if((newArr[0] + (avg-arr[i])) == arr[i])
              {
                idx = i;
                near = arr[i];
              }
			  else
			   {
				 System.out.println("ù ��° if���� ������ �߻���");
			   }
           }
           else if(avg-arr[i] > 0)
           {
              if((newArr[0] + (avg-arr[i])) == arr[i])
              {
                idx = i;
                near = arr[i];
              }
			  else
			  {
				System.out.println("�� ��° if���� ������ �߻���");
				
				System.out.println("(newArr[0] + (avg-arr[i]) : " + (newArr[0] + (avg-arr[i])));
				System.out.println("arr[i] : " + arr[i]);
			  }
           }
		   else
		  {
			System.out.println("idx ���� near �� ã�� �������� ������ �߻���");
		  }
	  }
	  
	  System.out.println("idx : " + idx);
	  System.out.println("near : " + near);
	  
	  
	}
}