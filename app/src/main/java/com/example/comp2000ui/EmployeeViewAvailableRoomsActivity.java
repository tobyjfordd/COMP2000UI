package com.example.comp2000ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class EmployeeViewAvailableRoomsActivity extends AppCompatActivity {

    void BackToDashboardAppear()
    {
        findViewById(R.id.button_back_to_dashboard).setVisibility(View.VISIBLE);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_employee_view_available_rooms);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.cl_employee_view_available_rooms), (v, insets) -> {
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
                Intent intent = new Intent(EmployeeViewAvailableRoomsActivity.this, EmployeeRequestBookingActivity.class);
                startActivity(intent);
            }
        });

        // REQUEST BUTTONS

        Button requestBtn1 = findViewById(R.id.button_request_room_1);

        requestBtn1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                requestBtn1.setText("Room Requested");
                BackToDashboardAppear();
            }
        });

        Button requestBtn2 = findViewById(R.id.button_request_room_2);

        requestBtn2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                requestBtn2.setText("Room Requested");
                BackToDashboardAppear();
            }
        });

        // BACK TO DASHBOARD BUTTON

        Button backToDashboardBtn = findViewById(R.id.button_back_to_dashboard);

        backToDashboardBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(EmployeeViewAvailableRoomsActivity.this, EmployeeDashboardActivity.class);
                startActivity(intent);
            }
        });
    }
}