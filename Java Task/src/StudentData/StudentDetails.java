package StudentData;

public class StudentDetails {
	
	private String RollNo;
	private String Name;
	private int Tamil;
	private int English;
	private int Maths;
	private int Science;
	private int SocialScience;
	
	public String getRollNo() {
		return RollNo;
	}
	public void setRollNo(String rollNo) {
		RollNo = rollNo;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getTamil() {
		return Tamil;
	}
	public void setTamil(int tamil) {
		Tamil = tamil;
	}
	public int getEnglish() {
		return English;
	}
	public void setEnglish(int english) {
		English = english;
	}
	public int getMaths() {
		return Maths;
	}
	public void setMaths(int maths) {
		Maths = maths;
	}
	public int getScience() {
		return Science;
	}
	public void setScience(int science) {
		Science = science;
	}
	public int getSocialScience() {
		return SocialScience;
	}
	public void setSocialScience(int socialScience) {
		SocialScience = socialScience;
	}
	
	@Override
	public String toString() {
		return "StudentDetails: RollNo=" + RollNo + ", Name=" + Name + ", Tamil=" + Tamil + ", English=" + English
				+ ", Maths=" + Maths + ", Science=" + Science + ", SocialScience=" + SocialScience;
	}
	
}
