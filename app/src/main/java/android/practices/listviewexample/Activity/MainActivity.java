package android.practices.listviewexample.Activity;

import android.content.Context;
import android.os.Bundle;
import android.practices.listviewexample.Adapter.ListViewAdapter;
import android.practices.listviewexample.Model.ListViewDataModel;
import android.practices.listviewexample.R;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private final static String TAG = MainActivity.class.getSimpleName();
    Context context = MainActivity.this;
    private ListView listView;
    private ArrayList<ListViewDataModel> myList = new ArrayList<>();

    private String[] title = new String[]{
            "Title 1", "Title 2", "Title 3", "Title 4",
            "Title 5", "Title 6", "Title 7", "Title 8"
    };
    private String[] desc = new String[]{
            "Desc 1", "Desc 2", "Desc 3", "Desc 4",
            "Desc 5", "Desc 6", "Desc 7", "Desc 8"
    };
    private int[] img = new int[]{
            R.drawable.ic_launcher_background, R.drawable.ic_launcher_foreground, R.drawable.ic_launcher_background, R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_background, R.drawable.ic_launcher_foreground, R.drawable.ic_launcher_background, R.drawable.ic_launcher_foreground
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listview);
        loadListviewData();
        listView.setAdapter(new ListViewAdapter(myList, context));
    }

    /**
     * Method to do loading data into listview.
     */
    private void loadListviewData() {
        for (int i = 0; i < title.length; i++) {
            // Create a new object for each list item
            ListViewDataModel ld = new ListViewDataModel();
            ld.setTitle(title[i]);
            ld.setDescription(desc[i]);
            ld.setResid(img[i]);
            // Add this object into the ArrayList myList
            myList.add(ld);
        }
    }
}
