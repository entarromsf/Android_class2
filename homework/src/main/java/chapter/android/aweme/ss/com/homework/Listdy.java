package chapter.android.aweme.ss.com.homework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Listdy extends AppCompatActivity {

    private TextView tips;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chatroom);
        tips = findViewById(R.id.tv_with_name);
        String data = getIntent().getStringExtra("data");
        tips.setText(data);
    }
}
