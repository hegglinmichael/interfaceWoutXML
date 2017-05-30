package com.example.mike.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

//to make interface everything goes inside a layout
//all things that can be dragged an dropped from xml has inheritance from the view class
//                                      (reason for method addView())

public class MainActivity extends AppCompatActivity {

    //only print out the messages we are looking at
    //helps with debugging
    private static final String TAG = "buckysMessage";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //get rid of line below to make a interface completely in java
        setContentView(R.layout.activity_main);
        //prints out the state of this activity
        Log.i(TAG, "onCreate");

        //CODE TO MAKE AN INTERFACE WITHOUT XML
        //---------------------------------------------------------------------------------
        /*
        *
        *==>LAYOUT (GIVING LAYOUT COLOR)
        *RelativeLayout BuckysLayout = new RelativeLayout(this);
        * BuckysLayout.setBackgroundColor(Color.RED);
        *
        * ==>ADDING PARAMETERS TO THE LAYOUT TO ADD TO THE BUTTON THE POSITION IT\
        * RelativeLayout.layoutParams buttonDetails = new RelativeLayout.layoutParams(
        *       RelativeLayout.layoutParams.WRAP_CONTENT,
        *       RelativeLayout.layoutParams.WRAP_CONTENT
        * );
        *
        * ==>setting the details of where you want the button to go
        * buttonDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        *buttonDetails.addRule(RelativeLayout.CENTER_VERTICAL);
        *
        * ==>BUTTON (setting text and color and id)
        * Button myButton = new Button(this);
        * myButton.setText("Click Me Hoss");
        * myButton.setBackgroundColor(Color.GREEN);
        * myButton.setId("mainButton");
        *
        * ==>ADDING PARAMETERS TO THE LAYOUT TO ADD TO THE EDitText THE POSITION IT
        * RelativeLayout.layoutParams usernameDetails = new RelativeLayout.layoutParams(
        *       RelativeLayout.layoutParams.WRAP_CONTENT,
        *       RelativeLayout.layoutParams.WRAP_CONTENT
        * );
        *
        * ==>gives details of where I want the textView
        * usernameDetails.addRule(RelativeLayout.ABOVE, myButton.getId());
        * usernameDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        * usernameDetails.setMargins(0,0,0,40);
        *
        * ==>adding an edittext (giving it an id)
        * EditText username = new EditText(this);
        * username.setId("usernameInput");
        *
        * ==>CONVERTING DP TO PIXELS TO WIDEN THE EDITTEXTVIEW
        * Resources r = getResources();
        * int pixels = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 320, r.getDisplayMatrics());
        *
        * ==>SETS THE WIDTH OF THE EDITTEXT (method only excepts pixels)
        * username.setWidth(pixels);
        *
        * ==>ADDING BUTTON TO THE LAYOUT and adds the parameters to the button to position it
        * BuckysLayout.addView(myButton, buttonDatails);
        *
        * ==>adding edittext to the layout and adds the parameters to position it
        * BuckysLayout.addView(username, usernameDetails);
        *
        * ==>SETTING THE SCREEN TO THE LAYOUT JUST CREATED
        * setContentView(BuckysLayout);
        *
        * */
        //---------------------------------------------------------------------------------
    }

    //Log shows when this state is going to happen
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart");
    }

    //Log shows when this state is going to happen
    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop");
    }

    //Log shows when this state is going to happen
    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause");
    }

    //Log shows when this state is going to happen
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart");
    }

    //Log shows when this state is going to happen
    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume");
    }

    //Log shows when this state is going to happen
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy");
    }

    //Log shows when this state is going to happen
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(TAG, "onRestoreInstancedState");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
