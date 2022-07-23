import java.util.Scanner;

// 알고리즘으로 퀵 정렬 풀어보기 (sort() 메소드 사용 x)

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
        
       
        // temp 배열 출력 테스트
        for(int i=0; i<temp.length; i++) 
        {
            System.out.println("temp["+i+"]="+temp[i]);
        }
       
       double min = Double.MAX_VALUE;
    
       double absNumber=0;
       
       double baseNum=0;

      // temp[i]가 arr[i]와 인덱스가 같으므로 절대값 최소인 값에 해당할 때의 arr[인덱스] 값을 기준값에 넣기
      // 그리고 absNumber < min 일 때의 최소값에 해당하는 absNumber 를 min 최소값 변수에 넣어주고
      // 위의 absNumber = Math.abs(temp[i]); 구문으로 absNumber 새로받고 이전 absNumber 인 min 과 비교
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
		        // result[i] = arr[i] 하는 경우, 위의 if 에 해당하지 않는 경우 뛰어넘기 때문에 result[i] 는 차례로가 아니라 
		        // 듬성듬성 들어갈 수 있기 때문에 idx 인덱스를 따로 선언하여 차례로 들어갈 수 있도록 함.
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
		
		// 테스트 출력해보기
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
		    
		    // 시작점이 baseIdx+1 변경되었으니 기존처럼 result.length-i 를 하면 범위가 처음부터 어긋남
		    // 따라서 기존처럼 result.length-i 에 시작점을 함께 더해주어야 result.length 만큼 비교범위가 돌아감
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
정수 10개를 입력해주세요 : 100 3 2 1 4 80 5 6 70 90
정수 10개의 총합은 : 361
정수 10개의 평균은 : 36.1
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