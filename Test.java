import java.io.*;
public class Test {
  public static void main(String[] args) throws FileNotFoundException{
    
    Database csStudents = new Database("AP CS Students", new Column("Name", "String"), new Column("Grade", "int"), new Column("e-mail", "String"));
    Database myFamilyMembers = new Database ("Abdullah's Family", new Column("Name", "String"), new Column("Relation", "String"));
    Database accounts  = new Database("Accounts", new Column("UserName", "String"), new Column("Password", "String"));
    
    
    accounts.addEntry(new Entry("CoolDude12", "cooldude"));
    accounts.addEntry(new Entry("BestCodPlayer", "123456789"));
    accounts.addEntry(new Entry("FastCat1337", "hatsandshoes"));
    
    System.out.println(accounts);
    try {
      csStudents.addEntry(new Entry("Abdullah", 12, "AbdullahBinladin17@kingsacademy.edu.jo"));
      csStudents.addEntry(new Entry("Karam", 11, "KaramImmjalli18@kingsacademy.edu.jo"));
      csStudents.addEntry(new Entry("Tariq", 12, "TariqSerhan17@kingsacademy.edu.jo"));
      csStudents.addEntry(new Entry("entries/Amr.txt"));
    } catch (IOException e){
      e.printStackTrace();
    }
    
    System.out.println(csStudents);
    
    try {
      myFamilyMembers.addEntry(new Entry("Ibrahim", "Father"),
                               new Entry("Muneera", "Mother"),
                               new Entry("Ahmad", "Cousin"),
                               new Entry("Mohammad","Uncle"),
                              );
    }catch(IOException e){
      System.out.println("File not found");
      e.printStackTrace();
    }
    
    System.out.println(myFamilyMembers);
    
    csStudents.outputToFile();
    myFamilyMembers.outputToFile();
    accounts.outputToFile();
  
  }
}
