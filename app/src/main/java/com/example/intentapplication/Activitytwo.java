package com.example.intentapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Activitytwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitytwo);
        Bundle firstdata=getIntent().getExtras();
        if (firstdata==null)
            return;
        String msg=firstdata.getString("firstmsg");
        final TextView t=(TextView)findViewById(R.id.text2);
        t.setText(msg);
    }
}
