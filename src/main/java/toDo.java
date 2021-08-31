public class toDo extends task{
    protected String description;

    public toDo(String description) {
        this.description=description;
    }

    @Override
    public String toString() {
        return this.description;
    }
}
