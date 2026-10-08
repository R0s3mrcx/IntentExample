package pl.edu.intentexample;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button openSecondButton = findViewById(R.id.openSecondButton);
        Button openWebsiteButton = findViewById(R.id.openWebsiteButton);
        Button showLocationButton = findViewById(R.id.showLocationButton);

        openSecondButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            intent.putExtra("MESSAGE", "Message sent from MainActivity");
            startActivity(intent);
        });

        openWebsiteButton.setOnClickListener(v -> {
            Uri uri = Uri.parse("https://www.android.com");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        });

        showLocationButton.setOnClickListener(v -> {
            Uri uri = Uri.parse("geo:50.3217,19.1949");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        });
    }
}