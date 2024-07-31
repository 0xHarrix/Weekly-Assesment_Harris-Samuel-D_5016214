class Task {
    int taskId;
    String taskName;
    String status;

    Task(int taskId, String taskName, String status) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.status = status;
    }
}

class Node {
    Task task;
    Node next;

    Node(Task task) {
        this.task = task;
        this.next = null;
    }
}

public class TaskManagement {
    private Node head;

    public TaskManagement() {
        head = null;
    }

    public void addTask(Task task) {
        Node newNode = new Node(task);
        newNode.next = head;
        head = newNode;
    }

    public Task searchTask(int taskId) {
        Node current = head;
        while (current != null) {
            if (current.task.taskId == taskId) {
                return current.task;
            }
            current = current.next;
        }
        return null;
    }

    public void traverseTasks() {
        Node current = head;
        while (current != null) {
            System.out.println(current.task.taskName + " - " + current.task.status);
            current = current.next;
        }
    }

    public void deleteTask(int taskId) {
        Node current = head;
        Node prev = null;
        while (current != null && current.task.taskId != taskId) {
            prev = current;
            current = current.next;
        }
        if (current != null) {
            if (prev != null) {
                prev.next = current.next;
            } else {
                head = current.next;
            }
        }
    }

    public static void main(String[] args) {
        TaskManagement management = new TaskManagement();
        Task task1 = new Task(1, "Design Database", "Pending");
        Task task2 = new Task(2, "Develop API", "In Progress");

        management.addTask(task1);
        management.addTask(task2);

        management.traverseTasks();

        management.deleteTask(1);
        management.traverseTasks();
    }
}
