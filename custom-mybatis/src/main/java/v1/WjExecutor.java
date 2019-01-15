package v1;

public interface WjExecutor {


    public <T> T query(String statement, String parameter);
}
