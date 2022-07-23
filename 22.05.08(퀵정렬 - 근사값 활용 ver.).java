import java.util.Scanner;

// 퀵 정렬 - 근사값을 적용해서 풀어보기 → 더 고민해보는 게 좋을듯함

public class Main
{
	public static void main(String[] args) 
	{
	    // 10개의 정수를 담을 배열 선언
	    double[] arr = new double[10];
	    
	    // 스캐너 객체 생성
	    Scanner sc = new Scanner(System.in);
	    
	    // 입력카운트 변수 선언
	    int count=0;
	    
	    // 사용자 입력 변수 선언
	    double n;
	    
	    // 사용자에게 안내 메세지 전달 및 입력값 받기
	    System.out.print("정수 10개를 입력해주세요 : ");
	    
	    
	    while(true)
	    {
	        if(count>=10)
	        {
	            break;
	        }
	     
	        n = sc.nextInt();
	        
	        if(n<1)
	        {
	            System.out.println("1 이상의 정수를 입력해주세요.");
	            break;
	        }
	        
	        arr[count] = n;
	        count++;
	    }
	    

	    // 총합, 평균 변수 선언
	    int sum=0;
	    double avg=0;
	    
	    // 평균을 구하기 위해 반복문 사용
	    for (int i=0; i<arr.length; i++)
	    {
	       sum += arr[i];
	    }
	    
	    avg = sum / (double)arr.length;
	    
	    System.out.println("정수 10개의 총합은 : " + sum);
	    System.out.println("정수 10개의 평균은 : " + avg);

        // 기준값 변수 선언
        double m=0;
        
        double[] temp = new double[10];
        
        // 평균에서 arr[i] 뺀 값을 temp 배열에 저장하기
        for(int i=0; i<arr.length; i++)
        {
            /* ① 방법
            m = avg-arr[i];
            
            //System.out.println("m : " + m);
            
            temp[i] = m;
            
            for(double num : temp)
            { 
                System.out.println("num : " + num);
            }
            
            // ② 방법
            temp[i] = avg-arr[i];
            
            System.out.println("temp[i] : " + num);
            */
            
            temp[i] = avg-arr[i];
            
        }
        
         double swap = 0;
       
 
        
        // temp 배열 출력 테스트
        for(int i=0; i<temp.length; i++) 
        {
            System.out.println("temp["+i+"]="+temp[i]);
        }
       
       
	   /*
	   정수 10개를 입력해주세요 : 12 32 26 54 45 78 89 98 70 29
        정수 10개의 총합은 : 533
        정수 10개의 평균은 : 53.3 
        -44.7 → temp[0] 이 98이 왔음...
        -35.7
        -24.700000000000003
        -16.700000000000003
        -0.7000000000000028  → 54가 평균 근사값. 마이스너스값이며 temp[0] 아님.
        8.299999999999997
        21.299999999999997
        24.299999999999997
        27.299999999999997
        41.3
        
        정수 10개를 입력해주세요 : 1 2 3 4 5 6 70 80 90 100
        정수 10개의 총합은 : 361
        정수 10개의 평균은 : 36.1
        temp[0]=-63.9
        temp[1]=-53.9
        temp[2]=-43.9
        temp[3]=-33.9
        temp[4]=30 → 6이 평균의 근사값.1 . 플러스값이며 마찬가지로 temp[0] 이 아님.
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
	   
	    // newArr 배열 버블정렬하기
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

	   	// newArr 테스트출력
	    for(int i=0; i<newArr.length; i++) 
        {
            System.out.println("newArr["+i+"]="+newArr[i]);
        }
       
       // new[0] 은 절대값 씌운 평균 근사값. 그러나 평균을 + 해야할지, - 해야할지 모름
       
	   
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
				 System.out.println("첫 번째 if에서 오류가 발생함");
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
				System.out.println("두 번째 if에서 오류가 발생함");
				
				System.out.println("(newArr[0] + (avg-arr[i]) : " + (newArr[0] + (avg-arr[i])));
				System.out.println("arr[i] : " + arr[i]);
			  }
           }
		   else
		  {
			System.out.println("idx 값과 near 값 찾는 과정에서 오류가 발생함");
		  }
	  }
	  
	  System.out.println("idx : " + idx);
	  System.out.println("near : " + near);
	  
	  
	}
}