package id.ac.poliban.vb.e020320040.checkboxes_and_etc;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String message = "Toppings: ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("Intan (Checkboxes)");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (getSupportActionBar() != null) getSupportActionBar().setTitle("Checkboxes ");
    }

    public void toastMessage(View view) {
        selectToppings((CheckBox) findViewById(R.id.check_syrup), getString(R.string.syrup));
        selectToppings((CheckBox) findViewById(R.id.check_sprinkles), getString(R.string.sprinkles));
        selectToppings((CheckBox) findViewById(R.id.check_crushed_nuts), getString(R.string.crushed_nuts));
        selectToppings((CheckBox) findViewById(R.id.check_cherries), getString(R.string.cherries));
        selectToppings((CheckBox) findViewById(R.id.check_oreo), getString(R.string.oreo_cookie_crumbles));
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    private void selectToppings(CheckBox checkBox, String topping){
        if (checkBox.isChecked()){
            if (!message.contains(topping)){
                message = message + " " + topping;
            }
        }
        else{
            if (message.contains(topping)){
                message = message.replace(" " + topping, "");
            }
        }
    }

}