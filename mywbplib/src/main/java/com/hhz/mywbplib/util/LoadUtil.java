package com.hhz.mywbplib.util;

import android.content.Context;

import com.facebook.common.logging.FLog;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.imagepipeline.core.ImagePipelineConfig;
import com.facebook.imagepipeline.listener.RequestListener;
import com.facebook.imagepipeline.listener.RequestLoggingListener;

import java.util.HashSet;
import java.util.Set;

public class LoadUtil {

    public static LoadUtil instance;

    public static LoadUtil getInstance() {
        if (instance ==null){
            instance = new LoadUtil();}
        return instance;
    }

    public void init(Context context){


        Fresco.initialize(context);

//        FLog.setMinimumLoggingLevel(FLog.VERBOSE);
//        Set<RequestListener> listeners = new HashSet<>();
//        listeners.add(new RequestLoggingListener());
//        ImagePipelineConfig config =
//                ImagePipelineConfig.newBuilder(context).setRequestListeners(listeners).build();
//        Fresco.initialize(context, config);


    }

}
