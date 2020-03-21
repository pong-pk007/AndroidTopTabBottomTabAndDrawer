package itsisaket.csit.pong.facevision.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.zip.Inflater;

import itsisaket.csit.pong.facevision.R;

public class PeopleFragment extends Fragment {

    private static PeopleFragment INSTANCE= null;


    public PeopleFragment () {

    }

    public static PeopleFragment getInstance() {
        if(INSTANCE == null)
            INSTANCE = new PeopleFragment();
        return INSTANCE;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_people_list, container, false);

        //initialize another view


        return view;
    }
}
