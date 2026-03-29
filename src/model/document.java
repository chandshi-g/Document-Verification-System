package model;

public class document {
    private String docId;
    private String name;
    private String type;

    public document(String docId, String name, String type) {
        this.docId = docId;
        this.name = name;
        this.type = type;
    }

    public String getDocId() { return docId; }
    public String getName() { return name; }
    public String getType() { return type; }
}
