//package com.shiming.hement.ui
//
//import android.annotation.SuppressLint
//import android.content.Intent
//import android.os.Bundle
//import android.view.View
//import android.widget.TextView
//import com.orhanobut.logger.Logger
//import com.shiming.hement.R
//import com.shiming.hement.ui.base.BaseActivity
//import com.shiming.hement.ui.db.DBNetWorkDemoActivity
//import com.shiming.hement.ui.fragmentdemo.FragmentDemoActivity
//import com.shiming.hement.ui.iamgeloader.ImageLoaderActivity
//import com.shiming.hement.ui.life_cycle_demo.*
//import com.shiming.hement.ui.network.NetWorkActivity
//import com.shiming.hement.ui.log.LogDemoActivity
//import com.shiming.hement.ui.network.NewNetWorkActivity
//import com.shiming.hement.ui.permission.RxPermissionsActivity
//import com.shiming.hement.ui.rxbusdemo.RxEventBusActivity
//import com.shiming.hement.ui.sp.SPreferencesActivity
//import com.shiming.hement.ui.timber.TimberDemoActivity
//import com.trello.rxlifecycle3.android.ActivityEvent
//import io.reactivex.android.schedulers.AndroidSchedulers
//import io.reactivex.functions.Consumer
//import io.reactivex.schedulers.Schedulers
//import timber.log.Timber
//
//
//public class MainActivity : BaseActivity() {
//    /**
//     * cannot be provided without an @Inject constructor or from an @Provides-annotated method.
//     * 在kotlin中使用还有问题
//     */
////    @field:Named
////     var mDataManager: DataManager? = null
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        activityComponent().inject(this)
//        setContentView(R.layout.activity_main)
//        findViewById<View>(R.id.btn_net_work).setOnClickListener {
//            startActivity(Intent(this, NetWorkActivity::class.java))
//        }
//        findViewById<View>(R.id.btn_sp_demo).setOnClickListener {
//            startActivity(Intent(this, SPreferencesActivity::class.java))
//        }
//        findViewById<View>(R.id.btn_db_demo).setOnClickListener {
//            startActivity(Intent(this, DBNetWorkDemoActivity::class.java))
//        }
//        findViewById<View>(R.id.btn_rx_bus_demo).setOnClickListener {
//            startActivity(Intent(this, RxEventBusActivity::class.java))
//        }
//        findViewById<View>(R.id.btn_rx_permission).setOnClickListener {
//            startActivity(Intent(this, RxPermissionsActivity::class.java))
//        }
//        findViewById<View>(R.id.btn_imageloader).setOnClickListener {
//            startActivity(Intent(this, ImageLoaderActivity::class.java))
//        }
//
//        findViewById<View>(R.id.btn_fragment).setOnClickListener {
//            startActivity(Intent(this, FragmentDemoActivity::class.java))
//            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_still)
//        }
//        findViewById<View>(R.id.btn_log).setOnClickListener {
//            startActivity(Intent(this, TimberDemoActivity::class.java))
//            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_still)
//        }
//        //新的RxBus的使用实例
//        findViewById<View>(R.id.btn_new_rxbus).setOnClickListener {
//            startActivity(Intent(this, NewRxBusDemoActivity::class.java))
//            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_still)
//        }
//        findViewById<View>(R.id.btn_new_net_work).setOnClickListener {
//            startActivity(Intent(this, NewNetWorkActivity::class.java))
//            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_still)
//        }
//        //Logger.d("MainActivity")
//        // 新的log的Demo
//        findViewById<View>(R.id.btn_new_log).setOnClickListener {
//            startActivity(Intent(this, LogDemoActivity::class.java))
//            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_still)
//        }
//
//        findViewById<View>(R.id.btn_new_extend_events).setOnClickListener {
//            startActivity(Intent(this, NewExtendEventsActivity::class.java))
//            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_still)
//        }
//
//        val scale = getResources().getDisplayMetrics().density
//        //我手机上的 density3.0
//        Logger.d("我手机上的 density" +scale)
//
////        ExtendSyncRxBus.getInstance().toObservable()
////                .subscribeOn(Schedulers.io())
////                .observeOn(AndroidSchedulers.mainThread())
////                .subscribe({ obj ->
////                    val extendEvents = obj as ExtendEvents<*>
////                    handlerEvents(extendEvents)
////                }, { })
////        ExtendSyncRxBus.getInstance().toObservable()
////                .subscribeOn(Schedulers.io())
////                .observeOn(AndroidSchedulers.mainThread())
////                .compose<ExtendEvents>(this.bindUntilEvent(ActivityEvent.DESTROY))
////                .subscribe({ extendEvents -> handlerEvents(extendEvents) }, { })
//
//    }
//
//    fun handlerEvents(extendEvents: ExtendEvents<*>) {
//        val textView = findViewById<TextView>(R.id.tv_msg_events)
//        val code = extendEvents.code
//        textView.setText(code.toString() + extendEvents.content as String)
//        Timber.tag(className).w(extendEvents.content as String)
//    }
//
//}
