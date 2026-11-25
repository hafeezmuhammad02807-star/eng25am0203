class person {
    void display() {
        System.out.println("Ram");
    }
}

class student extends person {
    void displayMarks() {
        System.out.println("Math:90, Physics:80");
    }
}

public class learn49 {
    public static void main(String[] args) {
        student s = new student();
        s.display();
        s.displayMarks();
    }
}
