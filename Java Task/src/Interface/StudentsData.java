package Interface;

public class StudentsData {
	
	public StudentsData(int rollNo, String name, int tamil, int english, int maths, int science, int socialScience) {
		super();
		this.RollNo = rollNo;
		this.Name = name;
		this.Tamil = tamil;
		this.English = english;
		this.Maths = maths;
		this.Science = science;
		this.SocialScience = socialScience;
	}
	
	@Override
	public String toString() {
		/*return "StudentsData: RollNo=" + RollNo + ", Name=" + Name + ", Tamil=" + Tamil + ", English=" + English
				+ ", Maths=" + Maths + ", Science=" + Science + ", SocialScience=" + SocialScience ;*/
		return getClass().getName()+"@"+hashCode();
	}
	
	private int RollNo;
	private String Name;
	private int Tamil;
	private int English;
	private int Maths;
	private int Science;
	private int SocialScience;
	
	public int getRollNo() {
		return RollNo;
	}
	public void setRollNo(int rollNo) {
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
}
