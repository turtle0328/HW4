package test_p4;

public class test_p4 {
	public static void main(String[] args)
	{
		RacingCar rccar1;
		rccar1 = new RacingCar();
		
		rccar1.setCar(1234,20.5);
		rccar1.setCourse(5);
	}

}

class RacingCar
{
	int num,course;
	double gas;
	
	void setCar(int n,double g)
	{
		System.out.println("�Ͳ��F���l");
		System.out.println("�Ͳ��F�ɨ�");
		num=n;
		gas=g;
		System.out.println("�N�����]�w��"+num+"�A�T�o�q�]��"+gas);
	}
	void setCourse(int c)
	{
		course=c;
		System.out.println("�N�ɨ��s���]��5");
	}
	
}