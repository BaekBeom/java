package ch15;

public class IfElseIfTest {

	public static void main(String[] args) {

		int age = 12;
		
		int charge;
		
		if (age <8) {
			charge = 1000;
			System.out.println("미 취학아동입니다.");
		} else if (age <15) {
			charge = 2000;
			System.out.println("중학생 입니다.");
		} else if (age <19) {
			charge = 3000;
			System.out.println("고등학생 입니다.");
		} else if (age <24) {
			charge = 4000;
			System.out.println("대학생 입니다.");
		}
		else {
			charge = 6000;
			System.out.println("일반인 입니다.");
		}
		System.out.println("입장료는" + charge + "입니다.");
	}

}
