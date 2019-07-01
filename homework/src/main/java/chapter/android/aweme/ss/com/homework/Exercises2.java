package chapter.android.aweme.ss.com.homework;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * 作业2：一个抖音笔试题：统计页面所有view的个数
 * Tips：ViewGroup有两个API
 * {@link android.view.ViewGroup #getChildAt(int) #getChildCount()}
 * 用一个TextView展示出来
 */
public class Exercises2 extends AppCompatActivity {

    private TextView CountDisplay;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_getcount);
        CountDisplay = findViewById(R.id.tv_Viewcount);
        CountDisplay.setText(String.valueOf(getViewCount(findViewById(R.id.countnum))));
        //layoutinflate
    }

    public static int getViewCount(View view) {
        //todo 补全你的代码
        int Count = 0;
        if(view == null){
            return 0;
        }
        if(view instanceof ViewGroup){
            Count++;
            for(int i = 0;i < ((ViewGroup)view).getChildCount(); i++){
                View temp = ((ViewGroup)view).getChildAt(i);
                if(temp instanceof ViewGroup){
                    Count += getViewCount(temp);
                    Log.d("rasalghul", temp.toString()+"");
                }
                else{
                    Count++;
                    Log.d("rasalghul", temp.toString()+"");
                }
            }
        }
        return Count;
    }
}
