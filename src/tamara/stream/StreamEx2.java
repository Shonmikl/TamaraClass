package tamara.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx2 {
    public static void main(String[] args) {
        Student s1 = new Student("Ivan", 'm', 22, 2, 8.9);
        Student s2 = new Student("Petr", 'm', 32, 4, 7.9);
        Student s3 = new Student("Maria", 'f', 31, 3, 6);
        Student s4 = new Student("Tamara", 'f', 19, 4, 9.9);
        String s5 = null;

        List<Student> studentsList = new ArrayList<>();
        studentsList.add(s1);
        studentsList.add(s2);
        studentsList.add(s3);
        studentsList.add(s4);

//        System.out.println(studentsList.stream().skip(4).findFirst().orElse(null));
//        ArrayList<Student> s =
//                (ArrayList<Student>) studentsList.stream()
//                        .filter(el -> el.getAvgGrade() > 7).toList();

//        Student s = studentsList.stream()
//                .map(el -> {
//                    el.setName(el.getName().toUpperCase());
//                    return el;})
//                .filter(el -> el.getSex() == 'm')
//                .sorted((st1, st2) -> st1.getAge() - st2.getAge())
//                .findFirst().get();
//        System.out.println(s);

//        Student min = studentsList.stream()
//                .min(Comparator.comparingInt(Student::getSex)).get();
//        System.out.println(min);
//
//        Student max = studentsList.stream()
//                .max(Comparator.comparingInt(Student::getSex)).get();
//        System.out.println(max);

//        studentsList.stream()
//                .filter(el -> el.getAge() > 19)
//                .limit(2)
//                .forEach(System.out::println);

        List<Double> avgGrades =
                studentsList.stream()
                        .mapToDouble(Student::getAvgGrade) //IntStream -> Stream<Integer>
                        .boxed()
                        .collect(Collectors.toList());
        System.out.println(avgGrades);
    }
}








