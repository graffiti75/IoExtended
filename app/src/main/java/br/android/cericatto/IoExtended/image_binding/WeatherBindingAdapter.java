package br.android.cericatto.IoExtended.image_binding;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import br.android.cericatto.IoExtended.R;
import br.android.cericatto.IoExtended.databinding.WeatherAdapterBinding;

/**
 * WeatherBindingAdapter.java.
 * 
 * @author Rodrigo Cericatto
 * @since May 11, 2017
 */
public class WeatherBindingAdapter extends RecyclerView.Adapter<WeatherBindingAdapter.WeatherBindingAdapterViewHolder> {
	private List<Weather> mItems;

	public WeatherBindingAdapter(List<Weather> items) {
		mItems = items;
	}

	@Override
	public WeatherBindingAdapterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
		WeatherAdapterBinding binding = DataBindingUtil.inflate(
			LayoutInflater.from(parent.getContext()), R.layout.weather_adapter, parent, false);
		return new WeatherBindingAdapterViewHolder(binding.getRoot());
	}

	@Override
	public void onBindViewHolder(WeatherBindingAdapterViewHolder holder, final int position) {
		Weather item = mItems.get(position);
		holder.binding.setWeather(item);
	}

	@Override
	public int getItemCount() {
		if (mItems != null && mItems.size() > 0) {
			return mItems.size();
		}
		return 0;
	}

	public class WeatherBindingAdapterViewHolder extends RecyclerView.ViewHolder {
		WeatherAdapterBinding binding;

		public WeatherBindingAdapterViewHolder(View rootView) {
			super(rootView);
			binding = DataBindingUtil.bind(rootView);
		}
	}
}