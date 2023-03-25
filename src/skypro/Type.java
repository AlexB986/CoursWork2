package skypro;

public enum Type {
    work("Работа"),
    person("Личное");

    private String type;

    Type(String type){
        this.type=type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Type{" +
                "type='" + type + '\'' +
                '}';
    }
}
