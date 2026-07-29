class Main{
 public static void main(String[] args) {
    Mobile m1 = new Mobile(
    "Samsung",
    "S24",
    8,
    256,
    5000,
    74999,
    10
);
m1.MobileInfo();
Mobile m2=new Mobile("Apple","SE",6,112,4200,45000,20);
 m2.MobileInfo();
 Mobile m3=new Mobile("vivo","v20",6,112,5000,15000,25);
 m3.MobileInfo();
 m1.checkStock();
 Customer c1 = new Customer(1,"Ankit","9876543210","Lucknow");
c1.buyMobile(m1);
 m1.checkStock();
 c1.customerInfo();
 }
}
