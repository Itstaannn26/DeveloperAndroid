package id.ac.poliban.vb.e020320040.twoactivitieshomework;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import id.ac.poliban.vb.e020320040.sayhellohomework.R;

public class MainActivity extends AppCompatActivity {
    public static final String COUNT = "id.ac.poliban.vb.e020320040.TwoActivitiesHomework.COUNT";
    private int mCount = 0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
    }

    public void countUp(View view) {
        mCount++;
        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
        }
    }
    public void launchSecondActivity(View view) {
        Toast toast = Toast.makeText(this, "HelloToast!", Toast.LENGTH_SHORT);
        toast.show();
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(COUNT, Integer.parseInt(mShowCount.getText().toString()));
        startActivity(intent);
    }
}

