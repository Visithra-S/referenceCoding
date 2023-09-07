package Interface;

import StudentData.StudentsData;

public class ServiceImpl implements Service {
	
	static int subMark = 100;
	static int subTotal = 500;
	static int percentage;
	private static int StuTotalMark;

	@Override
	public StudentsData[] methodReturningArray() {

		int rollNo=200;

		StudentsData stu[ ]= new StudentsData[10];

		stu[0] = new StudentsData(rollNo++,"Visithra",98,99,100,96,97);
		stu[1] = new StudentsData(rollNo++,"Manimaran",89,98,78,87,89);
		stu[2] = new StudentsData(rollNo++,"Sumithra",78,89,67,56,91);
		stu[3] = new StudentsData(rollNo++,"Pavithra",89,94,63,96,69);
		stu[4] = new StudentsData(rollNo++,"Senthamarai",85,98,85,93,91);
		stu[5] = new StudentsData(rollNo++,"John",99,98,97,96,95);
		stu[6] = new StudentsData(rollNo++,"Prem",94,93,92,91,90);
		stu[7] = new StudentsData(rollNo++,"Abi",89,88,87,86,85);
		stu[8] = new StudentsData(rollNo++,"Suganthi",84,83,82,81,80);
		stu[9] = new StudentsData(rollNo++,"Yoga",79,78,77,76,75);
		
		System.out.println("toString 1 : "+stu.toString());
		System.out.println("stu : "+stu);
		
		StudentsData stu1[ ]= new StudentsData[10];

		stu1[0] = new StudentsData(rollNo++,"Visithra",98,99,100,96,97);
		stu1[1] = new StudentsData(rollNo++,"Manimaran",89,98,78,87,89);
		stu1[2] = new StudentsData(rollNo++,"Sumithra",78,89,67,56,91);
		stu1[3] = new StudentsData(rollNo++,"Pavithra",89,94,63,96,69);
		stu1[4] = new StudentsData(rollNo++,"Senthamarai",85,98,85,93,91);
		stu1[5] = new StudentsData(rollNo++,"John",99,98,97,96,95);
		stu1[6] = new StudentsData(rollNo++,"Prem",94,93,92,91,90);
		stu1[7] = new StudentsData(rollNo++,"Abi",89,88,87,86,85);
		stu1[8] = new StudentsData(rollNo++,"Suganthi",84,83,82,81,80);
		stu1[9] = new StudentsData(rollNo++,"Yoga",79,78,77,76,75);
		
		System.out.println("toString 1 : "+stu.toString());
		System.out.println("stu1 : "+stu1);

		return stu;
	}

	@Override
	public void printStudentDetails() {
		
		for(StudentsData stu : methodReturningArray()) {
			StuTotalMark = stu.getTamil() + stu.getEnglish() + stu.getMaths() + stu.getScience() + stu.getSocialScience();
			//5 subject marks* each subject mark /overall total
			percentage = (StuTotalMark * subMark/subTotal);
			System.out.println("StudentTotalMark: " + stu.getName() + ": " + percentage);		
		}
		
	}
}
