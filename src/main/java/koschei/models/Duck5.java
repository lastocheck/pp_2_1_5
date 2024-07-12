package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Duck5 {
    private Egg6 egg;

    public Duck5(Egg6 egg) {
        this.egg = egg;
    }

    @Autowired
    public void setEgg(Egg6 egg) {
        this.egg = egg;
    }

    @Override
    public String toString() {
        return ", в утке яйцо " + this.egg;
    }
}
