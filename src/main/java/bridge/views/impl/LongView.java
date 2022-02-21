package bridge.views.impl;

import bridge.resources.IResource;
import bridge.views.IView;

public class LongView extends IView {

    public LongView(IResource resource) {
        super(resource);
    }

    @Override
    public String show(){
        StringBuilder html = new StringBuilder();

        html.append(this.resource.snippet());
        html.append(this.resource.url());
        html.append(this.resource.title());
        html.append(this.resource.image().toString());

        return html.toString();
    }
}
