package chap10.inherit;

public class Tv {
    private String tv;

    public Tv(String tv) {
        this.tv = tv;
    }

    @Override
    public String toString() {
        return tv;
    }
}
