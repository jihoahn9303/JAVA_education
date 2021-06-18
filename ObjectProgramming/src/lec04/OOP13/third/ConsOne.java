package lec04.OOP13.third;

public class ConsOne {

	public String cpuName;
	public String gpuName;
	
	ConsOne() {
		this("amd", "redeon");
	}
	
	ConsOne(ConsOne consOne) {
		this.cpuName = consOne.cpuName;
		this.gpuName = consOne.gpuName;
	}
	
	ConsOne(String cpuName) {
//		cpuName = "intel"
		this(cpuName, "nvd");
//		ConsOne(cpuName, "nvd");
	}
	
	ConsOne(String cpuName, String gpuName) {
		this.cpuName = cpuName;
		this.gpuName = gpuName;
	}
}
