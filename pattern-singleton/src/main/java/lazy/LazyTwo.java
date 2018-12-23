package lazy;

/**
 * 加锁
 */
public class LazyTwo {

    private LazyTwo(){}

    private static LazyTwo lazyOne = null;

    public static synchronized LazyTwo getInstance() {
        if (lazyOne == null) {
            lazyOne = new LazyTwo();
        }
        return lazyOne;
    }

}
