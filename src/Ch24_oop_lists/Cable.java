package Ch24_oop_lists;

public class Cable {

    private String type;

    public Cable(String type) {
        this.type = type;
    }

    public void print() {
        System.out.println("Jest to kabel typu" + getType());
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
