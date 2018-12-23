package lazy;

public class LazyOne {

    private LazyOne(){}

    private static LazyOne lazyOne = null;

    public static LazyOne getInstance() {
        if (lazyOne == null) {
            lazyOne = new LazyOne();
        }
        return lazyOne;
    }

}
