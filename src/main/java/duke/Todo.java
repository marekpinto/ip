package duke;

/**
 * Represents a simple todo item. A <code>Todo</code> object corresponds to
 * a task with only a description.
 */
public class Todo extends Task {

    /**
     * Initializes Todo.
     *
     * @param description Description of todo.
     */
    public Todo(String description) {
        super(description);
    }

    @Override
    /**
     * Returns standardized string to be stored on memory that can be read back into the program in the future.
     *
     * @return Standardized string to be stored in memory.
     */
    public String storeString() {
        return super.storeString() + "|T|" + description + "\n";
    }

    @Override
    /**
     * Overrides matchesKeyword in Task. Searches through description for a keyword.
     *
     * @param keyword Keyword to search for.
     * @return True if Todo matches the keyword, False otherwise.
     */
    public boolean matchesKeyword(String keyword) {
        if (description.contains(keyword)) {
            return true;
        } else {
            return false;
        }
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
