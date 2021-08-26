import java.util.ArrayList;

public class task {
    private int mark;
    private String line;
    ArrayList<String> namelist=new ArrayList<>();
    ArrayList<Character> donelist=new ArrayList<>();
    public task(){
        this(0,"null");
    }
    public task(int mark, String line){
        this.mark=mark;
        this.line=line;
    }
    public void getList(){
      System.out.println("Here are the tasks in your list:");
        for(int ay=0;ay<namelist.size();ay++){
            System.out.println((ay+1)+". ["+donelist.get(ay)+"] "+namelist.get(ay));
        }
        //return 1;
    }
    public void setList(int mark){
        this.mark=mark-1;//check
        donelist.set(this.mark, 'X');
        System.out.println("Nice! I've marked this task as done: ");
        System.out.println((this.mark+1)+". ["+donelist.get(this.mark)+"] "+namelist.get(this.mark));
        
    }
    public void setName(String line){
        this.line=line;
        donelist.add(' ');
        namelist.add(this.line);
    }
}
