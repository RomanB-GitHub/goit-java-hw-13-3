package home_work_13.original_user;

import com.google.gson.Gson;
import home_work_13.original_user.user_data.*;
import java.io.IOException;
import java.util.List;

public class Main {

  public static final Gson GSON = new Gson();
  public static final int DEFAULT_USER_ID_TO_OPERATE = 1;
  public static final String DEFAULT_USER_NAME = "Kurtis Weissnat";

  public static void main(String[] args) throws IOException, InterruptedException {

// Task 1.1.
    System.out.println("Testing task task1.1 : create a new User-object");
    User userToCreate = createDefaultUser();
    System.out.println("userToCreate  = " + userToCreate);
    User createdUser = GSON.fromJson(HttpClientUtil.createNewUser(userToCreate), User.class);
    System.out.println("createdUser = " + createdUser);

    printingTasksDelimeter();

    // Task 1.2
    System.out.println("Testing task 1.2 : updating the user");
    User updatedUser = new User();

    updatedUser.setName(createdUser.getName());
    updatedUser.setUserName("NewUserName");
    updatedUser.setEmail(createdUser.getEmail());
    updatedUser.setAddress(createdUser.getAddress());
    updatedUser.setPhone(createdUser.getPhone());
    updatedUser.setWebsite(createdUser.getWebsite());
    updatedUser.setCompany(createdUser.getCompany());

    String s = HttpClientUtil.updateUser(DEFAULT_USER_ID_TO_OPERATE,updatedUser);
    User checkUpdatedUser = GSON.fromJson(s,User.class);
    System.out.println(checkUpdatedUser);

    printingTasksDelimeter();

    //Task 1.3
    System.out.println("Testing task 1.3 : delete the User");
    createdUser.setId(DEFAULT_USER_ID_TO_OPERATE);
    System.out.println("Status of delete operation " + HttpClientUtil.deleteUser(createdUser));

    printingTasksDelimeter();

    //Task 1.4
    System.out.println("Testing task 1.4 : getting all Users");
    List<User> allUsers = HttpClientUtil.getAllUsers();
    allUsers.forEach(System.out::println);

    printingTasksDelimeter();

    //Task 1.5
    System.out.println("Testing task 1.5 Get user by Id:1 ");
    System.out.println("UserByIdNumber = " + HttpClientUtil.getUserById(DEFAULT_USER_ID_TO_OPERATE));

    printingTasksDelimeter();

    //Task 1.6
    System.out.println("Testing task 1.6 Get information of User: Kurtis Weissnat");
    System.out.println("UserByName = " + HttpClientUtil.getUserByName(DEFAULT_USER_NAME));

    printingTasksDelimeter();

    //Task 2
    System.out.println("Testing task 2 Get all comment of User with Id ");
    System.out.println(HttpClientUtil.getAllCommentsForLastPostOfUser(createdUser));

    printingTasksDelimeter();

    //Task 3
    System.out.println("Testing task 3 Get all opened tasks for User with Id 1 ");
    System.out.println("\nList of opened tasks:\n");
    List<Task> allOpenTasks = HttpClientUtil.getListOfOpenTasksForUser(createdUser);
    allOpenTasks.forEach(System.out::println);
  }


  private static void printingTasksDelimeter() {
    System.out.println("\n#####################\n");
  }

  private static User createDefaultUser() {
    User user = new User();
    user.setId(DEFAULT_USER_ID_TO_OPERATE);
    user.setName("Test");
    user.setUserName("TEST");
    user.setEmail("test@test.com");
    user.setAddress(createDefaultAddress());
    user.setPhone("1 - 463 - 123 - 4447");
    user.setWebsite("java.ua");
    user.setCompany(createDefaultCompany());
    return user;
  }

  private static Address createDefaultAddress() {
    Address address = new Address();
    address.setStreet("DenverStreet");
    address.setSuite("Suit - 525");
    address.setCity("Frodswell");
    address.setZipcode("78943 - 0126");
    Geo geo = new Geo();
    geo.setLength("-43.9509");
    geo.setLatitude("-34.4618");
    address.setGeo(geo);
    return address;
  }

  private static Company createDefaultCompany() {
    Company company = new Company();
    company.setName("Gorillas-river");
    company.setCatchPhrase("Multi-tiered zero tolerance productivity");
    company.setBs("revolutionize end-to-end systems");
    return company;
  }


}
