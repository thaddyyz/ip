import java.util.ArrayList;

public class task {
    private int mark=0;
    private String description;
    ArrayList<String> namelist=new ArrayList<>();
    ArrayList<Character> donelist=new ArrayList<>();
    ArrayList<Character> statelist=new ArrayList<>();
    //private static Shape[] shapes = new Shape[100];
    //private static int shapeCount = 0;
    public task(){
        this(0,"null");
    }
    public task(int mark, String description){
        this.mark=mark;
        this.description=description;
    }
    
    public void getList(){
      System.out.println("Here are the tasks in your list:");
        for(int ay=0;ay<namelist.size();ay++){
            System.out.println((ay+1)+". ["+statelist.get(ay)+"]"+"["+donelist.get(ay)+"] "+namelist.get(ay));
        }
        //return 1;
    }
    public void setList(int mark){
        this.mark=mark-1;//check
        donelist.set(this.mark, 'X');
        System.out.println("Nice! I've marked this task as done: ");
        System.out.println((this.mark+1)+". ["+statelist.get(this.mark)+"]"+"["+donelist.get(this.mark)+"] "+namelist.get(this.mark));
        
    }
    public void setName(String description){
        this.description=description;
        donelist.add(' ');
        namelist.add(this.description);
    }
    public void getTasks(){
        System.out.println("Got it. I've added this task:");
        System.out.println("["+statelist.get(namelist.size()-1)+"]"+"["+donelist.get(namelist.size()-1)+"] "+namelist.get(namelist.size()-1));
        System.out.println("Now you have "+ namelist.size() +" tasks in the list.");
    }
    public void adddeadLine(String description, String by){
        deadLine ddline=new deadLine(description,by);
        statelist.add('D');
        donelist.add(' ');
        namelist.add(ddline.toString());
        //System.out.println("Got it. I've added this task:");
        //System.out.println("["+statelist.get(namelist.size()-1)+"] "+"["+donelist.get(namelist.size()-1)+"] "+namelist.get(namelist.size()-1));
        getTasks();
    }
    public void addTodo(String description){
        toDo todo=new toDo(description);
        statelist.add('T');
        donelist.add(' ');
        namelist.add(todo.toString());
        //System.out.println("Got it. I've added this task:");
        //System.out.println("["+statelist.get(namelist.size()-1)+"] "+"["+donelist.get(namelist.size()-1)+"] "+namelist.get(namelist.size()-1));
        getTasks();
    }
    public void addEvent(String description, String by){
        event evenT=new event(description,by);
        statelist.add('E');
        donelist.add(' ');
        namelist.add(evenT.toString());
        //System.out.println("Got it. I've added this task:");
        //System.out.println("["+statelist.get(namelist.size()-1)+"] "+"["+donelist.get(namelist.size()-1)+"] "+namelist.get(namelist.size()-1));
        getTasks();
    }
}
