package BehaviouralPatterns.Memento;

public class Main {
    public static void main(String[] args) {
       Originator editor = new Originator();
       Caretaker history = new Caretaker();

       editor.write("Hello");
       history.save(editor.save());

       editor.write("World");
//       history.save(editor.save());

        System.out.println(editor.getText());

        editor.restore(history.undo());
        System.out.println(editor.getText());
    }
}
