package sample;

public class Main {
    public static void main(String []args){
        Student [] students = {
                new Student("Иванов",18,241,4.2),
                new Student("Кузнецов",23, 123,4.6),
                new Student("Воробьёв",19,154,3.7),
                new Student("Петров",21,278,5.0)
        };

        SortingStudentsByGPA sort = new SortingStudentsByGPA();
        sort.sort(students);

    }
}
