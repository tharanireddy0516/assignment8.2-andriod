package com.example.tharani.customlistview;
/*import is libraries imported for writing the code
* AppCompatActivity is base class for activities
* Bundle handles the orientation of the activity
*/

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {
     /*onCreate is the first method in the life cycle of an activity
    savedInstance passes data to super class,data is pull to store state of application
  * setContentView is used to set layout for the activity
  *R is a resource and it is auto generate file
  * activity_main assign an integer value*/
    // declaring variables
    ListView myView;

    //creating arrays for name and numbers
    public static String[]name={"Tharani","Bhavitha","Balachandher","Manishanthan",
            "Anusha","Raju","Deepa","Viveka"};
    public static String[]number={"7447708327","870008781","9654113690","7421004821",
            "8470113366","9532666662","8287277772","7646465456"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // creating MyListAdapter and passing context and arrays
        MyListAdapter adapter=new MyListAdapter(this,name,number);
        myView = findViewById(R.id.listView);
        myView.setAdapter(adapter);
        // in here creating a setOnItemClickListener
        myView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                 /*toast is a short pop-up messages that show for a second or two and then fade away
                int LENGTH_LONG Show the view or text notification for a short period of toast*/
                Toast.makeText(MainActivity.this,"Contact with "+name[position],Toast.LENGTH_LONG).show();
            }
        });

    }

}


