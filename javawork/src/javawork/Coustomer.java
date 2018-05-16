package javawork;

public class Coustomer {
	private String name;
	
	public void service() {
		System.out.println(name+"女士/先生正在服务中");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
    
}
