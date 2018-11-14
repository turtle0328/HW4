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
		System.out.println("生產了車子");
		System.out.println("生產了賽車");
		num=n;
		gas=g;
		System.out.println("將車號設定為"+num+"，汽油量設為"+gas);
	}
	void setCourse(int c)
	{
		course=c;
		System.out.println("將賽車編號設為5");
	}
	
}