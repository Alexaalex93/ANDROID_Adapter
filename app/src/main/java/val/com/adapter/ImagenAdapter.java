package val.com.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by vale on 23/05/16.
 */
public class ImagenAdapter extends BaseAdapter {
    private Context mContext;
    private String[] _array;


    public ImagenAdapter(Context c) {
        mContext = c;
    }

    public  ImagenAdapter (Context c, String[] array){
        _array = array;
        mContext = c;
    }

    public int getCount() {
        return _array.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {

        TextView view = null;
        LayoutInflater inflater = LayoutInflater.from(mContext);
        view =(TextView) inflater.inflate(R.layout.fila, null);
        view.setText(_array[position]);

        return view;
    }

}

    // references to our images


