package dcll.esup;

/**
 * Created by 21508830 on 24/02/2016.
 */
public class Item {
    private Object value;

    Item(Object value){
        setValue(value);
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
