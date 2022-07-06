package kr.co.so.softcapus.tt3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btn;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button)findViewById(R.id.btn1);
        btn.setOnClickListener(this::lisBtn);
        editText = (EditText)findViewById(R.id.edit);

    }


    private void lisBtn(View view){
        Intent intent = new Intent(MainActivity.this,seconde.class);
        intent.putExtra("edit",editText.getText().toString());
        startActivity(intent);
        Log.d("test","MainActivity 실행");
    }


}