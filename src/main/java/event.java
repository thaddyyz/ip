public class event extends task{
    protected String by,description;

    public event(String description, String by) {
        this.description=description;
        this.by = by;
    }

    @Override
    public String toString() {
        return String.format("%s (at: %s)",this.description, this.by);
    }
}

