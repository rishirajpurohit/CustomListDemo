package in.rishirajpurohit.android.customlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyCarAdapter cars = new MyCarAdapter(this);

        ListView lv_cars = (ListView) findViewById(R.id.myCarList);

        lv_cars.setAdapter(cars);

    }
}
