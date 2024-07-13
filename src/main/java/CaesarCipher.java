public class CaesarCipher extends Encryption{

    String alphabet;
    int key;
    public CaesarCipher(String data , int key) {
        super(data);
        this.key = key;
    }
}
