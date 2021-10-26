package Association;

public class MainClass {

	public static void main(String[] args) {
		UndergradStudent ug=new UndergradStudent();
		ug.setName("Sai Krishna");
		ug.setRollno(86);
		ug.setCity("Hyderabad");
		ug.setYear(2021);
		System.out.println(ug.getName());
		System.out.println(ug.getRollno());
		System.out.println(ug.getCity());
		System.out.println(ug.getYear());
		ug.studentStudiesBranch();
		ug.studentCollegeSociety();

	}

}
