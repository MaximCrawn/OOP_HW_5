package sem_5.task2;

public class ToDoListPresenter {
    private ToDoListModel model;
    private ToDoListView view;
    

    
    public ToDoListPresenter(ToDoListModel model, ToDoListView view){
        this.model = model;
        this.view = view;
    }

    public void runToDoList() {
        boolean flag = true;
        while (flag) {
            System.out.print("\033[H\033[J");
            int choice = view.choise("Введите номер соответствующего пункта меню (1, 2, 3, 4): \n" +
                    "1. Добавить задачу\n" +
                    "2. Вывести все задачи\n" +
                    "3. Выход\n");
            switch (choice) {
                case 1:
                    System.out.print("\033[H\033[J");
                    model.addTask(view.readText("Введите текст: "));
                    System.out.print("\033[H\033[J");
                    break;
                case 2:
                    System.out.print("\033[H\033[J");
                    model.showToDoList();
                    view.choise("Для возврата в предыдущее меню введите 1:");
                    System.out.print("\033[H\033[J");
                    break;
                case 3:
                    flag = false;
                    System.out.print("\033[H\033[J"); 
                    break;
                default:
                    System.out.print("\033[H\033[J");
                    System.out.println("Введен некорректный символ");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.print("\033[H\033[J");
                    break;
            }
        }
    }
}


