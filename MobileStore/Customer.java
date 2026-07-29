public class Customer {
    int customerId;
String name;
String mobileNumber;
String city;
String purchasedMobile;
 Customer(int customerId,
         String name,
         String mobileNumber,
         String city){
            this.customerId=customerId;
            this.name=name;
            this.mobileNumber=mobileNumber;
            this.city=city;
         }
         void customerInfo(){
            System.out.println("Customer id: "+ customerId);
            System.out.println("Name:"+ name);
            System.out.println("Mobile:"+ mobileNumber);
            System.out.println("City:"+city);
            System.out.println("Purches Mobile: "+purchasedMobile);
         }
 //   void buyMobile(Mobile mobile) {

//     if (mobile.stock > 0) {

//         mobile.sellMobile();

//         purchasedMobile = mobile.model;

//         System.out.println(name + " purchased " + mobile.model);

//     } else {

//         System.out.println("Sorry! Mobile Out of Stock.");
//     }
// }
void buyMobile(Mobile mobile){
    if(mobile.stock >0){
        mobile.sellMobile();
        purchasedMobile=mobile.model;
        System.out.println(name + " purchesd " + mobile.model);
    }
    else{
        System.out.println("Sorry 1 mobile out of stock.");
    }
    
}
        
         }
        

