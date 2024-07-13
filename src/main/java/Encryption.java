public abstract class Encryption {
    String data;
    public Encryption(String data) {
        this.data = data;
    }

    public abstract String encrypt();
    public abstract String decrypt();

}
