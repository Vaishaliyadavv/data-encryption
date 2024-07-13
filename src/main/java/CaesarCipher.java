public class CaesarCipher extends Encryption{
    String alphabet;
    int key;
    public CaesarCipher(int key) {
        this.key = key;
        alphabet = "abcdefghijklmnopqrstuvwxyz";
    }
    @Override
    public String encrypt(String input) {
        return "Caesar Cipher encrypted data: " + input + "\nkey: " + key;
    }

    @Override
    public String decrypt(String input) {
        return "Caesar Cipher decrypted data: " + input + "\nkey: " + key;
    }
}
