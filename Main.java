public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        Task task1 = new Task(1, "Java Projesini Bitir");
        Task task2 = new Task(2, "CV Hazirla");

        manager.addTask(task1);
        manager.addTask(task2);

        // Bir görevi tamamlayalım
        task1.completeTask();

        System.out.println("--- GÖREV LİSTESİ ---");
        manager.listTasks();
    }
}