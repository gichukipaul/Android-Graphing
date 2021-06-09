package io.alienlabs.gichukipaul.graphing;

import android.os.Bundle;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class LineActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_line);
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        LineChart lineChart = findViewById(R.id.lc_lineChart);

        ArrayList<Entry> entries = new ArrayList<>();
        entries.add(new Entry(2014, 180));
        entries.add(new Entry(2015, 185));
        entries.add(new Entry(2016, 150));
        entries.add(new Entry(2017, 140));
        entries.add(new Entry(2018, 145));
        entries.add(new Entry(2019, 175));
        entries.add(new Entry(2020, 160));
        entries.add(new Entry(2021, 180));

        LineDataSet dataSet = new LineDataSet(entries, " DONATIONS ");
        dataSet.setMode(LineDataSet.Mode.CUBIC_BEZIER);
        dataSet.setDrawFilled(true);
        dataSet.setFillColor(ColorTemplate.getHoloBlue());
        dataSet.setColor(ColorTemplate.getHoloBlue());
        dataSet.setFillAlpha(255);

        LineData lineData = new LineData(dataSet);
        lineChart.setData(lineData);
        lineChart.getDescription().setText(" Donations to the org. ");
        lineChart.animateXY(2000, 2000);
        lineChart.getXAxis().setDrawGridLines(false);
    }
}