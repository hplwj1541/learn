package v1;

import dao.Test;
import dao.TestMapper;

public class Entry {

    public static void main(String[] args) {
        WjSqlSession wjSqlSession = new WjSqlSession(new WjConfiguration(), new WjSimpleExecutor());
        TestMapper testMapper = wjSqlSession.getMapper(TestMapper.class);
        Test test = testMapper.selectById("1");
        System.out.println(test.getName());
    }

}
