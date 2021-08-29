package singleton;

public class CarFactory {
	// 싱글톤 패턴
	private static CarFactory instance;
	
	private CarFactory() {}
	
	public static CarFactory getInstance()
	{
		if(instance == null)	// instance가 비어있을 때
			instance = new CarFactory();
		return instance;
	}
	
	// 자동차 생성 매서드
	public Car createCar()
	{
		Car car = new Car();
		return car;
	}
}
