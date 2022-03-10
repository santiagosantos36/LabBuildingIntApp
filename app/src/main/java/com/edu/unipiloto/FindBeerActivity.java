package com.edu.unipiloto;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class FindBeerActivity extends Activity {

    private BeerExpert expert = new BeerExpert();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);
    }

    public void onClickFindBeer (View view){
        Spinner color = (Spinner)findViewById(R.id.color);
        String selectedBeerType = String.valueOf(color.getSelectedItem());

    
        List<String> brandsList = expert.getBrands(selectedBeerType);
        StringBuilder brandsFormatted = new StringBuilder();
        for (String brand : brandsList){
            brandsFormatted.append(brand).append('\n');
        }

        TextView brands = (TextView)findViewById(R.id.brands);
        brands.setText(brandsFormatted);
    }
}
