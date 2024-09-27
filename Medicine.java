



public class Medicine {
    
    private String medicineid;
    private String batchNumber;
    private String manufacturer;
    private Date expiryDate;
    private int quantity;
    private String name;
    private double price;

public  String getMedicineid(){
    return medicineid;
}
public void setMedicineid(String medicineid){
    this.medicineid=medicineid;
}
public String getBatchNumber(){
    return batchNumber;
}

public void setBatchNumber(String batchNumber){
this.batchNumber=batchNumber;
} 
public String getManufacturer(){
    return manufacturer;
}

public void setManufacturer(String manufacturer){
    this.manufacturer=manufacturer;
} 
public String getName(){
    return name;
}

public void setName(String name){
    this.name=name;
} 
public Date getExpiryDate()
{
    return expiryDate;
}
public void setExpiryDate(Date expiryDate){
    this.expiryDate=expiryDate;
}
public  double getPrice(){
    return price;
} 
public void setPrice(double price)
{
    this.price=price;
}
public int getQuantity(){
    return quantity;
}
public void getQuntity(int quantity){
    this.quantity=quantity;
}
public void displayinformation(){
    System.out.println("medicineid :"+medicineid+"batchNumber:" +batchNumber+"manufacturer:"+manufacturer+"Expiry Date :"+expiryDate+"Quantity :"+quantity+"Name :"+name+"price:"+price);
}
Medicine(String name, String  medicineid ,double price,int quantity, String  manufacturer, String batchNumber , Date expiryDate){
this.name=name;
this.medicineid=medicineid;
this.price=price;
this.quantity=quantity;
this.manufacturer=manufacturer;
this.batchNumber=batchNumber;
this.expiryDate=expiryDate;

}
  
}


