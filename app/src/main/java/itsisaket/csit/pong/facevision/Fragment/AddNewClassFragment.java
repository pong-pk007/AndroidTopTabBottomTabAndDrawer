package itsisaket.csit.pong.facevision.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import itsisaket.csit.pong.facevision.R;

public class AddNewClassFragment extends Fragment {

    private static AddNewClassFragment INSTANCE= null;


    public AddNewClassFragment () {

    }

    public static AddNewClassFragment getInstance() {
        if(INSTANCE == null)
            INSTANCE = new AddNewClassFragment();
        return INSTANCE;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_add_people, container, false);

        //initialize another view


        return view;

    }
}
