/*
 * A golf club wants to develop software to support a number of its activities.
The club secretary will use the system to manage membership details,
which includes adding and removing members. 
To become a member an application has to be recommended by two current members. 
The secretary can add tournaments as well as printing tournament results.
Members of the club can enter tournaments if they wish and can view results.
 */
package golfclubsystem;
import java.util.*;
import java.io.FileOutputStream;
/**
 *
 * @author edw1n
 */
public class GolfClubSystem {

  //  public GolfClubSystem() {
//    
Scanner input = new Scanner(System.in);
   // public  class Secretary{
        String name;
        String memberFile;
        String staffFile;
        int staffId;
        
        public void details(){
            System.out.println("enter your name");
            name = input.nextLine();
            System.out.println("enter your staff ID");
            staffId = input.nextInt();
            try{  
            FileOutputStream fos = new FileOutputStream(name,true);
              staffFile = input.nextLine();
              byte[] b = staffFile.getBytes();
              fos.write(b);
              fos.close();
              System.out.println("file saved");
        }
          catch(Exception e){
              e.printStackTrace();
          }
        }
        public void operation(){
            System.out.println("enter file name:");
          
          try{  
            FileOutputStream fos = new FileOutputStream(name,true);
              memberFile = input.nextLine();
              byte[] b = memberFile.getBytes();
              fos.write(b);
              fos.close();
              System.out.println("file saved");
        }
          catch(Exception e){
              e.printStackTrace();
          }
    }
   // }

    public static void main(String[] args) {
        // TODO code application logic here
        GolfClubSystem club = new GolfClubSystem();
        
        club.details();
        club.operation();
}
}
    
    

