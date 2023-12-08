package week8;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface CanSendMessage{
}
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface RequiresPermission{
 String value();
}
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface UserPermission{
 String value();
}
class Admin{
 private String username;
 public Admin(String username) {
  this.username = username;
 }
 public String getUsername() {
  return username;
 }

}
class User{
 private String username;
 public User(String username) {
  this.username = username;
 }
 public String getUsername() {
  return username;
 }

}
class Lab8 {
  @CanSendMessage
  @RequiresPermission("admin")
  public static void sendMessage(User sender, String message) {
   System.out.println("Sending message: " + message);
   System.out.println("Sent by: " + sender.getUsername());
  }

  public static void main(String[] args) {
   User regularUser = new User("Alice");
   User adminUser = new User("AdminBob");

   System.out.println("Regular User:");
   try {
    sendMessage(regularUser, "Hello!");
   } catch (Exception e) {
    System.out.println("Exception: " + e.getMessage());
   }
   System.out.println();

   System.out.println("Admin User:");
   try {
    sendMessage(adminUser, "Important message!");
   } catch (Exception e) {
    System.out.println("Exception: " + e.getMessage());
   }
  }


 }


