public class Test {
  public static void main(String[] args) {
    
    Database csStudents = new Database("AP CS Students", new Column("Name", "String"), new Column("Grade", "int"), new Column("e-mail", "String"));
    Database myFamilyMembers = new Database ("Abdullah's Family", new Column("Name", "String"), new Column("Relation", "String"));
    Database untitledTest = new Database();
    Database untitledTest1 = new Database();
    
    System.out.println(untitledTest.getName());
    System.out.println(untitledTest1.getName());
    
    csStudents.addEntry(new Entry("Abdullah", 12, "AbdullahBinladin17@kingsacademy.edu.jo"));
    csStudents.addEntry(new Entry("Karam", 11, "KaramImmjalli18@kingsacademy.edu.jo"));
    csStudents.addEntry(new Entry("Tariq", 12, "TariqSerhan17@kingsacademy.edu.jo"));
    
    System.out.println(csStudents);
    
    myFamilyMembers.addEntry(new Entry("Ibrahim", "Father"));
    myFamilyMembers.addEntry(new Entry("Muneera", "Mother"));
    myFamilyMembers.addEntry(new Entry("Lama", "Cousin"));
    myFamilyMembers.addEntry(new Entry("Ahmad", "Uncle"), new Entry("Yeslam", "Uncle"));
    
    System.out.println(myFamilyMembers);
    
    csStudents.outputToFile();
    myFamilyMembers.outputToFile();
  
  }
}