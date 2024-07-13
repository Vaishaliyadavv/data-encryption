public class CaesarCipher extends Encryption{
    String data;
    String alphabet;
    int key;
    public CaesarCipher(String data , int key) {
        this.data = data;
        this.key = key;
        alphabet = "abcdefghijklmnopqrstuvwxyz";
    }

    @Override
    public String encrypt() {
        return "Caesar Cipher encrypted data: " + this.data;
    }

    @Override
    public String decrypt() {
        return "Caesar Cipher decrypted data: " + this.data;
    }
}
