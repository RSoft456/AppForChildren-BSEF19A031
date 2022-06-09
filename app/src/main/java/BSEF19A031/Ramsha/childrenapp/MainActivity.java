package BSEF19A031.Ramsha.childrenapp;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button Launch,Repo,quiz,list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Launch = findViewById(R.id.LaunchApp);
        Repo = findViewById(R.id.Repository);
        quiz = findViewById(R.id.Quiz);
        list=findViewById(R.id.ListView);
        list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,ListPage.class));
                Log.d(TAG, "entered");
            }
        });
        Launch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,MainPage.class));
            }
        });
        Repo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Uri uri = Uri.parse("https://github.com/RSoft456");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
            }
        });
        quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,Quiz.class));
            }
        });
    }


}