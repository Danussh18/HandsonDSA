package LambdaTesting;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class consumerTest2 {
    public static StudentDataBase studentDataBase = new StudentDataBase();
    public static List<Student> studentList = studentDataBase.getAllStudents();
    public static void main(String[] args) {

        printStudents();
        printNameAndActivities();
        printNameAndActivitiesUsingAndThen();
        printNameAndActivitiesUsingCondition();
    }

    public static void printStudents(){
        System.out.println("Students Details..............");
        Consumer<Student> studentConsumer = (student -> System.out.println(student));
        studentList.forEach(studentConsumer);
        System.out.println("------------------------------------------------------------------");
    }

    public static void printNameAndActivities(){
        System.out.println("Names with Activities are.......");
        Consumer<Student> studentConsumer = (student -> System.out.println("Name is: "+student.getName()
                +", Activities are: "+student.getActivities()));
        studentList.forEach(studentConsumer);
        System.out.println("------------------------------------------------------------------");
    }

    public static void printNameAndActivitiesUsingAndThen(){
        System.out.println("Names with Activities are (Using and then).......");
        Consumer<Student> studentConsumer1 = (student -> System.out.print("Name: "+student.getName()));
        Consumer<Student> studentConsumer2 = (student -> System.out.println(", Activities: "+student.getActivities()));
        studentList.forEach(studentConsumer1.andThen(studentConsumer2));
        System.out.println("------------------------------------------------------------------");
    }

    public static void printNameAndActivitiesUsingCondition(){
        System.out.println("Names with Activities are (Using and then) with Condition.......");
        Consumer<Student> studentConsumer3 = student ->{
            if (student.getGradeLevel()>3)
                System.out.println("Name: "+student+", Grade: "+student.getGradeLevel());
        };
        studentList.forEach(studentConsumer3);
        System.out.println("------------------------------------------------------------------");
    }
}
