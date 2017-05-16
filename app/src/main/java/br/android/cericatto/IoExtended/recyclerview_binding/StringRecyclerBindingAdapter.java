package br.android.cericatto.IoExtended.recyclerview_binding;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import br.android.cericatto.IoExtended.R;
import br.android.cericatto.IoExtended.databinding.StringRecyclerAdapterWithBinding;

/**
 * StringRecyclerBindingAdapter.java.
 * 
 * @author Rodrigo Cericatto
 * @since May 11, 2017
 */
public class StringRecyclerBindingAdapter extends RecyclerView.Adapter<StringRecyclerBindingAdapter.StringRecyclerAdapterViewHolder> {

	//--------------------------------------------------
	// Attributes
	//--------------------------------------------------

	private RecyclerViewBindingActivity mActivity;
	private List<String> mItems;

	//--------------------------------------------------
	// Constructor
	//--------------------------------------------------

	public StringRecyclerBindingAdapter(RecyclerViewBindingActivity context, List<String> items) {
		mActivity = context;
		mItems = items;
	}

	//--------------------------------------------------
	// Adapter Methods
	//--------------------------------------------------

	@Override
	public StringRecyclerAdapterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
		StringRecyclerAdapterWithBinding binding = DataBindingUtil.inflate(
			LayoutInflater.from(parent.getContext()), R.layout.string_recycler_adapter_with, parent, false);
		return new StringRecyclerAdapterViewHolder(binding.getRoot());
	}

	@Override
	public void onBindViewHolder(StringRecyclerAdapterViewHolder holder, final int position) {
		String item = mItems.get(position);
		holder.binding.setData(item);
		holder.binding.idStringRecyclerAdapterWithTextView.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				mActivity.onItemClick(position + 1);
			}
		});
	}

	@Override
	public int getItemCount() {
		if (mItems != null && mItems.size() > 0) {
			return mItems.size();
		}
		return 0;
	}

	//--------------------------------------------------
	// View Holder
	//--------------------------------------------------

	public class StringRecyclerAdapterViewHolder extends RecyclerView.ViewHolder {
		StringRecyclerAdapterWithBinding binding;

		public StringRecyclerAdapterViewHolder(View rootView) {
			super(rootView);
			binding = DataBindingUtil.bind(rootView);
		}
	}
}