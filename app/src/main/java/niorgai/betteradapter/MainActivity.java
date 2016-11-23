package niorgai.betteradapter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import niorgai.betteradapter.adapter.MainAdapter;
import niorgai.betteradapter.model.Car;
import niorgai.betteradapter.model.Duck;
import niorgai.betteradapter.model.Visitable;
import niorgai.betteradapter.type.ListTypeFactory;

public class MainActivity extends AppCompatActivity {

    private MainAdapter mMainAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        List<Visitable> visitables = new ArrayList<>();
        visitables.add(new Car());
        visitables.add(new Car());
        visitables.add(new Car());
        visitables.add(new Duck());
        visitables.add(new Duck());
        visitables.add(new Duck());
        visitables.add(new Duck());
        visitables.add(new Duck());
        visitables.add(new Car());
        visitables.add(new Car());
        visitables.add(new Car());
        visitables.add(new Duck());
        visitables.add(new Car());
        visitables.add(new Car());
        visitables.add(new Duck());
        visitables.add(new Car());

        mMainAdapter = new MainAdapter(new ListTypeFactory(), visitables);
        recyclerView.setAdapter(mMainAdapter);

    }
}
