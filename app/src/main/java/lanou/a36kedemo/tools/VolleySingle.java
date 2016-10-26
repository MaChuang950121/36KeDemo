package lanou.a36kedemo.tools;

import android.widget.ImageView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.Volley;

import lanou.a36kedemo.R;

/**
 * Created by dllo on 16/10/25.
 */
public class VolleySingle {
    private static VolleySingle volleySingle;
    private RequestQueue requestQueue;

    private VolleySingle(){

        requestQueue = Volley.newRequestQueue(MyApp.getContext());
    }
    public static VolleySingle getVolleySingle() {
        if (volleySingle == null) {
            synchronized (VolleySingle.class) {
                if (volleySingle == null) {
                    volleySingle = new VolleySingle();
                }

            }
        }
        return volleySingle;
    }

    public <T> void addRequest(Request<T> request){
        requestQueue.add(request);
    }
}
