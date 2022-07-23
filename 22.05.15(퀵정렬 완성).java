import java.util.Scanner;

// 퀵 정렬 알고리즘 완성용 연습 ver.
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