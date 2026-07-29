public class Mobile {
    String brand;
String model;
int ram;
int storage;
int battery;
double price;
int stock;
Mobile(String brand,
       String model,
       int ram,
       int storage,
       int battery,
       double price,
       int stock) {
    this.brand = brand;
    this.model = model;
    this.ram = ram;
    this.storage = storage;
    this.battery = battery;
    this.price = price;
    this.stock = stock;
}
void MobileInfo(){
System.out.println("Brand Name: " + brand);
System.out.println("Model Name: "+model);
System.out.println("Ram: " + ram+"GB");
System.out.println("Storage: "+storage+"GB");
System.out.println("Battery: "+battery+"mAh");
System.out.println( "Price: "+price);
System.out.println("Stock: "+stock);
System.out.println("_____________________");
}

void checkStock(){
    System.out.println("Stock is:"+ stock);
}
void sellMobile(){
    if(stock > 0)
{
    stock--;
    System.out.println("Mobile sold");
}
else
{
    System.out.println("Sorry ! Out of Stock");
}
}
}
