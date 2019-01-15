package v1;

public class WjSqlSession {

    private WjConfiguration wjConfiguration;

    private WjExecutor wjExecutor;


    public WjSqlSession(WjConfiguration wjConfiguration, WjExecutor wjExecutor) {
        this.wjConfiguration = wjConfiguration;
        this.wjExecutor = wjExecutor;
    }

    /**
     *
     * @param clazz
     * @param <T>
     * @return
     */
    public <T> T getMapper(Class<T> clazz) {
        return wjConfiguration.getMapper(clazz, this);
    }

    /**
     *
     * @param statement sql语句
     * @param parameter sql参数
     * @param <T>
     * @return
     */
    public <T> T selectOne(String statement, String parameter) {
        return wjExecutor.query(statement, parameter);
    }
}
