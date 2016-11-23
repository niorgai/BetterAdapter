package niorgai.betteradapter.type;

import android.view.View;

import niorgai.betteradapter.holder.BetterViewHolder;
import niorgai.betteradapter.model.Car;
import niorgai.betteradapter.model.Duck;

/**
 * Created by qiu on 11/18/16.
 */
public interface TypeFactory {

    int type(Duck duck);

    int type(Car car);

    BetterViewHolder onCreateViewHolder(View itemView, int viewType);

}
