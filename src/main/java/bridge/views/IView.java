package bridge.views;

import bridge.resources.IResource;

public abstract class IView {
    public IResource resource;

    public IView ( IResource resource){
        this.resource = resource;
    }

    public abstract String show();
}
