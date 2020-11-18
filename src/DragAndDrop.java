public class DragAndDrop extends Task implements Autochecked {
    String[][] variants;

    public DragAndDrop() {
        this.variants = new String[][]{
                {"a", "1"},
                {"b", "2"},
                {"c", "3"}
        };

    }

    public DragAndDrop(int numberTask, String condition) {
        super(numberTask, condition);
        this.variants = new String[][]{
                {"a", "1"},
                {"b", "2"},
                {"c", "3"}
        };
    }
}
