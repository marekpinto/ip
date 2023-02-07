package duke;

public class Todo extends Task {
    
    public Todo (String description) {
        super(description);
    }

    @Override
    /**
     * Overrides string representation for todos, with a [T] to indicate todo class.
     *
     * @return String Representation.
     */
    public String toString() {
        return "[T]" + super.toString();
    }
}