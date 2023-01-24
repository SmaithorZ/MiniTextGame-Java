import java.util.Random;
import java.util.Scanner;

public class Main {

	
	public static void main(String[]args) {
		
		
		Scanner in = new Scanner(System.in);
		String name;
		
		
		Random rand = new Random();
		rand.nextInt();
		
		System.out.println("Welcome to the game, please insert your name: ");
		name = in.nextLine();
		System.out.println("Welcome "+name);
		System.out.println("Wanna play? Press (W)");
		
		String command = in.nextLine();
		if(command.equals("W")) {
			System.out.println("You are going forward...Oh no,"
					+ " there's an enemy! What do you wanna do? F = FIGHT R = RUN");
			command = in.nextLine();
			if(command.equals("F")) {
				if(rand.nextInt(100) < 75) {
					System.out.println("You've won!");
				}else {
					System.out.println("You've lost!");
				}
			}else {
				System.out.println("You've escaped, the game has ended!");
			}
		}
		
		
		
		
		
		
		
	
	
	

}
}	