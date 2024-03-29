package id.ac.poliban.vb.e020320040.dialogforalert;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("Intan (Dialog For Alert)");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickShowAlert(View view) {
        AlertDialog.Builder myAlertBuilder =
                new AlertDialog.Builder(MainActivity.this);

        // Set the dialog title and message.
        myAlertBuilder.setTitle(R.string.alert_title);
        myAlertBuilder.setMessage(R.string.alert_message);

        // Add the dialog buttons.
        myAlertBuilder.setPositiveButton(R.string.ok_button,
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // User clicked OK button.
                        Toast.makeText(getApplicationContext(),
                                R.string.pressed_ok,
                                Toast.LENGTH_SHORT).show();
                    }
                });
        myAlertBuilder.setNegativeButton(R.string.cancel_button,
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // User cancelled the dialog.
                        Toast.makeText(getApplicationContext(),
                                R.string.pressed_cancel,
                                Toast.LENGTH_SHORT).show();
                    }
                });
        // Create and show the AlertDialog.
        myAlertBuilder.show();
    }
}