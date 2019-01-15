package two;

public class TemplateImpl {
    private TemplateTwo templateTwo = new TemplateTwo();

    public void findt(){
        templateTwo.execute(new TemplateInterface<TestObject>() {
            @Override
            public TestObject findt() {
                return null;
            }
        });
    }
}
