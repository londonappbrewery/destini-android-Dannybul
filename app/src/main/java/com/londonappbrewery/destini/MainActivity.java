package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    public Button mButtonTop;
    public Button mButtonBottom;
    public TextView storyTextView;
    public int counter;
    public int path;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mButtonTop= findViewById(R.id.buttonTop);
        mButtonBottom= findViewById(R.id.buttonBottom);
        storyTextView= findViewById(R.id.storyTextView);
        counter = 0;


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            doWork(1);
            }
        });

        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doWork(0);

            }
        });

        }
        // counter counts the level
        // which == 0 is buttontop and 1 is top
        //button top is red and button bottom is blue
        private void doWork(int which) {
        if ((counter==0 && which==0) || (path==2 && which==0)){

            mButtonTop.setText(R.string.T3_Ans1);
            mButtonBottom.setText(R.string.T3_Ans2);
            storyTextView.setText(R.string.T3_Story);
            path=3;
            //t3 story
            //t3 ans1 leads to t6 end
            //t3 ans2 leads to
        }

        else if (counter == 0 && which ==1){
            path=2;

            mButtonTop.setText(R.string.T2_Ans1);
            mButtonBottom.setText(R.string.T2_Ans2);
            storyTextView.setText(R.string.T2_Story);



        }
//
        else if ( path==3 && which ==0){
            storyTextView.setText(R.string.T6_End);

        }
//
        else if(path==3 && which ==1){
        storyTextView.setText(R.string.T5_End);
        }
//
        else if (path==2 && which ==1){
            storyTextView.setText(R.string.T4_End);
        }
//
//        if (counter==1 && path==1 && which ==1){
        counter++;
        }






        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:


    }

