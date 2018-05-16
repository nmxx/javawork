package javawork;

public class CoustomerTest {
	public static void main(String[] args) {
		Coustomer coustomer=new Coustomer();
		coustomer.setName("张三");
		coustomer.service();
		
		CoustomerVip coustomerVip=new CoustomerVip("张三");
		coustomerVip.touSu(3);
		
	
    }
}