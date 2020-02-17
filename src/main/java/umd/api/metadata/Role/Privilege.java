package umd.api.metadata.Role;

public enum Privilege {
    ADMIN("admin"),
    READ("read"),
    WRITE("write");

    private final String code;

    Privilege(String code) {
        this.code = code;
    }

    public String getCode() {
        return this.code;
    }
}
