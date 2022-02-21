package bridge.resources;

import java.util.BitSet;

public interface IResource {
    String snippet();
    String title();
    String url();

    BitSet image();
}
