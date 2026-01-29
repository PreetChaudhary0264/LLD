package creationalPatterns.Prototype;

import java.util.HashMap;
import java.util.Map;

public class WelcomeEmail implements EmailTemplate{
    private String content;
    @Override
    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public void send() {
        System.out.println("Sending mail");
    }

    @Override
    public String getContent() {
        return content;
    }

    @Override
    public EmailTemplate clone() {
        try{
            return (WelcomeEmail)super.clone();
        }catch(CloneNotSupportedException e){
            throw new RuntimeException("Clone is not supproted");
        }
    }

    class EmailRegistry{
        public static Map<String,EmailTemplate> template = new HashMap<>();

        static {
            template.put("welcome",new WelcomeEmail());
            //add more like login , etc
        }

        public static EmailTemplate getTemplate(String content){
            return template.get(content).clone();
        }
    }

    public static void main(String[] args) {
        //Without creating emailRegistry

//        EmailTemplate mail = new WelcomeEmail();
//        mail.setContent("welcome");
//        System.out.println(mail.getContent());
//
//        EmailTemplate mail2 = mail.clone();
//        mail2.setContent("Login");
//        System.out.println(mail.getContent());
//        System.out.println(mail2.getContent());

        EmailTemplate mail = EmailRegistry.getTemplate("welcome");
        mail.setContent("type-1");
        System.out.println(mail.getContent());

        EmailTemplate mail2 = EmailRegistry.getTemplate("welcome");
        mail2.setContent("type-2");
        System.out.println(mail.getContent());
        System.out.println(mail2.getContent());
    }
}
