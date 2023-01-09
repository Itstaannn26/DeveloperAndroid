package id.ac.poliban.vb.e020320040.helloconstraint;

import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
        final Button btnzero = findViewById(R.id.button_zero);
        final Button btncount = findViewById(R.id.button_count);

        btnzero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnzero.setBackgroundColor(Color.GREEN);
                mCount = 0;
                mShowCount.setText(Integer.toString(mCount));
            }
        });
        btncount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btncount.setBackgroundColor(Color.CYAN);
                mCount++;
                if (mShowCount != null) {
                    mShowCount.setText(Integer.toString(mCount));
                }
            }
        });
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        mCount++;
        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
        }
    }

    public void showZero(View view) {
    }
}
