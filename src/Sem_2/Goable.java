import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
public interface Goable {
    void go();
    default double getRunSpeed(){
        return 10;
    }

}
