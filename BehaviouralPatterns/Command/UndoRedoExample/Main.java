package BehaviouralPatterns.Command.UndoRedoExample;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        CommandManager cmd = new CommandManager();
        cmd.execute(new InsertTextCommand(editor,"Hello"));
        cmd.execute(new InsertTextCommand(editor,"world"));

        cmd.undo();
        cmd.redo();
    }
}
