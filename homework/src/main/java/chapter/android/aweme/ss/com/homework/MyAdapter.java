package chapter.android.aweme.ss.com.homework;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import chapter.android.aweme.ss.com.homework.model.Message;

public class MyAdapter extends ArrayAdapter<Message> {
    private int resourceId;
    private List<Message> messages;

    public MyAdapter(Context context, int textViewResourceId, List<Message> messages){
        super(context,textViewResourceId,messages);
        resourceId = textViewResourceId;
        this.messages = messages;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Message msg = getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(resourceId, null);
        TextView title = (TextView) view.findViewById(R.id.tv_title);
        TextView description = (TextView) view.findViewById(R.id.tv_description);
        TextView time = (TextView) view.findViewById(R.id.tv_time);
        ImageView official = (ImageView) view.findViewById(R.id.robot_notice);

        title.setText(messages.get(position).getTitle());
        description.setText(messages.get(position).getDescription());
        time.setText(messages.get(position).getTime());
        boolean isvisable = messages.get(position).isOfficial();
        if(isvisable){
            official.setVisibility(view.VISIBLE);
        }
        else{
            official.setVisibility(view.INVISIBLE);
        }

        return view;
    }
}
