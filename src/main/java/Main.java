import encryption.Base64;
import encryption.CaesarCipher;
import encryption.Encryption;

public class Main {
    public static void main(String[] args) {
        Encryption caesar = new CaesarCipher(7);
        Encryption base64 = new Base64();

        System.out.println(caesar.encrypt("encrypt-with-caesar"));
        System.out.println(caesar.decrypt("decrypt-with-caesar"));
        System.out.println(base64.encrypt("encrypt-with-base64"));
        System.out.println(base64.decrypt("decrypt-with-base64"));
    }
}
