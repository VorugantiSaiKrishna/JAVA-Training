package Association;

public class Student {

	/*qsn4.
Concept of Association : has a relationship

parent class: Student
 -name:String
 +getName():String
 +setName(String name): void
similarly rollno, city

is a relationship with student

class: UndergradStudent
-year:int
 +getYear():int
 +setYear(int id): void


student has a relationship with Branch (aggreagtion relation weak bonding)
class:Branch
+ studiesBranch(): void: any message("studying in CSE")
student has taken admission in __branch(composition strong bonding)
class:Society
+collegeSociety():void: any message("joined drama club")
student has joined ___society in college (aggregation weak bonding)

class: mainClass
invoke the methods of every class
*/
	private String name;
	private int rollno;
	private String city;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
}
