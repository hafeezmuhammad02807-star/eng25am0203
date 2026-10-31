class person {
    void displayname() {
        System.out.println("Name: Jane Smith");
    }
}

class employee extends person {
    void displayEmployee() {
        System.out.println("Salary: 50000");
    }
}

class manager extends employee {
    void displayManager() {
        System.out.println("Department: Sales");
    }
}

class learn28 {
    public static void main(String[] args) {
        manager m1 = new manager();
        m1.displayname();
        m1.displayEmployee();
        m1.displayManager();
    }
}
