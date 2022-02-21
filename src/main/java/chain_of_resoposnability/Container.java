package chain_of_resoposnability;


import java.util.ArrayList;
import java.util.List;

public class Container extends AbstractComponent {
    protected List<AbstractComponent> children = new ArrayList<>();

    public void add(AbstractComponent child){
        children.add(child);
        child.container = this;
    }
}
