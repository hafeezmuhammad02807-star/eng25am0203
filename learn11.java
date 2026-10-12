class circle{
    double radius;
    circle(double radius){
        this.radius = radius;
    }
    void area(){
        System.out.println("area of circle is: "+(3.14*radius*radius));
    }
    void circumference(){
        System.out.println("circumference of circle is: "+(2*3.14*radius));
    }
    void display(){
        System.out.println("radius of circle is: "+radius);
        area();
        circumference();
    }
}
class learn11{
    public static void main(String[]args){
        circle c1 = new circle(5.0);
        circle c2 = new circle(3.0);
        circle c3 = new circle(4.0);
        c1.display();
        c2.display();
        c3.display();
    }
}