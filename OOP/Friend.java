public class Friend {
  String name;
  static int numberofFriends;

  Friend(String name) {
    this.name = name;
    numberofFriends++;
  }

  static void FriendsCounter()
  {
    System.out.println("You have " + numberofFriends + " friends");
  }
  
  
}