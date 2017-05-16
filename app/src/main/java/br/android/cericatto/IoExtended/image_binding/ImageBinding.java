package br.android.cericatto.IoExtended.image_binding;

import android.databinding.BindingAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import br.android.cericatto.IoExtended.R;

/**
 * ImageBinding.java.
 *
 * @author Rodrigo Cericatto
 * @since May 15, 2017
 */
public class ImageBinding {
    @BindingAdapter({"android:src"})
    public static void setImage(ImageView imageView, String url) {
        Glide.with(imageView.getContext())
            .load(url)
            .centerCrop()
            .placeholder(R.drawable.placeholder)
            .crossFade()
            .into(imageView);
    }

    @BindingAdapter({"android:background"})
    public static void setBackground(FrameLayout layout, Weather weather) {
        int drawableId;
        int temperature = weather.getTemperature();
        if (temperature <= 0) {
            drawableId = R.drawable.background_gray;
        } else if (temperature > 0 && temperature <= 15) {
            drawableId = R.drawable.background_blue;
        } else if (temperature > 15 && temperature <= 30) {
            drawableId = R.drawable.background_yellow;
        } else {
            drawableId = R.drawable.background_red;
        }
        layout.setBackgroundResource(drawableId);
    }
}