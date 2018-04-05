package com.example.ivan.datepick;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView dateDefault=(TextView)findViewById(R.id.dateDefault);
        TextView timeDefault=(TextView)findViewById(R.id.timeDefault);

        DatePicker dp=(DatePicker)this.findViewById(R.id.datePicker);

        dateDefault.setText("Дата по умолчанию: "+dp.getDayOfMonth()+"/"+(dp.getMonth()+dp.getYear()));

        dp.init(2015,02,01,null);

        TimePicker tp=(TimePicker)this.findViewById(R.id.timePicker);
        java.util.Formatter timeF=new java.util.Formatter();
        timeF.format("Время по умолчанию: ",tp.getCurrentHour(),tp.getCurrentMinute());
        timeDefault.setText(timeF.toString());
        tp.setCurrentHour(new Integer(10));
        tp.setCurrentMinute(new Integer(10));
    }
}
