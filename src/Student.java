public class Student extends Person {
    private int countCompTask;
    private static int countCompTaskAllS;
    private Mentor mentor;
    private boolean comletedAllTask;

    public Student(String nameSurname, int age, Mentor mentor) { //, boolean comletedAllTask
        super(nameSurname, age);
        this.countCompTask = 0;
        this.mentor = mentor;
        this.comletedAllTask = false;
    }

    public void solveTasks(int countTask, Task[] tasks) {
        for (int i = getCountCompTask(); i < getCountCompTask()+countTask; i++) {
            solveTask(tasks[i]);
            if (i == tasks.length - 1) {
                comletedAllTask = true;
                System.out.println(getNameSurname() + " решил все задачи");
                break;
            }
        }
    }

    private void solveTask(Task task) {
        if (task instanceof Autochecked) ((Autochecked) task).runTask();
        else while (!mentor.checkCode(task));

        setCountCompTask(getCountCompTask() + 1);
        setCountCompTaskAllS(getCountCompTaskAllS() + 1);
    }


    public int getCountCompTask() {
        return countCompTask;
    }

    public void setCountCompTask(int countCompTask) {
        this.countCompTask = countCompTask;
    }

    public static int getCountCompTaskAllS() {
        return countCompTaskAllS;
    }

    public static void setCountCompTaskAllS(int countCompTaskAllS) {
        Student.countCompTaskAllS = countCompTaskAllS;
    }

    public Mentor getMentor() {
        return mentor;
    }

    public void setMentor(Mentor mentor) {
        this.mentor = mentor;
    }

    public boolean isComletedAllTask() {
        return comletedAllTask;
    }

    public void setComletedAllTask(boolean comletedAllTask) {
        this.comletedAllTask = comletedAllTask;
    }
}
