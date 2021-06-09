package io.alienlabs.gichukipaul.graphing;

import android.graphics.Color;
import android.os.Bundle;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class BarActivity extends AppCompatActivity {

    BarChart barChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar);
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        barChart = findViewById(R.id.bc_barChart);

        ArrayList<BarEntry> savings = new ArrayList<>();
        savings.add(new BarEntry(2014, 20000));
        savings.add(new BarEntry(2015, 30000));
        savings.add(new BarEntry(2016, 28100));
        savings.add(new BarEntry(2017, 24870));
        savings.add(new BarEntry(2018, 33400));

        BarDataSet barDataSet = new BarDataSet(savings, getString(R.string.savings));
        barDataSet.setColors(ColorTemplate.MATERIAL_COLORS);
        barDataSet.setValueTextSize(16f);
        barDataSet.setValueTextColor(Color.BLACK);

        BarData barData = new BarData(barDataSet);

        barChart.setFitBars(true);
        barChart.setData(barData);
        //barChart.animateX(2000);
        barChart.animateY(2000);
        barChart.getDescription().setText("Savings Accumulated");
    }
}