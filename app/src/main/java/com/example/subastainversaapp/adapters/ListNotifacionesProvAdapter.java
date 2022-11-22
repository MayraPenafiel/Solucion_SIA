package com.example.subastainversaapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.subastainversaapp.MainActivity;
import com.example.subastainversaapp.entity.Subasta;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class ListNotifacionesProvAdapter extends RecyclerView.Adapter<ListIniProvAdapter.ViewHolder>{

    private List<String> messageList;
    private LayoutInflater layoutInflater;
    private Context context;

    public ListNotifacionesProvAdapter(List<String> messageList, Context context){
        this.layoutInflater = LayoutInflater.from(context);
        this.messageList = MainActivity.messageList;
        this.context = context;
    }
    @NonNull
    @NotNull
    @Override
    public ListIniProvAdapter.ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull ListIniProvAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
