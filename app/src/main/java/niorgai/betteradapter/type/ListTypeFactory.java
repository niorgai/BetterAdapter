package niorgai.betteradapter.type;

import android.view.View;

import niorgai.betteradapter.R;
import niorgai.betteradapter.holder.BetterViewHolder;
import niorgai.betteradapter.holder.CarViewHolder;
import niorgai.betteradapter.holder.DuckViewHolder;
import niorgai.betteradapter.model.Car;
import niorgai.betteradapter.model.Duck;

/**
 * Created by qiu on 11/18/16.
 */
public class ListTypeFactory implements TypeFactory {

    @Override
    public int type(Duck duck) {
        return R.layout.duck;
    }

    @Override
    public int type(Car car) {
        return R.layout.car;
    }

    @Override
    public BetterViewHolder onCreateViewHolder(View itemView, int viewType) {
        return viewType == R.layout.duck ? new DuckViewHolder(itemView) : new CarViewHolder(itemView);
    }
}
