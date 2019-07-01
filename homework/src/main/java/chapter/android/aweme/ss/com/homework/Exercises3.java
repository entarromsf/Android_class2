package chapter.android.aweme.ss.com.homework;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import chapter.android.aweme.ss.com.homework.model.PullParser;

/**
 * 大作业:实现一个抖音消息页面,所需资源已放在res下面
 */
public class Exercises3 extends AppCompatActivity implements View.OnClickListener{

    private ListView listView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);

        findViewById(R.id.btn_1).setOnClickListener(this);
        findViewById(R.id.btn_2).setOnClickListener(this);
        findViewById(R.id.btn_3).setOnClickListener(this);

        listView = findViewById(R.id.rv_list);
        try {
            MyAdapter adapter = new MyAdapter(this,R.layout.im_list_item, PullParser.getMessage(this));
            listView.setAdapter(adapter);
        } catch (Exception e) {
            e.printStackTrace();
        }

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(Exercises3.this,"点击了第："+position,Toast.LENGTH_LONG).show();
                Intent intent = new Intent(Exercises3.this, Listdy.class);
                intent.putExtra("data", "点击了第："+position+"个item");
                startActivity(intent);
            }
        });


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_1:
                Intent intent1 = new Intent(Exercises3.this, topb.class);
                intent1.putExtra("data", "A");
                startActivity(intent1);
                break;
            case R.id.btn_2:
                Intent intent2 = new Intent(Exercises3.this, topb.class);
                intent2.putExtra("data", "B");
                startActivity(intent2);
                break;
            case R.id.btn_3:
                Intent intent3 = new Intent(Exercises3.this, topb.class);
                intent3.putExtra("data", "C");
                startActivity(intent3);
                break;
            case R.id.btn_4:
                Intent intent4 = new Intent(Exercises3.this, topb.class);
                intent4.putExtra("data", "D");
                startActivity(intent4);
                break;
        }
    }
}
