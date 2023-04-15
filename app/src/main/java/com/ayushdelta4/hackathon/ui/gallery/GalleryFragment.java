package com.ayushdelta4.hackathon.ui.gallery;

import android.R.layout;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.ayushdelta4.hackathon.R;
import com.ayushdelta4.hackathon.databinding.FragmentGalleryBinding;
import com.google.android.material.button.MaterialButton;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class GalleryFragment extends Fragment {

    private FragmentGalleryBinding binding;
//    ListView notifications;
//    ArrayList<String> arrNotify = new ArrayList<>();
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_gallery, container, false);

/*      notifications = notifications.findViewById(R.id.notification_header);
        arrNotify.add("Welcome");
        arrNotify.add("Read our agreements");
        arrNotify.add("Turn on notifications");
        arrNotify.add("Reach out for professional aid");
        arrNotify.add("Search medicines online");
        arrNotify.add("Ways to report emergency");
        arrNotify.add("Complete your profile");
        arrNotify.add("Try our premium add free version");

        ArrayAdapter<String> adptNotify = new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1, arrNotify);
        notifications.setAdapter(adptNotify);

 */

        return v;
    }



    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}