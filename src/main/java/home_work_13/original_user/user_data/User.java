package home_work_13.original_user.user_data;

import java.util.Objects;

public class User {
  private int id;
  private String name;
  private String userName;
  private String email;
  private Address address;
  private Geo geo;
  private String phone;
  private String website;
  private Company company;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public home_work_13.original_user.user_data.Address getAddress() {
    return address;
  }

  public void setAddress(home_work_13.original_user.user_data.Address address) {
    this.address = address;
  }

  public home_work_13.original_user.user_data.Geo getGeo() {
    return geo;
  }

  public void setGeo(home_work_13.original_user.user_data.Geo geo) {
    this.geo = geo;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getWebsite() {
    return website;
  }

  public void setWebsite(String website) {
    this.website = website;
  }

  public home_work_13.original_user.user_data.Company getCompany() {
    return company;
  }

  public void setCompany(home_work_13.original_user.user_data.Company company) {
    this.company = company;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof User)) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(getName(), user.getName()) && Objects.equals(getEmail(), user.getEmail());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getName(), getEmail());
  }

  @Override
  public String toString() {
    return "User{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", userName='" + userName + '\'' +
        ", email='" + email + '\'' +
        ", address=" + address +
        ", geo=" + geo +
        ", phone='" + phone + '\'' +
        ", website='" + website + '\'' +
        ", company=" + company +
        '}';
  }
}
