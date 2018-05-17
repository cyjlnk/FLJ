package com.diabin.festec.example;

import android.app.Application;

import com.diabin.festec.example.event.TestEvent;
import com.diabin.latte.app.Latte;
import com.diabin.latte.ec.database.DatabaseManager;
import com.diabin.latte.ec.icon.FontEcModule;
import com.diabin.latte.net.interceptors.DebugInterceptor;
import com.joanzapata.iconify.fonts.FontAwesomeModule;

/**
 * Created by fei on 2017/7/30.
 */

public class ExampleApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Latte.init(this)
                .withIcon(new FontAwesomeModule())
                .withIcon(new FontEcModule())
                .withLoaderDelayed(1000)
                .withApiHost("http://discuz.lnkjdx.com/api/")
                .withJavascriptInterface("latte")
                //添加Cookie同步拦截器
                .withWebHost("http:/phpcms.lnkjdx.com/cyj/")
                .withWebEvent("test",new TestEvent())
                .withInterceptor(new DebugInterceptor("test",R.raw.test))
                .configure();

        // 测试数据库 initStetho();
        DatabaseManager.getInstance().init(this);
    }
//测试数据库
//    private void initStetho(){
//        Stetho.initialize(
//                Stetho.newInitializerBuilder(this)
//                .enableDumpapp(Stetho.defaultDumperPluginsProvider(this))
//                .enableWebKitInspector(Stetho.defaultInspectorModulesProvider(this))
//                .build()
//        );
//    }
}
