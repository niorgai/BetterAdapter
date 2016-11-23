package niorgai.betteradapter.model;

import niorgai.betteradapter.type.TypeFactory;

/**
 * Created by qiu on 11/18/16.
 */
public class Car implements Visitable {
    @Override
    public int type(TypeFactory typeFactory) {
        return typeFactory.type(this);
    }

}
