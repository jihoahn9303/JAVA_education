package lec04.OOP13.third;

public class ConsOneMain {

	public static void main(String[] args) {

		ConsOne sample = new ConsOne();
		sample.cpuName = "amd";
		sample.gpuName = "radeon";
		System.out.println(sample.cpuName);
		System.out.println(sample.gpuName);
		System.out.println("===================");
		
		// 위와 아래 코드는 동일한 기능을 수행한다.
		ConsOne consOne = new ConsOne("intel", "nvd");
		System.out.println(consOne.cpuName);
		System.out.println(consOne.gpuName);
		System.out.println("===================");
		
		// 생성자 복사
		// 생성자 복사 당시에만 같은 값을 가지지만,
		// 결국 new 연산자를 통해 서로 다른 메모리 공간에 할당되었기 때문에,
		// 생성 이후에는, 독립적으로 작동하게 된다.
		ConsOne consTwo = new ConsOne(consOne);
		System.out.println(consTwo.cpuName);
		System.out.println(consTwo.gpuName);
		
		consTwo.cpuName = "amd";
		consTwo.gpuName = "radeon";
		System.out.println(consTwo.cpuName);
		System.out.println(consTwo.gpuName);
	}

}
