package com.example.subastainversaapp.adaptadorList;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

public class MultipleAdapter  extends BaseAdapter implements SelectedIndex{

    private final Context mContext;
    List&amp;lt;MultipleData&amp;gt; mList;

    @Override
    public void setSelectedIndex(int position) {

        if (mList.get(position).isSelected()) {
            mList.get(position).setSelected(false);
        } else {
            mList.get(position).setSelected(true);
        }
    }

    static class ViewHolder {
        TextView mTextView;
        RadioButton mRadioButton;
    }

    public MultipleAdapter(Context context, List&amp;lt;MultipleData&amp;gt; list) {
        this.mContext = context;
        this.mList = list;
    }


    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}
