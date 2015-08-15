package atchley.chris.templatewithspalshscreen;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.Calendar;

public class Activity2 extends AppCompatActivity {
    private TextView mTextview2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        mTextview2=(TextView)findViewById(R.id.textview2);
        String date = String.valueOf(Calendar.getInstance().get(Calendar.DAY_OF_YEAR));
        Typeface newFont = Typeface.createFromAsset(getAssets(),"fonts/BodoniFLF-Roman.ttf");
        mTextview2.setTypeface(newFont);
        mTextview2.setText("testing to see if a long string will look good on the screen or if it will go off");


    }


}
