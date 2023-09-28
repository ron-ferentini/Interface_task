public interface Animal {
    String sound();
    default String method() {
        return "";
    }
}

