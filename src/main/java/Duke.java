import java.util.Scanner;
import java.util.ArrayList;
public class Duke {
    public static void main(String[] args) {
        String logo = " ____        _        \n"
                + "|  _ \\ _   _| | _____ \n"
                + "| | | | | | | |/ / _ \\\n"
                + "| |_| | |_| |   <  __/\n"
                + "|____/ \\__,_|_|\\_\\___|\n";
        System.out.println("Hello! I'm Duke\n" + "What can I do for you?");
        int x=0,y,l;
        ArrayList<String> list=new ArrayList<>();
        while(x==0){
            String line;
            Scanner in = new Scanner(System.in);
            line = in.nextLine();
            y=line.indexOf("bye");
            l=line.indexOf("list");
            if(y!=-1){
                System.out.println("Bye. Hope to see you again soon!");
                x=1;
            }
            else if(l!=-1){
                for(int k=1;k<=list.size();k++){
                    System.out.println(k+". "+list.get(k-1));
                }
            }
            else{
                list.add(line);
                System.out.println("added: "+line);
            }

        }
    }
}
