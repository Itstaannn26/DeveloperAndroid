package id.ac.poliban.vb.e020320040.materialmechallenge;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("Intan (MaterialMe Challenge");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView sportsTitle = findViewById(R.id.titleDetail);
        ImageView sportsImage = findViewById(R.id.sportsImageDetail);
        TextView sportsDetail = findViewById(R.id.subTitleDetail);

        Intent intent = getIntent();
        String titleString = intent.getStringExtra("title");
        int imageInt = intent.getIntExtra("image_resource", 0);
        String details = intent.getStringExtra("details");

        sportsTitle.setText(titleString);
        Glide.with(this).load(imageInt).into(sportsImage);
        sportsDetail.setText(details);
    }
}
