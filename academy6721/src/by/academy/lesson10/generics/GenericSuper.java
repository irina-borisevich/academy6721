package by.academy.lesson10.generics;
public class GenericSuper<T> {
    private T ob;

    public GenericSuper(T ob) {
        this.ob = ob;
    }

    private T getOb() {
        return ob;
    }
}

