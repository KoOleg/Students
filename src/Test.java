public class Test extends Task implements Autochecked {
     String [] answers;

    public Test() {
        this.answers =  new String[] {"a", "b", "c"};
    }

    public Test(int numberTask, String condition) {
        super(numberTask, condition);
        this.answers =  new String[] {"a", "b", "c"};
    }
}
