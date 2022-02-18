package adapter.target;

import adapter.adaptee.Adaptee;
import adapter.adaptee.Adapter;

public class Client {
    ITarget iTarget = new Adapter(new Adaptee());
}
