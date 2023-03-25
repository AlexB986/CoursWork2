package skypro;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public class Task {
    private static int idGenerator = 0;
    private int id;
    private String title;
    private String description;
    private Type type;
    private LocalDateTime dateTime;
    private Appearsln appearsln;

    public Task(String title,String description,Type type,Appearsln appearsln) {
        this.title = title;
        this.description = description;
        this.type = type;
        this.appearsln=appearsln;
        id = idGenerator++;
    }

    public boolean appearsln(LocalDate localDate) {
        return false;
    }

    public int getId() {
        return this.id;
    }

    public Type getType() {
        return this.type;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    public LocalDateTime getDateTime() {
        return this.dateTime;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description, type, dateTime);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", type=" + type +
                ", dateTime=" + dateTime +
                '}';
    }
}

