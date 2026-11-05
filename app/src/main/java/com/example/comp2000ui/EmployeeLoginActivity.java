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

public class EmployeeLoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_employee_login);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.cl_employee_login), (v, insets) -> {
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
                Intent intent = new Intent(EmployeeLoginActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        // LOGIN BUTTON

        Button employeeLoginSelectBtn = findViewById(R.id.button_login);

        employeeLoginSelectBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(EmployeeLoginActivity.this, EmployeeDashboardActivity.class);
                startActivity(intent);
            }
        });

    }
}