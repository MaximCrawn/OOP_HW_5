package sem_5.task2;

import java.util.ArrayList;

public class ToDoListModel {
    private ArrayList<String> toDoList;

    public  ToDoListModel(){
        toDoList = new ArrayList<>();
    }

    public void showToDoList(){
        for (String task : toDoList) {
            System.out.println(task);
        }
    }

    public void addTask(String str1){
        toDoList.add(str1);
    }

    public ArrayList<String> getToDoList() {
        return toDoList;
    }

    
}

