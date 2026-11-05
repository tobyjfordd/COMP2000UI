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

public class EmployeeViewRequestsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_employee_view_requests);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.cl_employee_view_requests), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // BACK BUTTON

        Button employeeBackBtn = findViewById(R.id.button_back);

        employeeBackBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(EmployeeViewRequestsActivity.this, EmployeeDashboardActivity.class);
                startActivity(intent);
            }
        });

        // CANCEL REQUEST BUTTONS

        Button cancelBtn1 = findViewById(R.id.button_cancel_request_1);

        cancelBtn1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                ((Button)v).setText("Request Cancelled");
            }
        });

        Button cancelBtn2 = findViewById(R.id.button_cancel_request_2);

        cancelBtn2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                ((Button)v).setText("Request Cancelled");
            }
        });

    }
}