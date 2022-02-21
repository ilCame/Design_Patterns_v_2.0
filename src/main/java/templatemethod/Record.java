package templatemethod;

import java.util.ArrayList;
import java.util.List;

public abstract class Record {

    private List<String> records = new ArrayList<>();

    public void save(){
        boolean validation = this.validate();
        this.beforeSave();
        if(validation)
            records.add("nomeUtente");
    }

    public abstract boolean validate();

    public void beforeSave(){

    }
}
