package br.android.cericatto.IoExtended.listview_binding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import br.android.cericatto.IoExtended.R;
import br.android.cericatto.IoExtended.databinding.ActivityListviewWithBinding;

/**
 * ListViewBindingActivity.java.
 *
 * @author Rodrigo Cericatto
 * @since May 8, 2017
 */
public class ListViewBindingActivity extends AppCompatActivity {
    private static final int LIMIT = 15;

    // Context.
    private ListViewBindingActivity mActivity =
    ListViewBindingActivity.this;

    // Adapter.
    private List<String> mCityList = new ArrayList<>();
    private StringBindingAdapter mAdapter;

    // Binding.
    private ActivityListviewWithBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this,
        R.layout.activity_listview_with);
        setAdapter();
    }

    public void setAdapter() {
        mCityList = getCityList();
        mAdapter = new StringBindingAdapter(mActivity, mCityList);
        mBinding.idActivityListviewBindingListView.setAdapter(mAdapter);
    }

    private List<String> getCityList() {
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= LIMIT; i++)
            list.add("Line " + i);
        return list;
    }
}