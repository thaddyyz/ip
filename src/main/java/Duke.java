import java.util.Scanner;
//import java.util.ArrayList;
public class Duke {
    public static void main(String[] args) {
        System.out.println("Hello! I'm Duke\n" + "What can I do for you?");
        int x=0,y,l,d,td,dl,ev;
        //ArrayList<String> split=new ArrayList<>();
        task tk = new task();
        while(x==0){
            String line;
            Scanner in = new Scanner(System.in);
            line = in.nextLine();
            y=line.indexOf("bye");
            l=line.indexOf("list");
            d=line.indexOf("done");
            td=line.indexOf("todo");
            dl=line.indexOf("deadline");
            ev=line.indexOf("event");
            
            if(y!=-1){
                System.out.println("Bye. Hope to see you again soon!");
                x=1;
            }
            else if(l!=-1){
                //for(int k=1;k<=list.size();k++){System.out.println(k+". ["+mark+"] "+list.get(k-1));}
                tk.getList();
            }
            else if(d!=-1){
                int ind=line.indexOf(" ");//.*\\d.*
                //System.out.println(line.substring(ind,ind+1));
                tk.setList(Integer.parseInt(line.substring(ind+1)));
            }
            else if(td!=-1){
                tk.addTodo(line.substring(5));
            }
            else if(dl!=-1){
                int ind=line.indexOf("/by");
                tk.adddeadLine(line.substring(9,ind-1),line.substring(ind+4));
            }
            else if(ev!=-1){
                int ind=line.indexOf("/at");
                tk.addEvent(line.substring(6,ind-1),line.substring(ind+4));
            }
            else{
                //list.add(line);
                tk.setName(line);
                System.out.println("added: "+line);
            }
        } 
    }
}
