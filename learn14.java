class Area{
    public void square(int length){
        System.out.println("Area of square is: " + (length * length));
    }
    public void rectangle(int length,int breadth){
        System.out.println("Area of rectangle is: " + (length * breadth));
    }
    public void circle(double radius){
        System.out.println("Area of circle is: " + (3.14 * radius * radius));
    }
}
class learn14{
    public static void main(String[]args){
        Area a = new Area();
        a.square(5);
        a.rectangle(5,10);
        a.circle(5);
    }
}