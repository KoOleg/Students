import java.util.Random;

public class Mentor extends Person implements Staff {
    boolean mood;
    Random random = new Random();

    public Mentor(String nameSurname, int age) {
        super(nameSurname, age);
        this.mood = true;
    }

    @Override
    public void helpStudent(Student student) {
        System.out.println("Продолжай в том же духе, " + student.getNameSurname());
    }

    @Override
    public void getAddStuff() {

    }

    public boolean checkCode(Task task) {
        if (random.nextInt(2000) > 1000) {
            //System.out.println("Задача " + task.numberTask + " принята");
            return true;
        }
        //System.out.println("Задача " + task.numberTask + "не принята");
        return false;
    }
}
