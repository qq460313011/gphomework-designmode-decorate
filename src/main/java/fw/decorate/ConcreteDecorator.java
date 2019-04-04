package fw.decorate;

/**
 * @Auther: Administrator
 * @Date: 2019/4/4 16:01
 * @Description:
 */
public class ConcreteDecorator extends Decorator {
    public ConcreteDecorator(Component component) {
        super(component);
    }

    public void run() {
        System.out.println("装饰装饰");
        this.component.run();

    }
}
