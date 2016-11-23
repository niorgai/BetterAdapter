package niorgai.betteradapter.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

import niorgai.betteradapter.holder.BetterViewHolder;
import niorgai.betteradapter.model.Visitable;
import niorgai.betteradapter.type.TypeFactory;

/**
 * Created by qiu on 11/18/16.
 */
public class MainAdapter extends RecyclerView.Adapter<BetterViewHolder> {

    private TypeFactory mTypeFactory;
    private List<Visitable> mVisitables;

    public MainAdapter(TypeFactory typeFactory, List<Visitable> visitables) {
        mTypeFactory = typeFactory;
        mVisitables = visitables;
    }

    @Override
    public int getItemViewType(int position) {
        return mVisitables.get(position).type(mTypeFactory);
    }

    @Override
    public BetterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return mTypeFactory.onCreateViewHolder(LayoutInflater.from(parent.getContext()).inflate(viewType, parent, false), viewType);
    }

    @Override
    public void onBindViewHolder(BetterViewHolder holder, int position) {
        holder.onBindViewHolder(holder);
    }

    @Override
    public int getItemCount() {
        return mVisitables.size();
    }
}
