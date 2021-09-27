# User Guide
This program is designed to assist user in keeping track with various activities similar to a day-planner.
## Features 

### Feature-Store Specific activity types

This program allows user to input and store various activity types such as todo, event and deadline. Each type comprises of a specific parameter such as time and date for deadline/event type activities.

Example:

todo borrow book
    ____________________________________________________________
     Got it. I've added this task: 
       [T][ ] borrow book
     Now you have 5 tasks in the list.
    ____________________________________________________________

deadline return book /by Sunday
    ____________________________________________________________
     Got it. I've added this task: 
       [D][ ] return book (by: Sunday)
     Now you have 6 tasks in the list.
    ____________________________________________________________

event project meeting /at Mon 2-4pm
    ____________________________________________________________
     Got it. I've added this task: 
       [E][ ] project meeting (at: Mon 2-4pm)
     Now you have 7 tasks in the list.
    ____________________________________________________________

### Feature-Mark activities that are completed

Allows user to mark tasks that are completed.

Example:

list
    ____________________________________________________________
     Here are the tasks in your list:
     1.[T][ ] borrow book
     2.[D][ ] return book (by: Sunday)
     3.[E][ ] project meeting (at: Mon 2-4pm)
    ____________________________________________________________

done 2
    ____________________________________________________________
     Nice! I've marked this task as done: 
       [D][X] return book (by: Sunday)
    ____________________________________________________________

### Feature-Delete

Allows user to delete tasks from list.

Example:

delete 3
    ____________________________________________________________
     Noted. I've removed this task: 
       [E][ ] project meeting (at: Aug 6th 2-4pm)
     Now you have 4 tasks in the list.
    ____________________________________________________________

### Feature-Error Handling

Feedback user on unrecognised inputs.

Example:

todo
    ____________________________________________________________
     ☹ OOPS!!! The description of a todo cannot be empty.
    ____________________________________________________________

blah
    ____________________________________________________________
     ☹ OOPS!!! I'm sorry, but I don't know what that means :-(
    ____________________________________________________________

### Feature-Find activities by keyword

Allows user to find tasks in the list by keyword.

Example:

find book
    ____________________________________________________________
     Here are the matching tasks in your list:
     1.[T][X] read book
     2.[D][X] return book (by: June 6th)
    ____________________________________________________________

### Feature-Save to File

Program automatically to save list to external file for future reference. Upon initialising program, data from the stored file will be referenced to add to list.
Stored file can be found under data folder of project. File named duke.txt

## Usage

### `bye` - Ends program

Example of usage: 

`goodbye`

Expected outcome:

Closing message.

```
expected output: Bye. Hope to see you again soon!
```

### `list` - List stored tasks

Example of usage: 

`list`

Expected outcome:

```
expected output: 
     Here are the tasks in your list:
     1.[T][X] read book
     2.[D][X] return book (by: June 6th)
     3.[E][ ] project meeting (at: Aug 6th 2-4pm)
     4.[T][X] join sports club
     5.[T][ ] borrow book

```
### Error Messages

```
☹ OOPS!!! I'm sorry, but I don't know what that means :-(
```
Unrecognised input, refer to types of input.

```
☹ OOPS!!! The description of a todo cannot be empty.
```
Empty task input, refer to input format to add task.

```
File not found
```
This is a warning message and does not affect the operation. Simply ad a new task and the reference file will automatically be created.