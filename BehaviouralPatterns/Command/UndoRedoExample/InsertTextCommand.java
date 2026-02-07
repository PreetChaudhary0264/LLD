package BehaviouralPatterns.Command.UndoRedoExample;

public class InsertTextCommand implements Command{
    private TextEditor editor;
    private String text;

    InsertTextCommand(TextEditor e,String s){
        this.editor = e;
        this.text = s;
    }
    @Override
    public void execute() {
        editor.insert(text);
    }

    @Override
    public void delete() {
        editor.delete(text.length());
    }
}
