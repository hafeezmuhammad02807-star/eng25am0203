//inheritance
class person {
    void displayname() {
        System.out.println("Name: John Doe");
    }
}

class student extends person {
    void displayMarks() {
        System.out.println("Marks: 85");
    }
}

class learn27 {
    public static void main(String[] args) {
        student s1 = new student();
        s1.displayname();
        s1.displayMarks();
    }
}