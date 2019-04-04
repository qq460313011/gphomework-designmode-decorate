package fw.decorate;

/**
 * @Auther: Administrator
 * @Date: 2019/4/4 16:00
 * @Description:
 */
public class Decorator implements Component {

    public Decorator(Component component) {
        this.component = component;
    }

    protected Component component;



    public void run() {
        this.component.run();

    }
}
