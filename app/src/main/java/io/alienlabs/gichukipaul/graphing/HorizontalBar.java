package io.alienlabs.gichukipaul.graphing;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

import com.github.mikephil.charting.charts.HorizontalBarChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.List;

public class HorizontalBar extends AppCompatActivity {
    HorizontalBarChart horizontalBarChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horizontal_bar);
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        horizontalBarChart = findViewById(R.id.horizontalBarChart);

        List<String> labels = new ArrayList<>();
        labels.add("Covid 19*");
        labels.add("Stroke");
        labels.add("Road Accidents");
        labels.add("Heart disease");
        labels.add("Malaria");
        labels.add("Birth trauma");
        labels.add("Low birth weight");
        labels.add("Pneumonia");
        labels.add("HIV");
        labels.add("Tuberculosis");
        labels.add("Cancer");
        labels.add("Diarrhoeal diseases");

        ArrayList<BarEntry> covid = new ArrayList<>();
        covid.add(new BarEntry(0, 2092, "COVID"));
        ArrayList<BarEntry> stroke = new ArrayList<>();
        stroke.add(new BarEntry(1, 7206));
        ArrayList<BarEntry> accidents = new ArrayList<>();
        accidents.add(new BarEntry(2, 3114));
        ArrayList<BarEntry> heart = new ArrayList<>();
        heart.add(new BarEntry(3, 7522));
        ArrayList<BarEntry> malaria = new ArrayList<>();
        malaria.add(new BarEntry(4, 10700));
        ArrayList<BarEntry> trauma = new ArrayList<>();
        trauma.add(new BarEntry(5, 7206));
        ArrayList<BarEntry> weight = new ArrayList<>();
        weight.add(new BarEntry(6, 13300));
        ArrayList<BarEntry> pneumonia = new ArrayList<>();
        pneumonia.add(new BarEntry(7, 19503));
        ArrayList<BarEntry> HIV = new ArrayList<>();
        HIV.add(new BarEntry(8, 20897));
        ArrayList<BarEntry> TB = new ArrayList<>();
        TB.add(new BarEntry(9, 32000));
        ArrayList<BarEntry> cancer = new ArrayList<>();
        cancer.add(new BarEntry(10, 32987));
        ArrayList<BarEntry> dirrhoea = new ArrayList<>();
        dirrhoea.add(new BarEntry(11, 37655));


        BarDataSet barDataSet = new BarDataSet(covid, labels.get(0));
        barDataSet.setColor(ColorTemplate.MATERIAL_COLORS[0]);
        barDataSet.setValueTextSize(16f);
        barDataSet.setValueTextColor(Color.BLACK);

        BarDataSet roadAcc = new BarDataSet(accidents, labels.get(1));
        roadAcc.setColor(ColorTemplate.MATERIAL_COLORS[1]);
        roadAcc.setValueTextSize(16f);
        roadAcc.setValueTextColor(Color.BLACK);

        BarDataSet strok = new BarDataSet(stroke, labels.get(2));
        strok.setColor(ColorTemplate.MATERIAL_COLORS[2]);
        strok.setValueTextSize(16f);
        strok.setValueTextColor(Color.BLACK);

        BarDataSet heartD = new BarDataSet(heart, labels.get(3));
        heartD.setColor(ColorTemplate.MATERIAL_COLORS[3]);
        heartD.setValueTextSize(16f);
        heartD.setValueTextColor(Color.BLACK);

        BarDataSet malariaa = new BarDataSet(malaria, labels.get(4));
        malariaa.setColor(ColorTemplate.COLORFUL_COLORS[0]);
        malariaa.setValueTextSize(16f);
        malariaa.setValueTextColor(Color.BLACK);

        BarDataSet traumaa = new BarDataSet(trauma, labels.get(5));
        traumaa.setColor(ColorTemplate.COLORFUL_COLORS[2]);
        traumaa.setValueTextSize(16f);
        traumaa.setValueTextColor(Color.BLACK);

        BarDataSet weightt = new BarDataSet(weight, labels.get(6));
        weightt.setColor(ColorTemplate.COLORFUL_COLORS[3]);
        weightt.setValueTextSize(16f);
        weightt.setValueTextColor(Color.BLACK);

        BarDataSet pneumoniaa = new BarDataSet(pneumonia, labels.get(7));
        pneumoniaa.setColor(ColorTemplate.COLORFUL_COLORS[4]);
        pneumoniaa.setValueTextSize(16f);
        pneumoniaa.setValueTextColor(Color.BLACK);

        BarDataSet HIVV = new BarDataSet(HIV, labels.get(8));
        HIVV.setColor(ColorTemplate.PASTEL_COLORS[0]);
        HIVV.setValueTextSize(16f);
        HIVV.setValueTextColor(Color.BLACK);

        BarDataSet TBB = new BarDataSet(TB, labels.get(9));
        TBB.setColor(ColorTemplate.PASTEL_COLORS[1]);
        TBB.setValueTextSize(16f);
        TBB.setValueTextColor(Color.BLACK);

        BarDataSet cancerr = new BarDataSet(cancer, labels.get(10));
        cancerr.setColor(ColorTemplate.PASTEL_COLORS[2]);
        cancerr.setValueTextSize(16f);
        cancerr.setValueTextColor(Color.BLACK);

        BarDataSet diarrhoeaa = new BarDataSet(dirrhoea, labels.get(11));
        diarrhoeaa.setColor(Color.BLACK);
        diarrhoeaa.setValueTextSize(16f);
        diarrhoeaa.setValueTextColor(Color.BLACK);


        List<IBarDataSet> dataSetList = new ArrayList<>();
        dataSetList.add(diarrhoeaa);
        dataSetList.add(cancerr);
        dataSetList.add(TBB);
        dataSetList.add(HIVV);
        dataSetList.add(pneumoniaa);
        dataSetList.add(weightt);
        dataSetList.add(traumaa);
        dataSetList.add(malariaa);
        dataSetList.add(heartD);
        dataSetList.add(strok);
        dataSetList.add(roadAcc);
        dataSetList.add(barDataSet);


        BarData barData = new BarData(dataSetList);
        horizontalBarChart.setData(barData);
        horizontalBarChart.setDrawGridBackground(false);
        horizontalBarChart.animateXY(3000, 2500);
        horizontalBarChart.setBorderWidth(5f);
        horizontalBarChart.getDescription().setText("(Sources : MoH, World Bank, Lancet, NTSA, National Cancer Institute-Kenya) Whats's killing Kenyans?");
//        horizontalBarChart.getXAxis().setDrawGridLines(false);
//        horizontalBarChart.getAxisLeft().setDrawGridLines(false);
//        horizontalBarChart.getAxisRight().setDrawGridLines(false);
        horizontalBarChart.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);

        Legend l = horizontalBarChart.getLegend();
        l.setForm(Legend.LegendForm.CIRCLE);
        l.setTextColor(Color.BLACK);
        l.setVerticalAlignment(Legend.LegendVerticalAlignment.CENTER);
        l.setHorizontalAlignment(Legend.LegendHorizontalAlignment.RIGHT);
        l.setOrientation(Legend.LegendOrientation.VERTICAL);
        l.setDrawInside(false);
        l.setFormSize(8f);
        l.setXEntrySpace(4f);

    }
}