public interface Staff {
    void helpStudent(Student student);

    default void getAddStuff(){
        System.out.println("Ссылка на Habr");
    };

}

