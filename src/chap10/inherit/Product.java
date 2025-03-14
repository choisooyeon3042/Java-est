package chap10.inherit;

public class Product<T, M> {
    private T kind;
    private M model;

    // 부모 클래스 생성자
    public Product(T kind, M model) {
        this.kind = kind;
        this.model = model;
    }

    public T getKind() {
        return kind;
    }
    public M getModel() {
        return model;
    }
    public void setKind(T kind) {
        this.kind = kind;
    }
    public void setModel(M model) {
        this.model = model;
    }
}
