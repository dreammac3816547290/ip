import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Deadline extends Task {
    private final LocalDate deadline;

    public Deadline(String description, String deadline) {
        super(description);
        this.deadline = LocalDate.parse(deadline);
        type = 'D';
    }

    public Deadline(String description, boolean isDone, String deadline) {
        this(description, deadline);
        this.isDone = isDone;
    }

    @Override
    public String toString() {
        return super.toString() + " (by: " + deadline.format(DateTimeFormatter.ofPattern("MMM d yyyy")) + ")";
    }

    @Override
    public String data() {
        return super.data() + ", " + deadline;
    }
}
