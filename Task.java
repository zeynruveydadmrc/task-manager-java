public class Task {
    int id;
    String title;
    boolean completed;

    public Task(int id, String title) {
        this.id = id;
        this.title = title;
        this.completed = false;
    }

    public void completeTask() {
        completed = true;
    }

    public void displayTask() {
        String status = completed ? "[TAMAMLANDI]" : "[BEKLİYOR]";
        System.out.println(id + " - " + title + " | Durum: " + status);
    }
}