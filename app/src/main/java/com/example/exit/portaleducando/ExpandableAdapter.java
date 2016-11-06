package com.example.exit.portaleducando;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

/**
 * Created by EXIT on 06/11/2016.
 */

public class ExpandableAdapter extends BaseExpandableListAdapter {
    private List<String> listGroup;
    private HashMap<String,List<String>> listData;
    private LayoutInflater inflater;


    public ExpandableAdapter(Context context,List<String> listGroup,HashMap<String,List<String>> listData){
        this.listGroup = listGroup;
        this.listData = listData;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getGroupCount() {
        return listGroup.size();
    }

    @Override
    public int getChildrenCount(int i) {
        return listData.get(listGroup.get(i)).size();
    }

    @Override
    public Object getGroup(int i) {
        return listGroup.get(i);
    }

    @Override
    public Object getChild(int i, int i1) {
        return listData.get(listGroup.get(i)).get(i1);
    }

    @Override
    public long getGroupId(int i) {
        return i;
    }

    @Override
    public long getChildId(int i, int i1) {
        return i1;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int i, boolean b, View view, ViewGroup viewGroup) {
        ViewHolderGroup holder;

        if (view == null){
            view = inflater.inflate(R.layout.header_explandable_list_view,null);
            holder = new ViewHolderGroup();
            view.setTag(holder);

            holder.tvGroup = (TextView) view.findViewById(R.id.tvGroup);
        }
        else {
            holder = (ViewHolderGroup) view.getTag();
        }
        holder.tvGroup.setText(listGroup.get(i));

        return view;
    }

    @Override
    public View getChildView(int i, int i1, boolean b, View view, ViewGroup viewGroup) {
        ViewHolderItem holder;
        String valor = (String) getChild(i,i1);

        if (view == null){
            view = inflater.inflate(R.layout.item_explandable_list_view,null);
            holder = new ViewHolderItem();
            view.setTag(holder);

            holder.tvItem = (TextView) view.findViewById(R.id.tvItem);
        }
        else {
            holder = (ViewHolderItem) view.getTag();
        }
        holder.tvItem.setText(valor);

        return view;
    }

    @Override
    public boolean isChildSelectable(int i, int i1) {
        return true;
    }

    class ViewHolderGroup{
        TextView tvGroup;
    }
    class ViewHolderItem{
        TextView tvItem;
    }
}
