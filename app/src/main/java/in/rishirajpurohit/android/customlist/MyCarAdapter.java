package in.rishirajpurohit.android.customlist;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by rishi on 08-09-2017.
 */

public class MyCarAdapter extends BaseAdapter {

    String[] cars = {"toyota", "mustang"};
    Context ctx;
    private static LayoutInflater inflater=null;

    public MyCarAdapter(Activity activity, Context ctx){
        this.ctx = ctx;
        inflater = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public int getCount() {
        return cars.length;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return 1;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        View myview = inflater.inflate(R.layout.simple_row_item, null);
        TextView car_name = (TextView) myview.findViewById(R.id.car_name);
        car_name.setText(cars[i]);
        final int position = i;

        Button btn = (Button) myview.findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ctx, "You clicked : "+cars[position], Toast.LENGTH_SHORT).show();
            }
        });
        return myview;

    }

}
