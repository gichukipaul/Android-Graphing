package io.alienlabs.gichukipaul.graphing;

import android.graphics.Color;
import android.os.Bundle;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

import com.github.mikephil.charting.charts.RadarChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.RadarData;
import com.github.mikephil.charting.data.RadarDataSet;
import com.github.mikephil.charting.data.RadarEntry;
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter;

import java.util.ArrayList;

public class RadarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radar);
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        RadarChart radarChart = findViewById(R.id.rc_radarChart);
        ArrayList<RadarEntry> radarEntriesForMaasaiMara = new ArrayList<>();
        radarEntriesForMaasaiMara.add(new RadarEntry(4000));
        radarEntriesForMaasaiMara.add(new RadarEntry(4500));
        radarEntriesForMaasaiMara.add(new RadarEntry(7000));
        radarEntriesForMaasaiMara.add(new RadarEntry(6500));
        radarEntriesForMaasaiMara.add(new RadarEntry(4000));
        radarEntriesForMaasaiMara.add(new RadarEntry(2200));
        radarEntriesForMaasaiMara.add(new RadarEntry(5700));

        RadarDataSet radarDataSetForMaasaiMara = new RadarDataSet(radarEntriesForMaasaiMara, " MAASAI MARA ");
        radarDataSetForMaasaiMara.setColor(Color.GREEN);
        radarDataSetForMaasaiMara.setDrawFilled(true);
        radarDataSetForMaasaiMara.setFillColor(Color.GRAY);
        radarDataSetForMaasaiMara.setLineWidth(3f);
        radarDataSetForMaasaiMara.setValueTextColor(Color.GREEN);
        radarDataSetForMaasaiMara.setValueTextSize(14f);

        RadarData radarData = new RadarData();
        radarData.addDataSet(radarDataSetForMaasaiMara);

        String[] months = {"JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY"};

        XAxis xAxis = radarChart.getXAxis();
        xAxis.setValueFormatter(new IndexAxisValueFormatter(months));


        ArrayList<RadarEntry> radarEntriesForNakuruPark = new ArrayList<>();
        radarEntriesForNakuruPark.add(new RadarEntry(4500));
        radarEntriesForNakuruPark.add(new RadarEntry(5500));
        radarEntriesForNakuruPark.add(new RadarEntry(4500));
        radarEntriesForNakuruPark.add(new RadarEntry(2500));
        radarEntriesForNakuruPark.add(new RadarEntry(7000));
        radarEntriesForNakuruPark.add(new RadarEntry(7000));
        radarEntriesForNakuruPark.add(new RadarEntry(6500));

        RadarDataSet dataSet = new RadarDataSet(radarEntriesForNakuruPark, " NAKURU ");
        dataSet.setColor(Color.BLUE);
        dataSet.setDrawFilled(true);
        dataSet.setFillColor(Color.MAGENTA);
        dataSet.setLineWidth(3f);
        dataSet.setValueTextColor(Color.BLUE);
        dataSet.setValueTextSize(14f);
        radarData.addDataSet(dataSet);

        radarChart.setData(radarData);
        radarChart.setDragDecelerationFrictionCoef(0.9900f);
        radarChart.animate();
        radarChart.getDescription().setText(" Comparison of number of tourists ");


    }
}