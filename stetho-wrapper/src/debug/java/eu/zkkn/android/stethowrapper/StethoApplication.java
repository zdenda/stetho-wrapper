package eu.zkkn.android.stethowrapper;

import android.app.Application;
import android.widget.Toast;

import com.facebook.stetho.Stetho;


public class StethoApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        initializeStetho();
    }

    protected void initializeStetho() {
        Toast.makeText(this, "Initialize Stetho", Toast.LENGTH_LONG).show();
        Stetho.initializeWithDefaults(this);
    }

}
