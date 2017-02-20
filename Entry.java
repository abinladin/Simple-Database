import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
public class Entry{
  private ArrayList<Object> values;
  private static int index = 0;
  
  public Entry(Object...objs){
    values = new ArrayList<Object>();
    for (Object o : objs){
      values.add(o);
    }
    index++;
  }
  
  public Entry(String url) throws FileNotFoundException, IOException{
    values = new ArrayList<Object>();
    Scanner s = new Scanner(new File(url));
    while(s.hasNextLine()){
      values.add((Object)s.nextLine());
    }
    
  }
  
  public ArrayList<Object> getValues(){
    return values;
  }
  
  public int getIndex(){
    return index;
  }
}
