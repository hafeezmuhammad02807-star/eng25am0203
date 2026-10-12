class Bill{
    public void amount(int Quatity,int price){
        System.out.println("Total amount is: "+(Quatity*price));
    }
    public void amount(double Quatity,double price){
        System.out.println("Total amount is: "+(Quatity*price));
    }
}
class learn13{
    public static void main(String args[]){
        Bill b = new Bill();
        b.amount (3,1000);
        b.amount(2.5,150.5);
    }
}