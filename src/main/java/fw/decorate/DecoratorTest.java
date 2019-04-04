package fw.decorate;

/**
 * @Auther: Administrator
 * @Date: 2019/4/4 16:03
 * @Description:
 */
public class DecoratorTest {

    public static void main(String[] args) {

        Component component=new ConcreteDecorator(new ConcreteComponent());

        component.run();

    }

}
