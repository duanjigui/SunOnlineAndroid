package com.sunonline.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sunonline.adpter.VideoBeanAdapter;
import com.sunonline.application.R;
import com.sunonline.util.JsonParserUtil;
import com.sunonline.util.PaserVideoJson;

/**
 * Created by duanjigui on 2016/7/19.
 */
public class OlddriverFragment extends Fragment {
    private RecyclerView old_Driver_list;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.olddriver_page,null,false);
        old_Driver_list= (RecyclerView) view.findViewById(R.id.old_Driver_list);
        String oldDriver_url="http://139.129.221.162/webapi/videos/olddriver/all";
        JsonParserUtil jsonParserUtil=new JsonParserUtil(getActivity());
        jsonParserUtil.setPaserJson(new PaserVideoJson(getActivity()));
        jsonParserUtil.paser(oldDriver_url,old_Driver_list,new VideoBeanAdapter(getActivity()));

        return view;
    }
}