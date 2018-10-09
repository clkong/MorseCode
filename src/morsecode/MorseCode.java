/*
 *Sean Luo 03/10/2018
 *MorseCode.java
 *This is progrem calculates the MorseCode.
 */

package morsecode;

import javax.swing.JOptionPane;

/**
 *
 * @author clkon
 */
public class MorseCode {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String message, morseCode = "";
        String letter;
        message = JOptionPane.showInputDialog("Enter your message to be translated into morse code.");
        for (int i = 0; i < message.length(); i++) {
            letter = Character.toString(message.charAt(i));
            if (letter.equalsIgnoreCase("a")) {
                morseCode += ".-";
            } 
            else if (letter.equalsIgnoreCase("b")) {
                morseCode += "-…";
            } 
            else if (letter.equalsIgnoreCase("c")) {
                morseCode += "-.-.";
            } 
            else if (letter.equalsIgnoreCase("d")) {
                morseCode += "-..";
            } 
            else if (letter.equalsIgnoreCase("e")) {
                morseCode += ".";
            } 
            else if (letter.equalsIgnoreCase("f")) {
                morseCode += "..-.";
            } 
            else if (letter.equalsIgnoreCase("g")) {
                morseCode += "--.";
            } 
            else if (letter.equalsIgnoreCase("h")) {
                morseCode +="....";
            } 
            else if (letter.equalsIgnoreCase("i")) {
                morseCode += "..";
            } 
            else if (letter.equalsIgnoreCase("j")) {
                morseCode += ".---";
            } 
            else if (letter.equalsIgnoreCase("k")) {
                morseCode += "-.-";
            } 
            else if (letter.equalsIgnoreCase("l")) {
                morseCode += ".-..";
            } 
            else if (letter.equalsIgnoreCase("m")) {
                morseCode += "--";
            } 
            else if (letter.equalsIgnoreCase("n")) {
                morseCode += "-.";
            } 
            else if (letter.equalsIgnoreCase("o")) {
                morseCode += "---";
            } 
            else if (letter.equalsIgnoreCase("p")) {
                morseCode += ".--.";
            } 
            else if (letter.equalsIgnoreCase("q")) {
                morseCode += "--.-";
            } 
            else if (letter.equalsIgnoreCase("r")) {
                morseCode += ".-.";
            } 
            else if (letter.equalsIgnoreCase("s")) {
                morseCode += "...";
            } 
            else if (letter.equalsIgnoreCase("t")) {
                morseCode += "-";
            } 
            else if (letter.equalsIgnoreCase("u")) {
                morseCode += "..-";
            } 
            else if (letter.equalsIgnoreCase("v")) {
                morseCode += "...-";
            } 
            else if (letter.equalsIgnoreCase("w")) {
                morseCode += ".--";
            } 
            else if (letter.equalsIgnoreCase("x")) {
                morseCode += "-..-";
            } 
            else if (letter.equalsIgnoreCase("y")) {
                morseCode += "-.--";
            } 
            else if (letter.equalsIgnoreCase("z")) {
                morseCode += "--..";
            } 
            else if (letter.equals("1")) {
                morseCode += ".----";
            } 
            else if (letter.equals("2")) {
                morseCode += "..---";
            } 
            else if (letter.equals("3")) {
                morseCode += "...--";
            } 
            else if (letter.equals("4")) {
                morseCode += "....-";
            } 
            else if (letter.equals("5")) {
                morseCode += ".....";
            } 
            else if (letter.equals("6")) {
                morseCode += "-....";
            } 
            else if (letter.equals("7")) {
             
                morseCode += "--...";
            } 
            else if (letter.equals("8")) {
                morseCode += "---..";
            } 
            else if (letter.equals("9")) {
                morseCode += "----.";
            }
            else if (letter.equals("0")) {
                morseCode += "----- ";
        }
        System.out.println(morseCode);
        morseCode = morseCode.replace(morseCode,"");
    }
    
}
}