package chap10.inherit;

public class ChildProduct<T, M, C> extends Product<T, M> {
    private C company;

    // 생성자
    public ChildProduct(T kind, M model, C company) {
        super(kind, model);
        this.company = company;
    }

    public C getCompany() {
        return company;
    }

}
