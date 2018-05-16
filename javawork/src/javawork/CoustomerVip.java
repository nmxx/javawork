package javawork;

public class CoustomerVip extends Coustomer {
	
	private int level;
	private String name;
	
	

	public CoustomerVip(String name) {
		super();
		this.name = name;
	}

	public void touSu(int level) {
		System.out.println("Vip"+level+name+"正在投诉中");
			}

	public int getLevel() {
		return level;
	}


	public void setLevel(int level) {
		this.level = level;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
}
