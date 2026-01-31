package Practice.Creational.ProtoType;

import java.util.HashMap;

public class WelcomeEmail implements EmailTemplate{
    private String content;
    @Override
    public void setContent(String msg) {
        this.content = msg;
    }

    @Override
    public void send() {
        System.out.println("Sending email");
    }

    @Override
    public EmailTemplate clone() {

        try{
            return (WelcomeEmail)super.clone();
        }catch (CloneNotSupportedException e){
            throw new RuntimeException("Clone is not supported");
        }
    }

    @Override
    public String getContent() {
        return content;
    }

    class EmailRegistry{
        public static HashMap<String,EmailTemplate> template = new HashMap<>();

        static {
            template.put("welcome",new WelcomeEmail());
        }

        public static EmailTemplate getTemplate(String content){
            return template.get(content).clone();
        }
    }

    public static void main(String[] args) {
//        EmailTemplate email = new WelcomeEmail();
//        EmailTemplate obj2 = email.clone();

        EmailTemplate email = EmailRegistry.getTemplate("welcome");
        EmailTemplate email2 = EmailRegistry.getTemplate("welcome");
    }
}
