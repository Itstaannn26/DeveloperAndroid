package id.ac.poliban.vb.e020320040.transitionandanimations;


import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends BaseClass {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("Intan (Transition and Animations Challenge)");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize the views.
        ImageView redBlock = findViewById(R.id.redBlock);
        ImageView blueBlock = findViewById(R.id.blueBlock);
        ImageView yellowBlock = findViewById(R.id.yellowBlock);
        ImageView androidBlock = findViewById(R.id.androidBlock);


        // Set the methods from the base class to the appropriate ImageViews.
        explodeTransition(this, redBlock);
        fadeTransition(this, blueBlock);
        rotateView(yellowBlock);
        switchAnimation(androidBlock,blueBlock,new Intent(
                this, SecondActivity.class),this);
    }
}