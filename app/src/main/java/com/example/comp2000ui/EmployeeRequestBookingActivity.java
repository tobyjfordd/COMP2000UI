package com.example.comp2000ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class EmployeeRequestBookingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_employee_request_booking);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.cl_employee_request_booking), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // BACK BUTTON

        Button backBtn = findViewById(R.id.button_back);

        backBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(EmployeeRequestBookingActivity.this, EmployeeDashboardActivity.class);
                startActivity(intent);
            }
        });

        // VIEW AVAILABLE ROOMS BUTTON

        Button viewAvailableRoomsBtn = findViewById(R.id.button_view_available_rooms);

        viewAvailableRoomsBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //Intent intent = new Intent(EmployeeRequestBookingActivity.this, EmployeeViewAvailableRoomsActivity.class);
                //startActivity(intent);
            }
        });

        // START TIME DROPDOWNS

        // Selectable hours
        String[] startHours = new String[24];
        for (int i = 0; i < startHours.length; i++)
            startHours[i] = Integer.toString(i+1);

        ArrayAdapter<String> startHoursAdapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_spinner_item,
                startHours
        );

        startHoursAdapter.setDropDownViewResource(
                android.R.layout.simple_spinner_dropdown_item
        );

        ((Spinner)findViewById(R.id.spinner_start_hour)).setAdapter(startHoursAdapter);

        // Selectable minutes
        String[] startMinutes = new String[] {
                "00", "15", "30", "45"
        };

        ArrayAdapter<String> startMinutesAdapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_spinner_item,
                startMinutes
        );

        startMinutesAdapter.setDropDownViewResource(
                android.R.layout.simple_spinner_dropdown_item
        );

        ((Spinner)findViewById(R.id.spinner_start_minute)).setAdapter(startMinutesAdapter);

        // DURATION DROPDOWNS

        // Selectable hours
        String[] durationHours = new String[24];
        for (int i = 0; i < durationHours.length; i++)
            durationHours[i] = Integer.toString(i+1) + 'h';

        ArrayAdapter<String> durationHoursAdapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_spinner_item,
                durationHours
        );

        durationHoursAdapter.setDropDownViewResource(
                android.R.layout.simple_spinner_dropdown_item
        );

        ((Spinner)findViewById(R.id.spinner_duration_hour)).setAdapter(durationHoursAdapter);

        // Selectable minutes
        String[] durationMinutes = new String[] {
                "0m", "15m", "30m", "45m"
        };

        ArrayAdapter<String> durationMinutesAdapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_spinner_item,
                durationMinutes
        );

        durationMinutesAdapter.setDropDownViewResource(
                android.R.layout.simple_spinner_dropdown_item
        );

        ((Spinner)findViewById(R.id.spinner_duration_minute)).setAdapter(durationMinutesAdapter);
    }
}