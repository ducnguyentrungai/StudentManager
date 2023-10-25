package login;

public class Vigenere {

     public String encryptVigenere(String plaintext, String key) {
        String encode = "";
        int textLength = plaintext.length();    // Độ dài của đoạn plaintext
        int keyLength = key.length();           // Độ dài của khóa
        int count = 0;
        for (int i = 0; i < textLength; i++) {
            char textChar = plaintext.charAt(i);
            char keyChar = key.charAt(count);

            char c = (char) (((textChar - 32 + keyChar - 32) % 95) + 32);
            encode += c;

            count++;
            if (count == keyLength) {
                count = 0;
            }
        }
        return encode;
    }

    public String decryptVigenere(String plaintext, String key) {
        String decode = "";
        int textLength = plaintext.length();    // Độ dài của đoạn plaintext
        int keyLength = key.length();           // Độ dài của khóa
        int count = 0;
        for (int i = 0; i < textLength; i++) {
            char textChar = plaintext.charAt(i);
            char keyChar = key.charAt(count);

            char c = (char) ((((textChar - 32) - (keyChar - 32) + 95) % 95) + 32);
            decode += c;

            count++;
            if (count == keyLength) {
                count = 0;
            }
        }
        return decode;
    }

}
