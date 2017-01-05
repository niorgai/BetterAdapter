package niorgai.betteradapter.holder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import niorgai.betteradapter.R;
import niorgai.betteradapter.model.Visitable;

/**
 * Created by qiu on 11/22/16.
 */
public class CarViewHolder extends BetterViewHolder {
    public CarViewHolder(View itemView) {
        super(itemView);
    }

    @Override
    public BetterViewHolder onCreateViewHolder(ViewGroup parent) {
        return new CarViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.car, parent, false));
    }

    @Override
    public void onBindViewHolder(Visitable visitable) {

    }
}
