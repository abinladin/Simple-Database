import java.util.ArrayList;
import java.util.Scanner;
  
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
  
  public Entry(String url){
    values = new ArrayList<Object>();
    Scanner parser = new Scanner(url);
    
    while(parser.hasNext()){
      values.add((Object)parser.next());
    }
    
  }
  
  public ArrayList<Object> getValues(){
    return values;
  }
  
  public int getIndex(){
    return index;
  }
}