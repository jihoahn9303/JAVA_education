package lec04.OOP13.third;

public class ConsOneMain {

	public static void main(String[] args) {

		ConsOne sample = new ConsOne();
		sample.cpuName = "amd";
		sample.gpuName = "radeon";
		System.out.println(sample.cpuName);
		System.out.println(sample.gpuName);
		System.out.println("===================");
		
		// ���� �Ʒ� �ڵ�� ������ ����� �����Ѵ�.
		ConsOne consOne = new ConsOne("intel", "nvd");
		System.out.println(consOne.cpuName);
		System.out.println(consOne.gpuName);
		System.out.println("===================");
		
		// ������ ����
		// ������ ���� ��ÿ��� ���� ���� ��������,
		// �ᱹ new �����ڸ� ���� ���� �ٸ� �޸� ������ �Ҵ�Ǿ��� ������,
		// ���� ���Ŀ���, ���������� �۵��ϰ� �ȴ�.
		ConsOne consTwo = new ConsOne(consOne);
		System.out.println(consTwo.cpuName);
		System.out.println(consTwo.gpuName);
		
		consTwo.cpuName = "amd";
		consTwo.gpuName = "radeon";
		System.out.println(consTwo.cpuName);
		System.out.println(consTwo.gpuName);
	}

}
