package com.example.gk_bt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class bai1 extends AppCompatActivity {
    EditText edtTaiKhoan,edtMatKhau,edtSdt,edtEmail;
    Button btnDangKy, btnNhapLai;
    TextView textThongTin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai1);
        setControl();
        setEvent();
    }

    private void setEvent() {
        btnDangKy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edtTaiKhoan.getText().toString().equals("")){
                    edtTaiKhoan.setError("Nhập tài khoản");
                    edtTaiKhoan.requestFocus();
                    Toast.makeText(bai1.this, "Hãy nhập tài khoản",Toast.LENGTH_LONG).show();
                    return ;
                }
                if (edtMatKhau.getText().toString().equals("")){
                    edtMatKhau.setError("Nhập mật khẩu");
                    edtMatKhau.requestFocus();
                    Toast.makeText(bai1.this, "Hãy nhập mật khẩu",Toast.LENGTH_LONG).show();
                    return ;
                }
                if (edtSdt.getText().toString().equals("")){
                    edtSdt.setError("Nhập số điện thoại");
                    edtSdt.requestFocus();
                    Toast.makeText(bai1.this, "Hãy nhập số điện thoại",Toast.LENGTH_LONG).show();
                    return ;
                }
                if (edtEmail.getText().toString().equals("")){
                    edtEmail.setError("Nhập email");
                    edtEmail.requestFocus();
                    Toast.makeText(bai1.this, "Hãy nhập email",Toast.LENGTH_LONG).show();
                    return ;
                }
                String msg = "Thông tin tài khoản";
                msg += "\nTài khoản: " + edtTaiKhoan.getText().toString();
                msg += "\nMật khẩu: " + edtMatKhau.getText().toString();
                msg += "\nSố điện thoại: " + edtSdt.getText().toString();
                msg += "\nEmail: " + edtEmail.getText().toString();
                textThongTin.setText(msg);
            }
        });

        btnNhapLai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtTaiKhoan.setText("");
                edtMatKhau.setText("");
                edtSdt.setText("");
                edtEmail.setText("");
                textThongTin.setText("");
            }
        });
    }

    private void setControl() {
        edtTaiKhoan = findViewById(R.id.edtTaiKhoan);
        edtMatKhau = findViewById(R.id.edtMatKhau);
        edtSdt = findViewById(R.id.edtSdt);
        edtEmail = findViewById(R.id.edtEmail);
        btnDangKy = findViewById(R.id.btnDangKy);
        btnNhapLai = findViewById(R.id.btnNhapLai);
        textThongTin = findViewById(R.id.textThongTin);
    }
}