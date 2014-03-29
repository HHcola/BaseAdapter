package com.example.adapter;

import com.example.baseadapter.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

class ViewHolder
{
    public ImageView img;
    public TextView title;
    public TextView info;
}

public class TestBaseAdapter extends BaseAdapter{
	private LayoutInflater mInflater = null;
	private ViewHolder holder;
	
	public TestBaseAdapter(Context context) {
		this.mInflater = LayoutInflater.from(context);
	}
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
        if(convertView == null)
        {
    		holder = new ViewHolder();
            convertView = mInflater.inflate(R.layout.list_item, null);
            ImageView img = (ImageView)convertView.findViewById(R.id.img); 
            TextView title = (TextView)convertView.findViewById(R.id.tv);
            TextView info = (TextView)convertView.findViewById(R.id.info);
            img.setImageResource(R.drawable.ic_launcher);
            title.setText("Hello");
            info.setText("world");
            convertView.setTag(holder);
        }else {
            holder = (ViewHolder)convertView.getTag();
            holder.img.setImageResource(R.drawable.ic_launcher);
            holder.title.setText("Hello");
            holder.info.setText("World");
        }
        
        
        return convertView;
	}

}
