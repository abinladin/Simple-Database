import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;
public class Database {
  
  private ArrayList<Column> columns;
  private String name;
  private static int untitledCount;
  
  public Database(){
    name = "untitled";
    if (untitledCount > 0){
      name += "(" + untitledCount + ")";
    }
    untitledCount++;
  }
  
  public Database(String name, Column...initialFields){
    this.name = name;
    columns = new ArrayList<Column>();
    for (Column c : initialFields){
      columns.add(c);
    }
  }
  
  public Database(String path) throws FileNotFoundException{
    Scanner parser = new Scanner(new File(path));
    
  }
  
  
  public void addColumn(Column c){
    columns.add(c);
  }
  
  
  public void addEntry(Entry e){
    for (int i = 0; i < columns.size(); i++){
      columns.get(i).addField(e.getValues().get(i));
    }
  }
  
  public void addEntry(Entry...e){
    for(int i = 0; i < e.length; i++){
      addEntry(e[i]);
    }
  }
  
  public void remove(Column col){
    for (Column c : columns){
      if(c.getTitle().equals(col.getTitle()))
        columns.remove(col);
    }
  }
  
  
  public ArrayList<Column> getColumns(){
    return columns;
  }
  
  
  public String toString(){
    String rtn = name + "\n";
    
    for (Column c : columns) {
      rtn += c.getTitle() + "        ";
    }
    
    rtn += "\n"; 
    int len = rtn.length() +12;
    for (int i = 0; i < len; i++)
      rtn += ("-");
    rtn += "\n";
    
    for (int i = 0; i < columns.get(0).getSize(); i++){
      for (int j = 0; j < columns.size(); j++){
        rtn += columns.get(j).getValue(i) + "        ";
      }
      rtn+= "\n";
    }
    
    return rtn;
  }
  
  
  public void outputToFile(){
    try {
      PrintWriter writer = new PrintWriter("databases/" + name + ".txt");
      writer.println(this);
      writer.close();
      
    } catch(IOException e) {
      e.printStackTrace();
    }
  }
  
  public String getName(){
    return name;
  }
  
  public boolean equals(Database d){
    return (toString().equals(d.toString()));
  }
  
}

