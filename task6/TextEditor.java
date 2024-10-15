import java.util.ArrayList;
import java.util.List;

public class TextEditor {
    private List<TextCharacter> characters = new ArrayList<>();
    private CharacterFactory characterFactory = new CharacterFactory();

    // Represents each character in the document with its position
    private class TextCharacter {
        private Character character; // Flyweight object
        private int x, y; // Extrinsic state: position

        public TextCharacter(Character character, int x, int y) {
            this.character = character;
            this.x = x;
            this.y = y;
        }

        public void render() {
            character.render(x, y);
        }
    }

    public void insertCharacter(char value, String font, int size, int x, int y) {
        Character character = characterFactory.getCharacter(value, font, size);
        characters.add(new TextCharacter(character, x, y));
    }

    public void renderDocument() {
        for (TextCharacter textCharacter : characters) {
            textCharacter.render();
        }
    }
}
