package BehaviouralPatterns.Command.UndoRedoExample;

public class TextEditor {
    private String text = "";
    public void insert(String s){
        text += s;
        System.out.println(text);
    }
    public void delete(int len){
        text = text.substring(0,text.length() - len);
        System.out.println(text);
    }
}
