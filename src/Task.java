abstract class Task {
    int numberTask;
    String condition;

    public Task() {
        this.numberTask = 0;
        this.condition = "condition";
    }

    public Task(int numberTask, String condition) {
        this.numberTask = numberTask;
        this.condition = condition;
    }
}
