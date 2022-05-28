package _03_char._3_pi_aloud;

import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class PiAloud {
	/***********  SOUND ***************
	 * Some computers are unable to play sounds. 
	 * If you cannot play sound on this computer, set canPlaySounds to false.
	 * If you are not sure, ask your teacher 
	 * *****************/
	boolean canPlaySounds = true;
	
	
	// 1. Make a main method and make sure your program can run
	public static void main(String args[]) {
		double pi = 3.14159265358979323846264338327950288419716939937510582097494459230781640628620899862803482534211706798214808651328230664709384460955058223172535940812848111745028410270193852110555964462294895493038196442881097566593344612847564823378678316527120190914564856692346034861045432664821339360726024914127372458700660631558817488152092096282925409171536436789259036001133053054882046652138414695194151160943305727036575959195309218611738193261179310511854807446237996274956735188575272489122793818301194912983367336244065664308602139494639522473719070217986094370277053921717629317675238467481846766940513200056812714526356082778577134275778960917363717872146844090122495343014654958537105079227968925892354201995611212902196086403441815981362977477130996051870721134999999837297804995105973173281609631859502445945534690830264252230825334468503526193118817101000313783875288658753320838142061717766914730359825349042875546873115956286388235378759375195778185778053217;
		String pie = pi + "";
		JOptionPane.showInputDialog("Hello, this is the game that you can test how many numbers you can recite from pi. Enjoy! :)");
		String answer = JOptionPane.showMessageDialog(null, "Ok, here we go! Enter the first number after 3.__: ");
		int uno = Integer.parseInt(answer);
		while (true){
			if (uno == 1) {
				while (true){
					JOptionPane.showInputDialog("Correct! What is the number that comes after that?: ");
				}
			
				
				
			}else {
				JOptionPane.showInputDialog("That is wrong, how did you get the first one wrong, please try again, or please stop trying at all.");
			}
		} {
			
		}
				
			
	}
	// 2. Make a String variable to hold 20 digits of Pi. You could use http://www.piday.org/million/ to get this.

	// 3. Print out 3 digits of Pi. The first value is "pi.charAt(0)", the second is "pi.charAt(1)"
	// Check the console shows 3.1

	// 4. Print ALL the digits of the Pi String, putting each digit on a new line  (hint: use a loop)

	// 5. Skip this step if your computer cannot play sounds. 
	//		if (canPlaySounds) {
	//				 Use the speak() method to speak each digit of Pi.   
	//		}
	
	
	// [CHALLENGE]
	// *6. Get a character from the user using the getInputFromUser() method
	// *7. Compare the users' char to the next digit of Pi
	// *8. If they are correct, print out "correct". If they are not, print "incorrect" 
	
	
	
	/********************  Use these methods. DON'T CHANGE THE CODE BELOW  ******************/

	static void speak(char characterToSpeak) {
		
		if (System.getProperty("os.name").contains("Windows")) {
			String cmd = "PowerShell -Command \"Add-Type -AssemblyName System.Speech; (New-Object System.Speech.Synthesis.SpeechSynthesizer).Speak('"
					+ characterToSpeak + "');\"";
			try {
				Runtime.getRuntime().exec(cmd).waitFor();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			try {
				Runtime.getRuntime().exec("say " + characterToSpeak).waitFor();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	private static void pause(int seconds) {
		try {
			Thread.sleep(1000 * seconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	static char getInputFromUser() {
		Scanner scanner = new Scanner(System.in);
		return scanner.next().toCharArray()[0];
	}

}


