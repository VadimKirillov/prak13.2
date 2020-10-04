package sample;

public class SortingStudentsByGPA implements Comparator {
    public void sort(Student[] students) {
        int min = 0;
        int max = students.length - 1;

        qSort(students, min, max); // сортировка

        //вывод массива студентов
        for(Student student : students){
            System.out.println(student.toString());
        }
    }

    //сортировка
    public void qSort(Student[] array, int min, int max) {
        if (array.length == 0  || min >= max)
            return;


        int middle = min + (max- min) / 2;//серединка

        Student opora = array[middle];
        int i = min, j = max;
        while (i <= j) {
            while (array[i].getGpa() > opora.getGpa()) {
                i++;
            }

            while (array[j].getGpa() < opora.getGpa()) {
                j--;
            }

            if (i <= j) {  //замена
                Student temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        //добавление рекурсии
        if (min < j)
            qSort(array, min, j);

        if (max > i)
            qSort(array, i, max);
    }

}