package com.example.dummychangoapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

class GroupAdapter extends RecyclerView.Adapter<GroupAdapter.ViewHolder> {
    private ArrayList<Groups> mGroupData;
    private Context mContext;



    public GroupAdapter(Context mContext, ArrayList<Groups> GroupData) {
        this.mGroupData = GroupData;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public GroupAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(mContext).inflate(R.layout.activity_main_item,parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull GroupAdapter.ViewHolder holder, int position) {
        // Get current group.
        Groups group = mGroupData.get(position);
        holder.groupName.setText(group.getGroupName());
        holder.groupType.setText(group.getGroupType());
        holder.members.setText(group.getMembers());
        holder.date.setText(group.getDate());

        // Populate the textviews with data.


    }

    @Override
    public int getItemCount() {
        return mGroupData.size();
    }


    class ViewHolder extends RecyclerView.ViewHolder{

        private TextView groupName,members ,groupType, date;
        private ImageView groupImage;



        ViewHolder(View itemView) {
            super(itemView);

            groupName = itemView.findViewById(R.id.textViewGroupName);
            groupType = itemView.findViewById(R.id.textViewGroupType);
            members = itemView.findViewById(R.id.textViewMembers);
            groupImage = itemView.findViewById(R.id.groupImage);
            date = itemView.findViewById(R.id.textViewDate);
        }
        void bindTo(Groups currentGroup){
            // Populate the textviews with data.
            groupName.setText(currentGroup.getGroupName());
            groupType.setText(currentGroup.getGroupType());
            Glide.with(mContext).load(currentGroup.getImageID()).into(groupImage);

        }


    }
}
