package id.ac.poliban.vb.e020320040.twoactivitieshomework;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import id.ac.poliban.vb.e020320040.sayhellohomework.R;

public class SecondActivity extends AppCompatActivity {

    private static final String TAG = "TAG";
    TextView helloViewview;
    TextView counterViewview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        helloViewview = (TextView) findViewById(R.id.hello);
        counterViewview = (TextView) findViewById(R.id.number);
        Intent intent = getIntent();
        helloViewview.setText("Hello!");
        counterViewview.setText(Integer.toString(intent.getIntExtra(MainActivity.COUNT, 0)));


    }
}