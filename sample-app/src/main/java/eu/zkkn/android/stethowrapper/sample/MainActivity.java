package eu.zkkn.android.stethowrapper.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import eu.zkkn.android.stethowrapper.BuildConfig;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.tv_text);
        textView.setText(BuildConfig.VERSION_NAME);
    }
}
