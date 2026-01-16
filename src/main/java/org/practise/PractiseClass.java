package org.practise;

public class PractiseClass {

    static class A {

        public A(){
            System.out.println("Default Constructor A");
        }

        public A(int num){
            System.out.println("Constructor A with num "+num);
        }
    }

    static class B extends A {
        public B(){
            super();
            System.out.println("Constructor B");
        }
    }

    public static void main(String[] args) {
        B b = new B();
        UserRecord record = new UserRecord("1","123","1234");
        UserRecord defaultRecord = new UserRecord();
    }

}
