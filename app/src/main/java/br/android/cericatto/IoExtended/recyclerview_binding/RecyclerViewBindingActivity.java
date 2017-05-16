package br.android.cericatto.IoExtended.recyclerview_binding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import br.android.cericatto.IoExtended.R;
import br.android.cericatto.IoExtended.databinding.ActivityRecyclerviewWithBinding;

/**
 * RecyclerViewBindingActivity.java.
 *
 * @author Rodrigo Cericatto
 * @since May 11, 2017
 */
public class RecyclerViewBindingActivity extends AppCompatActivity {
    private static final int LIMIT = 15;

    // Context.
    private RecyclerViewBindingActivity mActivity = RecyclerViewBindingActivity.this;

    // Adapter.
    private List<String> mList = new ArrayList<>();
    private StringRecyclerBindingAdapter mAdapter;

    // Binding.
    private ActivityRecyclerviewWithBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(mActivity, R.layout.activity_recyclerview_with);
        setAdapter();
    }

    public void setAdapter() {
        mList = getList();
        mAdapter = new StringRecyclerBindingAdapter(mActivity, mList);

        LinearLayoutManager layoutManager = new LinearLayoutManager(mActivity);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mBinding.idActivityRecyclerviewWithRecyclerView.setLayoutManager(layoutManager);
        mBinding.idActivityRecyclerviewWithRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mBinding.idActivityRecyclerviewWithRecyclerView.setAdapter(mAdapter);
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