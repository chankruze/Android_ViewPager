package in.geekofia.viewpager.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import in.geekofia.viewpager.R;

/**
 * Fragment that displays "Tuesday".
 */
public class TuesdayFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_tuesday, container, false);
    }
}
