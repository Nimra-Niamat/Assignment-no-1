import java.util.Scanner;



public class PharmacyShop {
  
        
    
    
    public Address address;
    public Medicine[] medicines;
    public int medicineCount;
    public  Person owner;
    
    public PharmacyShop(Address address, Medicine[] medicines,int medicineCount,Person owner){
     this.address=address;
     this.medicines=medicines;
     this.medicineCount=medicineCount;
     this.owner=owner;
    }
    public PharmacyShop(){
    addMedicine();
    display();
    owner.displayinformation();
    address.displayAddress();

        
    }

Scanner sc =new Scanner(System.in);
int size = sc.nextInt();
Medicine[] list = new Medicine[size];
public void  addMedicine(){
    System.out.println("enter medicine info");
    for(int i=0 ;i<=size;i++){
        sc.nextLine();
    }



  
}
public void display(){
    for(int i=0;i<=size;i++){
        System.err.println("Medicine"+medicines);
    }
}

}

    

