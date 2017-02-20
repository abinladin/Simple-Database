import java.util.ArrayList;
import java.util.List;
public class Column {
  private String title;
  private ArrayList rowSlots;
  
  
  public Column(String title, String type){
    
    this.title= title;
    
    if(type.equals("String")) rowSlots = new ArrayList<String>();
    else if(type.equals("int")) rowSlots = new ArrayList<Integer>();
    else if(type.equals("double")) rowSlots = new ArrayList<Double>();
    else if(type.equals("boolean")) rowSlots = new ArrayList<Boolean>();
    else if(type.equals("long")) rowSlots = new ArrayList<Long>();
    else {
      System.out.println("type is invalid");
      return;
    }
  }
  
  public String getTitle(){
    return title;
  }
  
  public int getSize(){
    return rowSlots.size();
  }
  
  public void addField(Object o) {
    rowSlots.add(o);
  }
  
  public Object getValue(int i){
    return rowSlots.get(i);
  }
}