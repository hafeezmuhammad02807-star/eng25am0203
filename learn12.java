class average{
    public void avg(int sub1,int sub2){
        int average = (sub1+sub2)/2;
        System.out.println("Average of two subjects is: " + average);
    }
}
class learn12{
    public static void main(String args[]){
        average a = new average();
        a.avg(80,90);
    }
}