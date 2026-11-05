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

public class EmployeeDashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_employee_dashboard);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.cl_employee_dashboard), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // LOGOUT BUTTON

        Button backBtn = findViewById(R.id.button_logout);

        backBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(EmployeeDashboardActivity.this, EmployeeLoginActivity.class);
                startActivity(intent);
            }
        });

        // VIEW YOUR REQUESTS BUTTON

        Button viewYourRequestsBtn = findViewById(R.id.button_view_your_requests);

        viewYourRequestsBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(EmployeeDashboardActivity.this, EmployeeViewRequestsActivity.class);
                startActivity(intent);
            }
        });

        // VIEW YOUR BOOKINGS BUTTON

        Button viewYourBookingsBtn = findViewById(R.id.button_view_your_bookings);

        viewYourBookingsBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(EmployeeDashboardActivity.this, EmployeeViewBookingsActivity.class);
                startActivity(intent);
            }
        });

        // REQUEST BOOKING BUTTON

        Button requestBookingBtn = findViewById(R.id.button_request_booking);

        requestBookingBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(EmployeeDashboardActivity.this, EmployeeRequestBookingActivity.class);
                startActivity(intent);
            }
        });
    }
}