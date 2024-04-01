public class const_4 {
}

class Emp{
    private int sal;
    private String name;
    private static String dept = "IT";

    private Emp(){
        //singleton pattern
    }
    public void m(){
        System.out.println("m");
    }

    public static void main(String[] args) {
    Emp e = new Emp();
    e.m();
    }
}

class ObjectCounter{
    private static int count = 0;
    //instance intializer block
    {
        count++;
    }
    public ObjectCounter(){
        this(10);
            //count++; static method increment
        System.out.println("no argument constructor");
        System.out.println("calling another constructor from a constructor");
    }//you can call constructor from another construtor 'this(arg)

    public ObjectCounter(int i){
        this((float)i);
        System.out.println("Inside arg constructor with int value" + i);
    }

    public ObjectCounter(float f){
        System.out.println("inside argument constructor with float value" + f);
    }

    public static int getCount(){
        return count; //no of objects created
    }
    public static void main(String[] args) {
        ObjectCounter oc = new ObjectCounter();
        ObjectCounter oc1 = new ObjectCounter(10f);
        ObjectCounter oc2 = new ObjectCounter(10);

        System.out.println(getCount());
    }
}

class Employee{
    static void method(Integer i) {
        System.out.println("integer");
    }

    static void method(Float i){
        System.out.println("float");
    }
    static void method(Number i){
        System.out.println("number");
    }
    static void method(Object o){
        System.out.println("object");
    }

    public static void main(String[] args) {
method((short)5); //primitive data type trigger number method. implicit type casting
        //Integer a =(short)5 //this is invalid
        Short a =(short)5;
    }
}

class Animal{
    private String breed;
    private int size;
    Animal(){
     super();
    }

    static class Horse extends Animal{
        private String name;
        private int size;
        public Horse(){
            this("Chetak");
        }
        public Horse(String name){
            super(); //called implicitly if no other constructor is explicitly called
        }

        public static void main(String ...a) {
            Horse h = new Horse();
            System.out.println("Horse");
        }
    }
}

