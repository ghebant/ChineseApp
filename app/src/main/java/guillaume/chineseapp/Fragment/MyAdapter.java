package guillaume.chineseapp.Fragment;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import guillaume.chineseapp.R;
import guillaume.chineseapp.Word;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    public List<Word> home_list;

    public MyAdapter(List<Word> list) {
        this.home_list = list;
    }

    @NonNull
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.ViewHolder holder, int position) {
        String desc = home_list.get(position).getSymbol();

        holder.word.setText(desc);
    }

    @Override
    public int getItemCount() {
        return home_list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private View mView;
        private TextView word;

        public ViewHolder(View itemView) {
            super(itemView);
            mView = itemView;
            word = mView.findViewById(R.id.item);
        }
    }
}