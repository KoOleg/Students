import java.util.Random;
public class main {
    public static void main(String[] args) {
        Random random = new Random();
        Mentor[] mentor = new Mentor[2];
        mentor[0] = new Mentor("Александр  Александров", 50);
        mentor[1] = new Mentor("Виталий Круглов", 45);

        Student[] students = new Student[4];
        students[0] = new Student("Иван Иванов", 40, mentor[0]);
        students[1] = new Student("Петр Петров", 28, mentor[1]);
        students[2] = new Student( "Владимир Петров", 20, mentor[1]);
        students[3] = new Student("Иван Долгов", 35, mentor[0]);

        Task[] tasks = createTask(30);

        while (Student.getCountCompTaskAllS() != tasks.length * students.length) {
            for (int i = 0; i < students.length; i++) {
                if (!students[i].isComletedAllTask())
                    students[i].solveTasks(random.nextInt(30), tasks);
            }
        }
    }


    public static Task[] createTask(int numberTasks) {
        Task[] tasks = new Task[numberTasks];
        for (int i = 0; i < tasks.length; i += 3)
            tasks[i] = new DragAndDrop(i + 1, "DragAndDrop");
        for (int i = 1; i < tasks.length; i += 3)
            tasks[i] = new Test(i + 1, "Test");
        for (int i = 2; i < tasks.length; i += 3)
            tasks[i] = new Code(i + 1, "Code");
        return tasks;
    }
}