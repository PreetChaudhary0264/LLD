package Practice.Creational.ProtoType;

public interface EmailTemplate {
    void setContent(String content);
    void send();
    EmailTemplate clone();
    String getContent();
}
