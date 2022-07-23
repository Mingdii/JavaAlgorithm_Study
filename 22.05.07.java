import java.util.Scanner;

// 배운거 응용해서 버블 정렬 프로그램 짜보기

public class Main
{
	public static void main(String[] args) 
	{
	    // 10개의 정수를 담을 배열 선언
	    int[] arr = new int[10];
	    
	    // 스캐너 객체 생성
	    Scanner sc = new Scanner(System.in);
	    
	    // 입력카운트 변수 선언
	    int count=0;
	    
	    // 사용자 입력 변수 선언
	    int n;
	    
	    // 사용자에게 안내 메세지 전달 및 입력값 받기
	    System.out.print("정수 10개를 입력해주세요 : ");
	    
	    
	    while(true)
	    {
	        n = sc.nextInt();
	        
	        if(count>=10)
	        {
	            break;
	        }
	        
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
        int a=0;
        
        int[] temp = new int[10];
        
   
        
        // 절대값비교를 통해 변수 a 에 기준값 넣기
        for(int i=0; i<arr.length; i++)
        {
            temp[i] = Math.abs(avg-arr[i]);
            
            if(temp[i] < temp[i+1])  
            {
                a = temp[i];
            }
        }
        
        
        // 결과 담을 배열 선언
        int[] result = new int[10];
        
        // 기준값 a와 비교해서 순서대로 sortedArr 에 담아내기
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