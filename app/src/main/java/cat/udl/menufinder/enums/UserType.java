package cat.udl.menufinder.enums;

public enum UserType {
    CLIENT("client"),
    RESTAURANT("restaurant"),
    GUEST("guest");

    private String text;

    UserType(String text) {
        this.text = text;
    }

    public static UserType fromString(String text) {
        if (text != null) {
            for (UserType userType : UserType.values()) {
                if (text.equalsIgnoreCase(userType.text)) {
                    return userType;
                }
            }
        }
        return null;
    }

    public String getText() {
        return this.text;
    }
}
