public class Code extends Task {
    String textCode;

    public Code(String textCode) {
        this.textCode = textCode;
    }

    public Code(int numberTask, String condition) {
        super(numberTask, condition);
        this.textCode = "textCode";
    }
}
