package org;

import java.util.*;

class Checker implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        System.out.println("Comparing " + o1 + " and " + o2);
        return Integer.compare(o1, o2);
    }
}

public class App
{

    static class Student{
        String firstName;
        String lastName;

        public Student() {
        }

        public Student(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;
            Student student = (Student) o;
            return Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName);
        }

        @Override
        public int hashCode() {
            return Objects.hash(firstName, lastName);
        }

        @Override
        public String toString() {
            return "Student{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    '}';
        }
    }

    public static void main(String []args){
//        List<String> stringList = Arrays.asList("prashant", "dhanu","rani","gangadhar");
//        Collections.sort(stringList, String::compareTo);
//        System.out.println(stringList);
//        canDistributeChocolates(3,2);
        Student s1 = new Student("Prashant", "Kumar");
        //Shallow copy
//        Student s2 = s1;

        //Deep copy
        Student s2 = new Student();
        s2.firstName=s1.firstName;
        s2.lastName=s1.lastName;

        System.out.println(s1);
        System.out.println(s2);

        s1.firstName="Dhanu";

        System.out.println(s1);
        System.out.println(s2);
    }

    private static void canDistributeChocolates(int chocolates, int children) {
        if (chocolates <= 2 || children == 1) {
            System.out.println("No");
        }
        else if (chocolates / children > 2 && chocolates % children == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static void printArray(int[] arr, String message){
        System.out.println(message);
        for (int num: arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
