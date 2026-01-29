package creationalPatterns.Prototype;

public interface EmailTemplate extends Cloneable {
    void setContent(String content);
    void send();
    String getContent();
    EmailTemplate clone();
}
