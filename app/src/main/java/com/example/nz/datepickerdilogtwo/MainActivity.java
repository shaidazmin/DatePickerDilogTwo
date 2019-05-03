package com.example.nz.datepickerdilogtwo;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);

        DateReult dateResult = new DateReult();
        button.setOnClickListener(dateResult);

    }

   class DateReult implements View.OnClickListener{

       @Override
       public void onClick(View v) {

           DatePicker datePicker = new DatePicker(MainActivity.this);


           int currentYear = datePicker.getYear();
           int currentMounth = (datePicker.getMonth()+1);
           int currentDate = datePicker.getDayOfMonth();
           DatePickerDialog datePickerDialog = new DatePickerDialog(MainActivity.this,
                   new DatePickerDialog.OnDateSetListener() {
                       @Override
                       public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                           Toast.makeText(MainActivity.this,dayOfMonth+"/"+month+"/"+year,Toast.LENGTH_LONG).show();
                       }
                   },currentYear,currentMounth,currentDate );
           datePickerDialog.show();





       }
   }
}
