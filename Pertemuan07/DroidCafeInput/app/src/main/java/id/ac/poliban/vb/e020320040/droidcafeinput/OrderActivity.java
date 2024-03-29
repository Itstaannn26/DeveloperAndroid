package id.ac.poliban.vb.e020320040.droidcafeinput;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class OrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        Intent intent = getIntent();
        String message = "Order: " +
                intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textView = findViewById(R.id.order_textview);
        textView.setText(message);
    }

    public void onRadioButtonClicked(View view) {
        //Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        //check which radio button was clicked.
        switch (view.getId()){
            case R.id.sameday:
                if (checked)
                    // same day service
                    dispalToast(getString(R.string.same_day_messenger_service));
                break;
            case R.id.nextday:
                if (checked)
                    //next day delivery
                    dispalToast(getString(R.string.next_day_ground_delivery));
                break;
            case R.id.pickup:
                if(checked)
                    //pick up
                    dispalToast(getString(R.string.pick_up));
                break;
            default:
                //Do nothing
                break;
        }
    }

    public void dispalToast(String message){
    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
}