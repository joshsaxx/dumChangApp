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
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(mContext).inflate(R.layout.activity_main_item,parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull GroupAdapter.ViewHolder holder, int position) {
        // Get current group.
        Groups currentGroup = mGroupData.get(position);

        // Populate the textviews with data.
        holder.bindTo(currentGroup);

    }

    @Override
    public int getItemCount() {
        return mGroupData.size();
    }


    class ViewHolder extends RecyclerView.ViewHolder{
        private TextView groupName;
        private TextView members;
        private TextView groupType;
        private ImageView groupImage;
        private EditText date;


        public ViewHolder(View itemView) {
            super(itemView);

            groupName = itemView.findViewById(R.id.textViewGroupName);
            members = itemView.findViewById(R.id.textViewMembers);
            groupImage = itemView.findViewById(R.id.imageView2);
        }

        public void bindTo(Groups currentSport) {
            groupName.setText(currentSport.getGroupName());
            groupType.setText(currentSport.getGroupType());

        }
    }
}
