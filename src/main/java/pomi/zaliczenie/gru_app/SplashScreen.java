package pomi.zaliczenie.gru_app;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;

public class SplashScreen extends AppCompatActivity {

    public boolean counterEnded = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new CountDownTimer(1000,1000) {
            ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBar);
            ImageView imageView = (ImageView) findViewById(R.id.imageView2);

            @Override
            public void onTick(long millisUntilFinished) {}

            @Override
            public void onFinish() {
                progressBar.setAlpha(0);
                imageView.setAlpha(0);
                counterEnded=true;
            }
        }.start();

        ImageView imageView = (ImageView) findViewById(R.id.imageView);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(counterEnded){

                    startActivity(new Intent(getApplicationContext(),Main.class));
                }
            }
        });




    }
}
