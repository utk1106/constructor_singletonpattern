public class New {
}


class Employee1{
    {
        System.out.println("Instance block");
    }

    static {
        System.out.println("First");
    }//static always execute first, this will print first
    {
        System.out.println("Instance block2");
    }

    public Employee1(){
        System.out.println("Default constructor");
    }
    public static void main(String[] args) {
        System.out.println("Hello"); //then main method will print
        new Employee1(); //the moment object is created compiler will execute instance block
        // and then Default constuctor
    }
}

//my ans: First, Hello, Default Constructor, Instance block
//instance block or init block always execute from top to bottom


class Init {
    Init(int x) {
        System.out.println("1-arg const");
    }
    Init() {
        System.out.println("no-arg const");
    }
    static {
        System.out.println("1st static init");
    }
    {
        System.out.println("1st instance init");
    }
    {
        System.out.println("2nd instance init");
    }
    static {
        System.out.println("2nd static init");
    }
    public static void main(String [] args) {
        new Init();
        new Init(7);
    }
}

// my ans - first static blocks will execute then init blocks will execute then init block k objects will
//execute then again init block will execute and at last object will execute.