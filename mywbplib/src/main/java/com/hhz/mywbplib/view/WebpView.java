package com.hhz.mywbplib.view;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.controller.AbstractDraweeController;
import com.facebook.drawee.controller.BaseControllerListener;
import com.facebook.drawee.controller.ControllerListener;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.image.ImageInfo;
import com.hhz.mywbplib.R;
import com.jameni.allutillib.common.PrintUtil;

public class WebpView extends LinearLayout implements View.OnClickListener {
    public Context context;

    public WebpView(Context context) {
        super(context);
        initView(context);
    }

    public WebpView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initView(context);
    }

    public WebpView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context);
    }

    private SimpleDraweeView img;
    private Button btnPlay;

    public void initView(Context context) {
        this.context = context;

        View content = LayoutInflater.from(context).inflate(R.layout.view_webp, null);

        img = content.findViewById(R.id.iv_move_simpleDraweeView);
        btnPlay = content.findViewById(R.id.btn_load_move);
        btnPlay.setOnClickListener(this);


        addView(content);

    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.btn_load_move) {

            String strUri = "res://" + context.getPackageName() + "/" + R.drawable.taogaoqin;

            PrintUtil.printMsg("资源地址： " + strUri);
            AbstractDraweeController build = Fresco.newDraweeControllerBuilder()
                    .setUri(Uri.parse(strUri))
                    .setControllerListener(controllerListener)
                    .build();
            img.setController(build);
        }

    }


    private ControllerListener controllerListener = new BaseControllerListener<ImageInfo>() {
        @Override
        public void onFinalImageSet(
                String id,
                @Nullable ImageInfo imageInfo,
                @Nullable Animatable anim) {
            if (anim != null) {
                // app-specific logic to enable animation starting
                anim.start();
            }
        }
    };
}
