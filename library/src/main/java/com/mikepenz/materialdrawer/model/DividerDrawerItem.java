package com.mikepenz.materialdrawer.model;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mikepenz.materialdrawer.R;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;

/**
 * Created by mikepenz on 03.02.15.
 */
public class DividerDrawerItem implements IDrawerItem {

    public DividerDrawerItem() {

    }

    @Override
    public int getIdentifier() {
        return -1;
    }

    @Override
    public Object getTag() {
        return null;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }

    @Override
    public String getType() {
        return "DIVIDER_ITEM";
    }

    @Override
    public int getLayoutRes() {
        return R.layout.material_drawer_item_divider;
    }

    @Override
    public View convertView(LayoutInflater inflater, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null) {
            convertView = inflater.inflate(getLayoutRes(), parent, false);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.view.setClickable(false);
        viewHolder.view.setEnabled(false);

        viewHolder.view.setMinimumHeight(1);
        return convertView;
    }

    private static class ViewHolder {
        private View view;

        private ViewHolder(View view) {
            this.view = view;
        }
    }
}
