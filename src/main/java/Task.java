public class Task {
    protected String description;
    protected boolean isDone;

    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    public String getStatusIcon() {
        return (isDone ? "[X]" : "[ ]"); // mark done task with X
    }

    public String getDescription() {
        return this.description;
    }

    @Override
    public String toString() {
        return this.getStatusIcon() + " " + this.getDescription();
    }

    public void markUnmark(boolean marked) {
        this.isDone = marked;
        if (marked) {
            System.out.println("Nice! I've marked this task as done:");
        }
        else {
            System.out.println("OK, I've marked this task as not done yet:");
        }
        System.out.println(this);
    }
}