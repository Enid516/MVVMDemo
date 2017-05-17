package com.example.mvvmdemo;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * Created by Enid on 2017/5/11.
 */

public class ImageUtil {
    /**
     * @param imageView 用于显示图片的控件需要放在第一个参数的位置
     * @param url       url 图片Url
     * image 作为自定义的参数，可在ImageView控件中的使用
     */
    @BindingAdapter({"image"})
    public static void loadImage(ImageView imageView, String url) {
        Glide.with(imageView.getContext())
                .load(url)
                .into(imageView);
    }
}