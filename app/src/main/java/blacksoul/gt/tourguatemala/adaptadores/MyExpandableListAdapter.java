package blacksoul.gt.tourguatemala.adaptadores;

import android.app.Activity;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.CheckedTextView;
import android.widget.TextView;
import android.widget.Toast;

import blacksoul.gt.tourguatemala.R;
import blacksoul.gt.tourguatemala.modelo.Group;
import blacksoul.gt.tourguatemala.vista.actividades.Policias;

/**
 * Created by GT on 25/05/2016.
 */
public class MyExpandableListAdapter extends BaseExpandableListAdapter {

    private final SparseArray<Group> groups;
    public LayoutInflater inflater;
    public Activity activity;

    public MyExpandableListAdapter(Policias policias, SparseArray<Group> groups) {
        activity = policias;
        this.groups = groups;
        //LayoutInflater inflater = (LayoutInflater)policias.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater = policias.getLayoutInflater();
    }

    @Override
    public int getGroupCount() {
        return groups.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return groups.get(groupPosition).children.size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return groups.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return groups.get(groupPosition).children.get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return 0;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return 0;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        if (convertView == null){
            convertView = inflater.inflate(R.layout.listrow_group,null);
        }
        Group group = (Group) getGroup(groupPosition);
        //((CheckedTextView)convertView).setText(group.string);
        //((CheckedTextView)convertView).setChecked(isExpanded);
        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        final String children = (String) getChild(groupPosition,childPosition);
        TextView text = null;
        if (convertView==null){
            convertView = inflater.inflate(R.layout.listrow_details,null);
        }
        text = (TextView) convertView.findViewById(R.id.textView1);
        text.setText(children);
        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(activity, children, Toast.LENGTH_SHORT).show();
            }
        });
        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return false;
    }
    public void OnGroupCollapsed ( int groupPosition){
        super.onGroupCollapsed(groupPosition);
    }

}
