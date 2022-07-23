

// Strategy pattern 공부!! → 사용자의 코드 보호하기를 위함.


// 버스를 타고 가는 알고리즘을 내가 직접 구현하지 않고
// 밖에 구현한 것을 가져옴
// 운송수단 클래스들에게 위임한다.
// 추상화 인터페이스를 만들고 운송수단 클래스들이 implements

import java.util.Scanner;

interface Movable
{
    void move();   
}

class Bus implements Movable
{
    @Override
    public void move()
    {
        System.out.println("버스를 타고 가요~");
    }

    
}

class Train implements Movable
{
    @Override
    public void move()
    {
        System.out.println("기차를 타고 가요~");
    }
}

class Client
{
    public void move()
    {
        // movable 인터페이스의 move() 함수 호출.
        // 인터페이스의 하위의 클래스 메소드들을 인터페이스를 통해 호출할 수 있도록
        myTransport.move();
    }
    
    public void setTransport(Movable m)
    {
        this.myTransport = m;
    }
    
    private Movable myTransport;
}

class TransportFactory
{
    public Movable getTransport(int answer)
    {
        Movable m = null;
        
        if(answer == 1)
        {
            m = new Bus();
        }
        else if(answer ==2)
        {
            m = new Train();
        }
        else
        {
            System.out.println("운송수단 입력을 다시하세요.");    
        }
        
        return m;
    }
}

/*
public class Main
{
	public static void main(String[] args) 
	{
		Movable move1 = new Bus();
		Movable move2 = new Train();
		
		Client c = new Client();
		
		c.setTransport(move2);
		
		Movable myMovable = new Bus();
		c.setTransport(myMovable);
		
		c.move();
		
	}
}
*/

public class Main
{
	public static void main(String[] args) 
	{
		System.out.println("운송 수단을 입력하세요(1. 버스, 2. 기차) : ");
		Scanner sc = new Scanner(System.in);
		int answer = sc.nextInt();
	
		TransportFactory tf = new TransportFactory();	
		Movable myMovable = tf.getTransport(answer);
		
		Client c = new Client();
		c.setTransport(myMovable);
		c.move();
	}
}