public class Person {
    private String name;
    private String contactNumber;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getContactNumber(){
        return contactNumber;
    }
    public void setContactNumber(String contactNumber){
        this.contactNumber=contactNumber;
    }
    public Person(String name,String contactNumber){
        this.name=name;
        this.contactNumber=contactNumber;
    }
    
    public void displayinformation(){
System.out.println("Name :"+name + "Contact Number : "+contactNumber);


    }
}
