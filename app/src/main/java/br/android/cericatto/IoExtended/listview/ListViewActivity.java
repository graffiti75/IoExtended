package br.android.cericatto.IoExtended.listview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import br.android.cericatto.IoExtended.R;

/**
 * ListViewActivity.java.
 *
 * @author Rodrigo Cericatto
 * @since May 8, 2017
 */
public class ListViewActivity extends AppCompatActivity {

    private static final int LIMIT = 15;

    // Context.
    private ListViewActivity mActivity = ListViewActivity.this;

    // Adapter.
    private List<String> mList = new ArrayList<>();
    private StringAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        setAdapter();
    }

    public void setAdapter() {
        mList = getList();
        mAdapter = new StringAdapter(mActivity, mList);
        ListView listView = (ListView)findViewById(R.id.id_activity_listview__list_view);
        listView.setAdapter(mAdapter);
    }

    private List<String> getList() {
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= LIMIT; i++)
            list.add("Line " + i);
        return list;
    }
}