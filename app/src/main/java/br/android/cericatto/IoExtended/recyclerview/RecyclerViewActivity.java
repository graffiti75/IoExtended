package br.android.cericatto.IoExtended.recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import br.android.cericatto.IoExtended.R;

/**
 * RecyclerViewActivity.java.
 *
 * @author Rodrigo Cericatto
 * @since May 11, 2017
 */
public class RecyclerViewActivity extends AppCompatActivity {
    private static final int LIMIT = 15;

    // Context.
    private RecyclerViewActivity mActivity = RecyclerViewActivity.this;

    // Adapter.
    private List<String> mList = new ArrayList<>();
    private StringRecyclerAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview);
        setAdapter();
    }

    public void setAdapter() {
        mList = getList();
        mAdapter = new StringRecyclerAdapter(mActivity, mList);

        LinearLayoutManager layoutManager = new LinearLayoutManager(mActivity);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.id_activity_recyclerview__recycler_view);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
    }

    private List<String> getList() {
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= LIMIT; i++)
            list.add("Line " + i);
        return list;
    }

    public void onItemClick(int position) {
        Toast.makeText(mActivity, "Position is " + position, Toast.LENGTH_SHORT).show();
    }
}