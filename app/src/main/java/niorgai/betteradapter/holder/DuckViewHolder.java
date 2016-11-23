package niorgai.betteradapter.holder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import niorgai.betteradapter.R;

/**
 * Created by qiu on 11/22/16.
 */
public class DuckViewHolder extends BetterViewHolder {

    public DuckViewHolder(View itemView) {
        super(itemView);
    }

    @Override
    public BetterViewHolder onCreateViewHolder(ViewGroup parent) {
        return new DuckViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.duck, parent, false));
    }

    @Override
    public void onBindViewHolder(BetterViewHolder holder) {

    }
}
