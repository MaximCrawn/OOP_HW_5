package sem_5.task2;

public class Main {
    public static void main(String[] args) {
        ToDoListModel model = new ToDoListModel();
        ToDoListView view = new ToDoListView();
        ToDoListPresenter presenter = new ToDoListPresenter(model, view);
        presenter.runToDoList();
    }
}
