/** 编写并测试一个代表地址的Adress类,地址信息由国家、省份、城市、街道、邮编组成,并可以返回玩这个的地址信息 */
class Address {
  private String country;
  private String state;
  private String city;
  private String street;
  private int postcode;

  public Address() {
    this("中国", "四川", "成都", "牛鼻路", 650000);
  }

  public Address(String country) {
    this(country, "四川", "成都", "牛鼻路", 650000);
  }

  public Address(String country, String state) {
    this(country, state, "成都", "牛鼻路", 650000);
  }

  public Address(String country, String state, String city) {
    this(country, state, city, "牛鼻路", 650000);
  }

  public Address(String country, String state, String city, String street) {
    this(country, state, city, street, 650000);
  }

  public Address(String country, String state, String city, String street, int postcode) {
    this.country = country;
    this.state = state;
    this.city = city;
    this.street = street;
    this.postcode = postcode;
  }

  public void setCountry() {
    this.country = country;
  }

  public void setState(String state) {
    this.state = state;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public void setPostcode(int postcode) {
    this.postcode = postcode;
  }

  public String getCountry() {
    return country;
  }

  public String getState() {
    return state;
  }

  public String getCity() {
    return city;
  }

  public String getStreet() {
    return street;
  }

  public int getPostcode() {
    return postcode;
  }

  public String getInfo() {
    return country + " " + state + " " + city + " " + street + " " + postcode;
  }
}

public class AddressDemo {
  public static void main(String[] args) {
    Address address = new Address();
    System.out.println(address.getInfo());
  }
}
