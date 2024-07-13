public class Base64 extends Encryption{
    String data;

    public Base64(String data) {
        this.data = data;
    }

    @Override
    public String encrypt() {
        return "Base64 encrypted data: " + this.data;
    }

    @Override
    public String decrypt() {
        return "Base64 decrypted data: " + this.data;
    }
}
