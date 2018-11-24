package android.practices.listviewexample.Adapter;

import android.content.Context;
import android.practices.listviewexample.Model.ListViewDataModel;
import android.practices.listviewexample.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Amit on 04-Apr-18.
 */

/**
 * Adapter class to Hold and Load data into the view at runtime in listview.
 */
public class ListViewAdapter extends BaseAdapter {

    Context context;
    private ArrayList datalist = new ArrayList();

    public ListViewAdapter(ArrayList datalist, Context context) {
        this.datalist = datalist;
        this.context = context;
    }

    @Override
    public int getCount() {
        return datalist.size();
    }

    @Override
    public ListViewDataModel getItem(int position) {
        return (ListViewDataModel) datalist.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder myviewholder;

        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.listitems, null);
            myviewholder = new ViewHolder(convertView);
            convertView.setTag(myviewholder);
        } else {
            myviewholder = (ViewHolder) convertView.getTag();
        }

        ListViewDataModel listdata = getItem(position);

        myviewholder.title.setText(listdata.getTitle());
        myviewholder.desc.setText(listdata.getDescription());
        myviewholder.img.setImageResource(listdata.getResid());

        return convertView;
    }

    private class ViewHolder {
        TextView title;
        TextView desc;
        ImageView img;

        public ViewHolder(View item) {
            title = item.findViewById(R.id.tvTitle);
            desc = item.findViewById(R.id.tvDesc);
            img = item.findViewById(R.id.ivIcon);
        }
    }

}
