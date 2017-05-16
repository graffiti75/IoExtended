package br.android.cericatto.IoExtended.listview;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import br.android.cericatto.IoExtended.R;

/**
 * StringAdapter.java.
 * 
 * @author Rodrigo Cericatto
 * @since May 8, 2017
 */
public class StringAdapter extends BaseAdapter {

	//--------------------------------------------------
	// Attributes
	//--------------------------------------------------

	private Activity mActivity;
	private List<String> mList;

	//--------------------------------------------------
	// Constructor
	//--------------------------------------------------

	public StringAdapter(Activity activity, List<String> data) {
		mActivity = activity;
		mList = data;
	}

	//--------------------------------------------------
	// View Holder
	//--------------------------------------------------

	public class ViewHolder {
		private TextView textView;
	}

	//--------------------------------------------------
	// Adapter Methods
	//--------------------------------------------------

	@Override
	public int getCount() {
		return mList.size();
	}

	@Override
	public String getItem(int position) {
		return mList.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		String city = getItem(position);
		ViewHolder holder = new ViewHolder();

		if (convertView == null) {
			// Inflates the layout of the adapter.
			LayoutInflater inflater = (LayoutInflater)mActivity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			convertView = inflater.inflate(R.layout.string_adapter, parent, false);

			// Initializes the ViewHolder and sets the View tag.
			holder.textView = (TextView) convertView.findViewById(R.id.id_string_adapter__text_view);
			convertView.setTag(holder);
		} else {
			holder = (ViewHolder)convertView.getTag();
		}
		setData(holder, city);

		return convertView;
	}

	//--------------------------------------------------
	// Methods
	//--------------------------------------------------

	public void setData(ViewHolder holder, String city) {
		holder.textView.setText(city);
	}
}