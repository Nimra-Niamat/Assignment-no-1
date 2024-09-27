class Address{
private String street;
private String city;
private String postelCode;

public String getStreet()
{
    return street;

}
public void setStreet(String street){
    this.street= street;
}

public String getCity()
{
    return city;

}
public void setCity(String city){
    this.city= city;
}

public String getPostelCode()
{
    return postelCode;

}
public void setPostelCode(String postelCode){
    this.postelCode= postelCode;
}
public Address(String street , String city , String postelCode){
    this.street= street;
    this.city= city;
    this.postelCode= postelCode;
}



public void displayAddress(){
    System.out.println("Street: ,"+street+ "City: ,"+city+"PostalCod: "+postelCode);
}



}