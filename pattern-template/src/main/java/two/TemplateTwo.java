package two;

public class TemplateTwo {

    public void execute(TemplateInterface<?> templateInterface){
        step1(templateInterface);
    }

    private void step1(TemplateInterface templateInterface){
        templateInterface.findt();
    }
}
