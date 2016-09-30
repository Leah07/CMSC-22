/*
 * A Test Driver for the Date class.
 */
public class TestDate {
   public static void main(String[] args) {
      // Test constructor and toString()
      Date d1 = new Date(2016, 4, 6);
      System.out.println(d1);  // toString()
 
      // Test Setters and Getters
      d1.setYear(2012);
      d1.setMonth(12);
      d1.setDay(23);
      System.out.println(d1);  // run toString() to inspect the modified instance
      System.out.println("Year is: " + d1.getYear());
      System.out.println("Month is: " + d1.getMonth());
      System.out.println("Day is: " + d1.getDay());
 
      System.out.println("\n");

      // Test setDate()
      d1.setDate(2017, 10, 2);
      System.out.println(d1);  // run toString() to inspect the modified instance
      System.out.println("Year is: " + d1.getYear());
      System.out.println("Month is: " + d1.getMonth());
      System.out.println("Day is: " + d1.getDay());

      System.out.println("\n");

      d1.setDate(2988, 12, 13);
      System.out.println(d1);  // run toString() to inspect the modified instance
      System.out.println("Year is: " + d1.getYear());
      System.out.println("Month is: " + d1.getMonth());
      System.out.println("Day is: " + d1.getDay());

      System.out.println("\n");
      
      d1.setDate(999, 13, 32);
      System.out.println(d1);  // run toString() to inspect the modified instance
      System.out.println("Year is: " + d1.getYear());
      System.out.println("Month is: " + d1.getMonth());
      System.out.println("Day is: " + d1.getDay());
   }
}
