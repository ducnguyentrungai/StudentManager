package login;

public class Vigenere {

    public String encryptVigenere(String plaintext, String key) {
        String encode = "";
        int textLength = plaintext.length();    
        int keyLength = key.length();          
        int count = 0;
        for (int i = 0; i < textLength; i++) {
            char textChar = plaintext.charAt(i);
            char keyChar = key.charAt(count);
            if (textChar > 96 && textChar < 123) {
                char c = (char) (((textChar - 97 + keyChar - 97) % 26) + 97);
                encode += c;
            }
            if (textChar > 64 && textChar < 91) {
                char c = (char) (((textChar - 65 + keyChar - 65) % 26) + 65);
                encode += c;
            }
            count++;
            if (count == keyLength) {
                count = 0;
            }
        }
        return encode;
    }

    public String decryptVigenere(String plaintext, String key) {
        String decode = "";
        int textLength = plaintext.length();    
        int keyLength = key.length();           
        int count = 0;
        for (int i = 0; i < textLength; i++) {
            char textChar = plaintext.charAt(i);
            char keyChar = key.charAt(count);
            if (textChar > 96 && textChar < 123) {
                char c = (char) ((((textChar - 97) - (keyChar - 97) + 26) % 26) + 97);
                decode += c;
            }
            if (textChar > 64 && textChar < 91) {
                char c = (char) ((((textChar - 65) - (keyChar - 65) + 26) % 26) + 65);
                decode += c;
            }
            count++;
            if (count == keyLength) {
                count = 0;
            }
        }
        return decode;
    }

}
