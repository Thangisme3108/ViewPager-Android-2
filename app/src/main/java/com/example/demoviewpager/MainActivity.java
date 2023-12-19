package com.example.demoviewpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn_xem_frag_1, btn_xem_frag_2;
    FragmentManager fm;
    Frag111 frag111;
    Frag222 frag222;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void NhanDuLieuTuFrag111 (String duLieu) {
        // Gắn tạm vào tên nút bấm
        btn_xem_frag_1.setTag(duLieu);
    }
}
