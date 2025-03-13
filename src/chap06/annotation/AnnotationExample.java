package chap06.annotation;

@AnnotationName
public class AnnotationExample {

    @AnnotationName
    private String field;

    @AnnotationName
    public AnnotationExample(String field) {
        this.field = field;
    }

    public String getField() {
        return field;
    }
}
