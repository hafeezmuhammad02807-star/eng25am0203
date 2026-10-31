class employee {
    void displayCompany() {
        System.out.println("Company: ABC Corp");
    }
}

class teacher extends employee {
    void teach() {
        System.out.println("Teaching students");
    }
}

class developer extends employee {
    void writeCode() {
        System.out.println("Writing code");
    }
}

class learn29 {
    public static void main(String[] args) {
        teacher t1 = new teacher();
        t1.displayCompany();
        t1.teach();

        developer d1 = new developer();
        d1.displayCompany();
        d1.writeCode();
    }
}