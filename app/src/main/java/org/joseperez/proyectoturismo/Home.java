package org.joseperez.proyectoturismo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Fam. Pérez Sontay on 26/05/2016.
 */
public class Home extends AppCompatActivity {
    ListView ejemplo;

    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ejemplo = (ListView) findViewById(R.id.listView);

        String[] array = {"ejemplo 1", "ejemplo 2", "ejemplo 3", "ejemplo 4"};
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, array);
    }
}
