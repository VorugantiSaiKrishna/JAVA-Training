package Association;

public class UndergradStudent extends Student{
    private int year;

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
    public void  studentStudiesBranch()
    {
    	Branch b=new Branch();
    	b.studiesBranch();
    }
    public void studentCollegeSociety()
    {
    	Society s=new Society();
    	s.collegeSociety();
    }
}
