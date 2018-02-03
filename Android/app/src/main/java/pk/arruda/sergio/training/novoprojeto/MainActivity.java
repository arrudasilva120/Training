package pk.arruda.sergio.training.novoprojeto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("onCreate", "Estou Acordando!");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("onStart", "Estou Abrindo os Olhos!");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("onResume", "Acordei!");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
            }

    public void apagarActivity(View v){
        Log.i("onDestroy", "Oh, Meus Deus Vou Morrer, Socorro!");
        finish();
    }
}
