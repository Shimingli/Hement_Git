package com.shiming.hement.ui.life_cycle_demo;

import android.annotation.SuppressLint;
import android.arch.lifecycle.LifecycleObserver;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;

import com.shiming.hement.R;
import com.shiming.hement.lifecycle.SyncResponseEventType;
import com.shiming.hement.lifecycle.SyncRxBus;
import com.shiming.hement.ui.base.BaseActivity;
import com.shiming.hement.utils.Events;

import timber.log.Timber;

/**
 * <p>
 *
 * </p>
 *
 * @author shiming
 * @version v1.0
 * @since 2019/1/18 10:18
 */

public class NewExtendEventsActivity extends BaseActivity   {

    private TextView mDes;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extend_rx_bus_layout);


        findViewById(R.id.btn_mock_send_s_onclick).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ExtendSyncRxBus.getInstance().post(new ExtendEvents<String>(100, "我是NewExtendEventsActivity中发出100的事件"));
            }
        });
        findViewById(R.id.btn_mock_send_f_onclick).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ExtendSyncRxBus.getInstance().post(new ExtendEvents<String>(101, "我是NewExtendEventsActivity中发出101的事件"));
            }
        });
        mDes = findViewById(R.id.tv_s_des);
        getLifecycle().addObserver(new HandleEventObserver(){
            @SuppressLint("SetTextI18n")
            @Override
            protected void handlerEvents(ExtendEvents extendEvents){
                int code = extendEvents.getCode();
                mDes.setText(code+(String)extendEvents.getContent());
                Timber.tag(getClassName()).w((String)extendEvents.getContent());
            }
        });
    }

}
