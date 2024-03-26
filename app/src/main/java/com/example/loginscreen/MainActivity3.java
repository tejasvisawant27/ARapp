package com.example.loginscreen;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    // Method to open MainActivity2
    public void openMain2(View view) {
        startActivity(new Intent(this, MainActivity2.class));
    }

    // Method to open a website
    public void openWebsite(View view) {
        String url = "https://creator.plugxr.com/webar-preview/TJ9I4EPJ764QUW9P"; // Replace this with your URL
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }
}

