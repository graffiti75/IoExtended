package br.android.cericatto.IoExtended.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import br.android.cericatto.IoExtended.R;

/**
 * StringRecyclerAdapter.java.
 * 
 * @author Rodrigo Cericatto
 * @since May 11, 2017
 */
public class StringRecyclerAdapter extends RecyclerView.Adapter<StringRecyclerAdapter.ViewHolder> {

	//--------------------------------------------------
	// Attributes
	//--------------------------------------------------

	private RecyclerViewActivity mActivity;
	private List<String> mItems;

	//--------------------------------------------------
	// Constructor
	//--------------------------------------------------

	public StringRecyclerAdapter(RecyclerViewActivity context, List<String> items) {
		mActivity = context;
		mItems = items;
	}

	//--------------------------------------------------
	// Adapter Methods
	//--------------------------------------------------

	@Override
	public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
		View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.string_recycler_adapter, parent, false);
		return new ViewHolder(view);
	}

	@Override
	public void onBindViewHolder(final ViewHolder holder, final int position) {
		String item = mItems.get(position);
		holder.textView.setText(item);
		holder.textView.setOnClickListener(onClickListener(position));
	}

	@Override
	public int getItemCount() {
		if (mItems != null && mItems.size() > 0) {
			return mItems.size();
		}
		return 0;
	}

	//--------------------------------------------------
	// Methods
	//--------------------------------------------------

	private View.OnClickListener onClickListener(final int position) {
		return new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				mActivity.onItemClick(position + 1);
			}
		};
	}

	//--------------------------------------------------
	// View Holder
	//--------------------------------------------------

	public class ViewHolder extends RecyclerView.ViewHolder {
		public TextView textView;

		public ViewHolder(View view) {
			super(view);
			textView = (TextView) view.findViewById(R.id.id_string_recycler_adapter__text_view);
		}
	}
}