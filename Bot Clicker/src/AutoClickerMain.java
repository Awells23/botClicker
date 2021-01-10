import java.awt.event.InputEvent;
import java.util.Scanner;

public class AutoClickerMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("--------AutoCLicker-------");
		
		System.out.print("Enter the number of clicks ");
		int clicks = scanner.nextInt(); 
		
		System.out.println("Enter the delay between clicks in milliseconds");
		int delay = scanner.nextInt(); 
		System.out.println(); 
		
		System.out.println("Program will begin in 3 seconds"); 
		
		try {
			Thread.sleep(3000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		AutoClicker clicker = new AutoClicker(); 
		clicker.setDelay(delay);
		
		for (int i = 0; i < clicks; i++) {
			clicker.clickMouse(InputEvent.BUTTON1_DOWN_MASK);
		}
			System.out.println("AutoClicker complete"); 
	}

}
