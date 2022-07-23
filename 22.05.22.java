

// Strategy pattern ����!! �� ������� �ڵ� ��ȣ�ϱ⸦ ����.


// ������ Ÿ�� ���� �˰����� ���� ���� �������� �ʰ�
// �ۿ� ������ ���� ������
// ��ۼ��� Ŭ�����鿡�� �����Ѵ�.
// �߻�ȭ �������̽��� ����� ��ۼ��� Ŭ�������� implements

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
        System.out.println("������ Ÿ�� ����~");
    }

    
}

class Train implements Movable
{
    @Override
    public void move()
    {
        System.out.println("������ Ÿ�� ����~");
    }
}

class Client
{
    public void move()
    {
        // movable �������̽��� move() �Լ� ȣ��.
        // �������̽��� ������ Ŭ���� �޼ҵ���� �������̽��� ���� ȣ���� �� �ֵ���
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
            System.out.println("��ۼ��� �Է��� �ٽ��ϼ���.");    
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
		System.out.println("��� ������ �Է��ϼ���(1. ����, 2. ����) : ");
		Scanner sc = new Scanner(System.in);
		int answer = sc.nextInt();
	
		TransportFactory tf = new TransportFactory();	
		Movable myMovable = tf.getTransport(answer);
		
		Client c = new Client();
		c.setTransport(myMovable);
		c.move();
	}
}