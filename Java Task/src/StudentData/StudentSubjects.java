package StudentData;

public class StudentSubjects extends StudentDetails {
	int subMark = 100;
	int subTotal = 500;
	int TotalMark;
	double percentage;
	public void studentOne() {
		
		StudentDetails stuOne = new StudentSubjects();
		
		stuOne.setRollNo("01");
		stuOne.setName("Visithra");
		stuOne.setTamil(99);
		stuOne.setEnglish(98);
		stuOne.setMaths(99);
		stuOne.setScience(97);
		stuOne.setSocialScience(99);
		
		System.out.println(stuOne);
		
		TotalMark = stuOne.getTamil() + stuOne.getEnglish() + stuOne.getMaths() + stuOne.getScience()+stuOne.getSocialScience();
		percentage = ((double) (TotalMark * subMark) / (subTotal));
		System.out.println(percentage);
	}
}
