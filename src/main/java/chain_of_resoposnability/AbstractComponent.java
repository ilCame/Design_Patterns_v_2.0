package chain_of_resoposnability;

public abstract class AbstractComponent implements ComponentWithContextualHelp{
    private String tooltipText;
    protected Container container = new Container();

    public void setTooltipText(String tooltipText) {
        this.tooltipText = tooltipText;
    }

    @Override
    public void showHelp(){
        if(tooltipText.equals(null)){
            container.showHelp();
        } else {
            System.out.println(tooltipText);
        }
    }

}
