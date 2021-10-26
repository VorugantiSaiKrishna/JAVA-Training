package Association2;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Honda hm=new Honda();
            hm.setColor("Black");
            hm.setSpeed(160);
            System.out.println(hm.getColor());
            System.out.println(hm.getSpeed());
            hm.HondaStartEngine();
            hm.HondaMusicPlayer();
	}

}