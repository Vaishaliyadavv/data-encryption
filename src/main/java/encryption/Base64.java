package encryption;

public class Base64 extends Encryption {
    @Override
    public String encrypt(String input) {
        return "Base64 encrypted data: " + input;
    }

    @Override
    public String decrypt(String input) {
        return "Base64 decrypted data: " + input;
    }
}
