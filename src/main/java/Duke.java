import java.util.Scanner;
//import java.util.ArrayList;
public class Duke {
    public static void main(String[] args) {
        System.out.println("Hello! I'm Duke\n" + "What can I do for you?");
        int endMain=0;
        //ArrayList<String> split=new ArrayList<>();
        task tk = new task();
        while(endMain==0){
            String line;
            Scanner in = new Scanner(System.in);
            line = in.nextLine();
            
            if(line.indexOf("bye")!=-1){
                System.out.println("Bye. Hope to see you again soon!");
                endMain=1;
            }
            else if(line.indexOf("list")!=-1){
                tk.getList();
            }
            else if(line.indexOf("done")!=-1){
                int ind=line.indexOf(" ");//.*\\d.*
                //System.out.println(line.substring(ind,ind+1));
                tk.setList(Integer.parseInt(line.substring(ind+1)));
            }
            else if(line.indexOf("todo")!=-1){
                tk.addTodo(line.substring(4));
            }
            else if(line.indexOf("deadline")!=-1){
                int ind=line.indexOf("/by");
                tk.adddeadLine(line.substring(8,ind-1),line.substring(ind+4));
            }
            else if(line.indexOf("event")!=-1){
                int ind=line.indexOf("/at");
                tk.addEvent(line.substring(5,ind-1),line.substring(ind+4));
            }
            else if(line.indexOf("delete")!=-1){
                //int ind=line.indexOf("/at");
                tk.removeTask(line.substring(7));
            }
            else{
                //tk.setName(line);
                //System.out.println("added: "+line);//no longer enters everything to list
                System.out.println("☹ OOPS!!! I'm sorry, but I don't know what that means :-(");
            }
        } 
    }
}
