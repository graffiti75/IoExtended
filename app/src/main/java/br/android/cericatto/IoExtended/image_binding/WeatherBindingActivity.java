package br.android.cericatto.IoExtended.image_binding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;

import java.util.ArrayList;
import java.util.List;

import br.android.cericatto.IoExtended.R;
import br.android.cericatto.IoExtended.databinding.ActivityWeatherBindingBinding;

/**
 * WeatherBindingActivity.java.
 *
 * @author Rodrigo Cericatto
 * @since May 11, 2017
 */
public class WeatherBindingActivity extends AppCompatActivity {
    // Context.
    private WeatherBindingActivity mActivity = WeatherBindingActivity.this;

    // Adapter.
    private List<Weather> mList = new ArrayList<>();
    private WeatherBindingAdapter mAdapter;

    // Binding.
    private ActivityWeatherBindingBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(mActivity, R.layout.activity_weather_binding);
        setAdapter();
    }

    public void setAdapter() {
        mList = getList();
        mAdapter = new WeatherBindingAdapter(mList);

        LinearLayoutManager layoutManager = new LinearLayoutManager(mActivity);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mBinding.idActivityImageBindingRecyclerView.setLayoutManager(layoutManager);
        mBinding.idActivityImageBindingRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mBinding.idActivityImageBindingRecyclerView.setAdapter(mAdapter);
    }

    private List<Weather> getList() {
        List<Weather> list = new ArrayList<>();
        for (int i = 0; i < WeatherData.CITY_NAME.length; i++) {
            Weather item = new Weather(WeatherData.CITY_NAME[i], WeatherData.URL[i], WeatherData.TEMPERATURE[i]);
            list.add(item);
        }

        return list;
    }
}