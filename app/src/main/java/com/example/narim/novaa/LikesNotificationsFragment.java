package com.example.narim.novaa;


import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class LikesNotificationsFragment extends android.support.v4.app.Fragment {

    View view;
    RecyclerView LikesNotifications_recylerview;
    Context context;
    List<LikesNotificationsItem> Likes=new ArrayList<>();

    public LikesNotificationsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        context=getActivity();
        view= inflater.inflate(R.layout.fragment_likes_notifications, container, false);
        String LikerName[]={"Dina Walid","Menna Walid", "Arwa Walid","Ziad Walid"};
        String LikedTweets[] = {" heyy dude", " Ana mennaa " , " Ana arwa ezayak " , " Ana akhohom"};
        for(int i=0; i<LikerName.length; i++)
        {
            LikesNotificationsItem Like =new LikesNotificationsItem(LikerName[i],LikedTweets[i]);
            Likes.add(Like);
        }
        LikesNotifications_recylerview=view.findViewById(R.id.LikesNotifications_RecyclerView);
        LikesNotifications_recylerview.setLayoutManager(new LinearLayoutManager(context));
        LikesNotificationsAdapter likes_adapter=new LikesNotificationsAdapter(Likes);
        LikesNotifications_recylerview.setAdapter(likes_adapter);
        return view;

    }

}
