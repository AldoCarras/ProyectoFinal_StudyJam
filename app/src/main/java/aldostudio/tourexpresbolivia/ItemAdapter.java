package aldostudio.tourexpresbolivia;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ALDO on 27/12/2016.
 */

public class ItemAdapter extends BaseAdapter {
    private Activity activity;
    private ArrayList<Lugar> item;

    public ItemAdapter(Activity activity, ArrayList<Lugar> item) {
        this.activity = activity;
        this.item = item;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public ArrayList<Lugar> getItem() {
        return item;
    }

    public void setItem(ArrayList<Lugar> item) {
        this.item = item;
    }

    @Override
    public int getCount() { return item.size();

    }

    @Override
    public Object getItem(int i) { return item.get(i);
    }

    @Override
    public long getItemId(int i) { return item.get(i).getId();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        View v = view;
        if(view==null)
        {
            LayoutInflater inf = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inf.inflate(R.layout.item_ubicacion,null);
        }
        Lugar lugar = item.get(i);

        TextView nombre = (TextView)v.findViewById(R.id.TV_nombre);
        nombre.setText(lugar.getNombre());

        TextView fecha = (TextView)v.findViewById(R.id.TV_fecha);
        fecha.setText(lugar.getFecha());

        return v;
}
}
