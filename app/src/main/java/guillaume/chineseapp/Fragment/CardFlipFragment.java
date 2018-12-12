package guillaume.chineseapp.Fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import com.wajahatkarim3.easyflipview.EasyFlipView;

import guillaume.chineseapp.R;

public class CardFlipFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_card_flip, null);

        initButtons(view);

        return view;
    }

    public void initButtons(View view) {
        ImageButton positiveButton = view.findViewById(R.id.positiveButtonCardView);
        ImageButton negativeButton = view.findViewById(R.id.negativeButtonCardView);
        ImageButton switchButton = view.findViewById(R.id.switchButtonCardView);
        final EasyFlipView flipView = view.findViewById(R.id.flipView);

        switchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flipView.flipTheView();
            }
        });
    }
}
