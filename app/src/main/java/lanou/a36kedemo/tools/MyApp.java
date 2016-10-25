package lanou.a36kedemo.tools;

import android.app.Application;
import android.content.Context;

/**
 * Created by dllo on 16/10/25.
 */
public class MyApp extends Application{
    private static Context mcontext;
    @Override
    public void onCreate() {
        super.onCreate();
        mcontext = this;
    }
    public static Context getContext(){return mcontext;}
}
