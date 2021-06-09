package io.alienlabs.gichukipaul.graphing;

import android.graphics.Color;
import android.os.Bundle;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class PieActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pie);
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        PieChart pieChart = findViewById(R.id.pc_pieChart);

        ArrayList<PieEntry> spendings = new ArrayList<>();
        spendings.add(new PieEntry(20000, "2014"));
        spendings.add(new PieEntry(30000, "2015"));
        spendings.add(new PieEntry(28100, "2016"));
        spendings.add(new PieEntry(24870, "2017"));
        spendings.add(new PieEntry(33400, "2018"));

        PieDataSet pieDataSet = new PieDataSet(spendings, "SPENDINGS");
        pieDataSet.setColors(ColorTemplate.JOYFUL_COLORS);
        pieDataSet.setValueTextColor(Color.BLACK);
        pieDataSet.setValueTextSize(16f);

        PieData pieData = new PieData(pieDataSet);
        pieChart.setData(pieData);
        pieChart.getLegend().setHorizontalAlignment(Legend.LegendHorizontalAlignment.CENTER);
        pieChart.getDescription().setText("Spendings chart as of year 2020");
        pieChart.setCenterText("MATUMIZI");
        pieChart.setDragDecelerationFrictionCoef(0.9990f);
        pieChart.animate();
    }
}