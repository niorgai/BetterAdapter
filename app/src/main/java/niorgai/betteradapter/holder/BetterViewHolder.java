package niorgai.betteradapter.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import niorgai.betteradapter.model.Visitable;

/**
 * Created by qiu on 11/22/16.
 */
public abstract class BetterViewHolder extends RecyclerView.ViewHolder {

    public BetterViewHolder(View itemView) {
        super(itemView);
    }

    public abstract BetterViewHolder onCreateViewHolder(ViewGroup parent);

    public abstract void onBindViewHolder(Visitable visitable);
}
