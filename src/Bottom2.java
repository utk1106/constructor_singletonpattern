
class Top {
    public Top() {
        System.out.print("B");
    }
}

public class Bottom2 extends Top {
    public Bottom2(String s) {
        super(); //super with no arguement constructor calls no arguement constructor of the parent class
        System.out.print("D");
    }

    public static void main(String[] args) {
        new Bottom2("C");
        System.out.println(" ");
    }
}


