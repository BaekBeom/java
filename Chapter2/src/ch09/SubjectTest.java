package ch09;

public class SubjectTest {

	public static void main(String[] args) {

		Student studentLee = new Student(100, "Lee");
		studentLee.setKoreaSubject("국어", 100);
		studentLee.setmathSubject("수학", 99);
		
		Student studentKim = new Student(200, "Kim");
		studentKim.setKoreaSubject("국어", 10);
		studentKim.setmathSubject("수학", 9);
		
		studentLee.showScoreInfo();
		studentKim.showScoreInfo();
	}

}
