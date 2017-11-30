package com.example.tharani.customlistview;
/*import is libraries imported for writing the code
* AppCompatActivity is base class for activities
* Bundle handles the orientation of the activity
*/

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


public class MyListAdapter extends ArrayAdapter<String>{
     /*onCreate is the first method in the life cycle of an activity
    savedInstance passes data to super class,data is pull to store state of application
  * setContentView is used to set layout for the activity
  *R is a resource and it is auto generate file
  * activity_main assign an integer value*/

    //declaring variables
    private final Activity context;
    private final String[] name;
    private final String[] number;

    /**
     * and in creating a constructor of MyListAdapter and passing requirements values
     * and in super class passing context, list_view layout xml and name
     */
      /*An adapter is a device that allows a specific type of hardware to work with another device that would otherwise be incompatible*/
    public MyListAdapter(Activity context, String[] name, String[] number) {
        super(context, R.layout.list_view_contacts,name);
        // initializing the values
        this.context = context;
        this.name = name;
        this.number = number;
    }


    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // using LayoutInflater to fill layouts
        LayoutInflater inflater=context.getLayoutInflater();
       // inflater means that it will be rendered by creating view object in memory
        //LayoutInflater is used to manipulate Android screen using predefined XML layouts
        View rowView=inflater.inflate(R.layout.list_view_contacts,null,true);
        TextView txtName= rowView.findViewById(R.id.textView_name);
        TextView txtContacts= rowView.findViewById(R.id.textView_number);
        txtName.setText(name[position]);//sets name position
        txtContacts.setText(number[position]);//sets number position
        return rowView;//returns rowView
    }
}
