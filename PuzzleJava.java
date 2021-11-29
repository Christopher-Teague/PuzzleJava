import java.util.ArrayList;
import java.util.Random;

public class PuzzleJava {

Random randMachine = new Random();

    public ArrayList<Integer> getTenRolls() {
        // randMachine.nextInt(21);
        ArrayList<Integer> tenRandom = new ArrayList<Integer>();
        for (int i = 1; i <= 10 ; i++) {
            tenRandom.add(randMachine.nextInt(20) + 1);
        }
        return tenRandom;
    }

    public Character getOneLetter() {
        char[] letters = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'}; 
        int chooseOne = randMachine.nextInt(26);
        char oneLetter = letters[chooseOne];
        return oneLetter;
    } 

    public String randomPassword() {
        String password = "";
        for (int i = 1; i <= 8; i++) {
            char randomLetter = getOneLetter();
            password += randomLetter;
        }
        return password;
    }


    public ArrayList<String> getNewPasswordSet(int howMany) {
        ArrayList<String> passwordSet = new ArrayList<String>();
        for (int i = 0; i < howMany; i++) {
            passwordSet.add(randomPassword());
        }
        return passwordSet;
    }

}
