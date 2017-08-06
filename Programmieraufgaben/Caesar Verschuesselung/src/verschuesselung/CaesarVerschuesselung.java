package verschuesselung;

import java.util.Scanner;

public class CaesarVerschuesselung {
	 public static void main (String[] args) {
		 
	        Scanner scanner = new Scanner (System.in);
	 
	        System.out.println("Zu verschlüsselnden Text eingeben:");
	 
	        String text = scanner.nextLine(); 
	 
	        System.out.println("Um wieviele Stellen soll verschoben werden? (1-127)");
	 
	        int offset = scanner.nextInt(); 
	        // Offset (Verschiebung) wählen
	 
	        if (offset >= 1 && offset <= 127) {
	 
	        char [] meinArray = text.toCharArray();
	        // den Text in ein Char Array laden
	 
	        char [] meinNeuesArray = verschluesseln(offset, meinArray);
	       
	 
	            System.out.println("\nSo sieht der Text verschlüsselt aus:");
	 
	        for (int i = 0; i < meinNeuesArray.length; i++) {
	 
	            System.out.print(meinNeuesArray[i]);
	        }
	            System.out.println("\n");
	 
	        meinNeuesArray = entschluesseln(offset, meinNeuesArray);
	 
	     
	 
	        System.out.println("\nUnd so wieder zurück entschlüsselt:");
	 
	            for (int i = 0; i < meinNeuesArray.length; i++) {
	 
	                System.out.print(meinNeuesArray[i]);
	            }
	                System.out.println("\n");
	 
	        scanner.close();
	    }
	        else System.out.println("Die Verschiebung muss zwischen 1 und 127 liegen!");
	    }
	 
	    // hier die Methode zum verschlüsseln
	 
	    public static char[] verschluesseln(int offset, char[] charArray) {
	 
	        char[] cryptArray = new char[charArray.length];
	        // erstmal ein leeres Char Array erstellen
	 
	        for (int i = 0; i < charArray.length; i++) {
	 
	                    int verschiebung = (charArray[i] + offset)%128;
	                    // ursprüngliches Zeichen plus Offset modulo 128
	 
	                    cryptArray[i] = (char) (verschiebung);
	 
	        }
	        return cryptArray;
	 
	    }
	 
	    // hier die Methode zum entschlüsseln
	 
	    public static char[] entschluesseln(int offset, char[] charArray) {
	 
	        char[] cryptArray = new char[charArray.length];
	        // erstmal ein leeres Char Array erstellen
	 
	        int verschiebung; 
	 
	        for (int i = 0; i < charArray.length; i++) {
	 
	                    if (charArray[i] - offset < 0)  verschiebung = 
	                    charArray[i] - offset + 128;
	 
	                    // nach Verschiebung kleiner 0? Wenn ja, dann
	                    // 128 addieren
	 
	                     else verschiebung = (charArray[i] - offset)%128;
	 
	                     // wenn nein, einfach nur modulo 128
	 
	                     cryptArray[i] = (char) (verschiebung);
	 
	        }
	        return cryptArray;
	 
	    }
	 
	}

