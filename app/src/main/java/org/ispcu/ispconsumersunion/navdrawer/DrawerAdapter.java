package org.ispcu.ispconsumersunion.navdrawer;

import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.actionbarsherlock.app.SherlockFragmentActivity;

import org.ispcu.ispconsumersunion.R;

public class DrawerAdapter extends ArrayAdapter<DrawerItem> {

    private static final float height = 100.0f;

    Context context;
    DrawerItem[] drawerItemList;
    int layoutResID;
    SherlockFragmentActivity activity;

    /**
     * Constructor
     *
     * @param context  The current context.
     * @param resource The resource ID for a layout file containing a TextView to use when
     *                 instantiating views.
     * @param listItems  The objects to represent in the ListView.
     */
    public DrawerAdapter(Context context, int resource, DrawerItem[] listItems, SherlockFragmentActivity activity) {
        super(context, resource, listItems);
        this.context = context;
        this.drawerItemList = listItems;
        this.layoutResID = resource;
        this.activity = activity;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        DrawerItemHolder drawerHolder;
        View view = convertView;

        if (view == null) {
            LayoutInflater inflater = activity.getLayoutInflater();
            drawerHolder = new DrawerItemHolder();

            view = inflater.inflate(layoutResID, parent, false);

            drawerHolder.text = (TextView) view.findViewById(R.id.text);

            view.setTag(drawerHolder);
        } else {
            drawerHolder = (DrawerItemHolder) view.getTag();
        }

        DrawerItem dItem = this.drawerItemList[position];
        drawerHolder.text.setText(dItem.getItemName());

        if (position == 0) {
            drawerHolder.text.setTextSize(17);
            drawerHolder.text.setBackgroundColor(view.getResources().getColor(R.color.ispcuBlue));
            drawerHolder.text.setGravity(Gravity.CENTER);
            final float scale = view.getResources().getDisplayMetrics().density;
            drawerHolder.text.setLayoutParams(
                    new LinearLayout.LayoutParams(
                            ViewGroup.LayoutParams.MATCH_PARENT,
                            (int) (height * scale * 0.5f)
                    )
            );
            drawerHolder.text.setTextColor(view.getResources().getColor(android.R.color.white));
            drawerHolder.text.setPadding(0,0,0,0);
        }

        return view;
    }

    @Override
    public boolean isEnabled(int position) {
        return position != 0;
    }

    private static class DrawerItemHolder {
        TextView text;
    }
}
