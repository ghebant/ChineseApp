package guillaume.chineseapp.Fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import guillaume.chineseapp.R;
import guillaume.chineseapp.Word;

public class ListFragment extends Fragment {

    private RecyclerView recyclerView = null;
    private List<Word> list = null;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list, container, false);

        recyclerView = (RecyclerView) view.findViewById(R.id.my_recycler_view);

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        list = new ArrayList<>();
        list.add(new Word("test","test", "test"));
        //rv_list.add(new HomeItem("Dashboard", R.drawable.ic_dashboard));

        MyAdapter mAdapter = new MyAdapter(list);

        recyclerView.setAdapter(mAdapter);

        recyclerView.setItemAnimator(new DefaultItemAnimator());

        return inflater.inflate(R.layout.fragment_list, null);
    }
}
