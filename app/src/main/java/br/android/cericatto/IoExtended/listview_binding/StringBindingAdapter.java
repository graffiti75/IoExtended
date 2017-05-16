package br.android.cericatto.IoExtended.listview_binding;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

import br.android.cericatto.IoExtended.R;
import br.android.cericatto.IoExtended.databinding.ActivityListviewWithBinding;
import br.android.cericatto.IoExtended.databinding.StringAdapterWithBinding;

/**
 * StringBindingAdapter.java.
 *
 * @author Rodrigo Cericatto
 * @since May 8, 2017
 */
public class StringBindingAdapter extends BaseAdapter {
    private Activity mActivity;
    private List<String> mList;

    public StringBindingAdapter(Activity activity, List<String> list) {
        mActivity = activity;
        mList = list;
    }

    public int getCount() {
        return mList.size();
    }

    public String getItem(int position) {
        return mList.get(position);
    }

    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        String data = getItem(position);
        StringAdapterWithBinding binding;
        if (convertView == null) {
            binding = DataBindingUtil.inflate(LayoutInflater.from(mActivity), R.layout.string_adapter_with, parent, false);
        } else {
            binding = DataBindingUtil.bind(convertView);
        }
        binding.setData(data);
        return binding.getRoot();
    }
}