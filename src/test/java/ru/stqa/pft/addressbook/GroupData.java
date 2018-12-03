package ru.stqa.pft.addressbook;

public class GroupData {
    private final String name;
    private final String header;
    private final String foooter;

    public GroupData(String name, String header, String foooter) {
        this.name = name;
        this.header = header;
        this.foooter = foooter;
    }

    public String getName() {
        return name;
    }

    public String getHeader() {
        return header;
    }

    public String getFoooter() {
        return foooter;
    }
}
