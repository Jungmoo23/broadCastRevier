package kr.co.so.softcapus.tt3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class seconde extends AppCompatActivity {

    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seconde);
        t1 = (TextView)findViewById(R.id.t1);

    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d("seconde", "onResume: 1");
        Intent intent = getIntent();
        String str = intent.getStringExtra("edit");
        
        Myliserver myliserver = new Myliserver();
        myliserver.onReceive(this,intent);

    }


    class Myliserver extends BroadcastReceiver{

        @Override
        public void onReceive(Context context, Intent intent) {

            String str = intent.getStringExtra("edit");
            Log.d("Myliserver", "Myliserver: "+str);

        }
    }



}
