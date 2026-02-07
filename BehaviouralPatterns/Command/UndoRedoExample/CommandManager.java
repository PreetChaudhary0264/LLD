package BehaviouralPatterns.Command.UndoRedoExample;

import java.util.Stack;

public class CommandManager {
    Stack<Command> undoStack = new Stack<>();
    Stack<Command> redoStack = new Stack<>();

    public void execute(Command cmd){
        cmd.execute();
        undoStack.push(cmd);
        redoStack.clear();
    }
    void undo() {
        if (!undoStack.isEmpty()) {
            Command cmd = undoStack.pop();
            cmd.delete();
            redoStack.push(cmd);
        }
    }

    void redo() {
        if (!redoStack.isEmpty()) {
            Command cmd = redoStack.pop();
            cmd.execute();
            undoStack.push(cmd);
        }
    }
}
