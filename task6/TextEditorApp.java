public class TextEditorApp {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        // Insert characters into the editor
        editor.insertCharacter('H', "Arial", 12, 0, 0);
        editor.insertCharacter('e', "Arial", 12, 10, 0);
        editor.insertCharacter('l', "Arial", 12, 20, 0);
        editor.insertCharacter('l', "Arial", 12, 30, 0);
        editor.insertCharacter('o', "Arial", 12, 40, 0);
        editor.insertCharacter('W', "Arial", 12, 0, 20);
        editor.insertCharacter('o', "Arial", 12, 10, 20);
        editor.insertCharacter('r', "Arial", 12, 20, 20);
        editor.insertCharacter('l', "Arial", 12, 30, 20);
        editor.insertCharacter('d', "Arial", 12, 40, 20);

        // Render the document
        editor.renderDocument();
    }
}
