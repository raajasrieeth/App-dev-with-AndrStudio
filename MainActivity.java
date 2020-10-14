package com.example.firstappharry;

import androidx.appcompat.app.AppCompatActivity;


import android.util.Log;    // Use is Commented Out
import android.view.View;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;    // To Provide output

public class MainActivity extends AppCompatActivity {

    public void clicking(View view){
//        Log.i("btnLogin","btnSome: This Button has a Message! ");
        EditText rupeeamt = (EditText) findViewById(R.id.amtInr);
        String rupees = rupeeamt.getText().toString();  //Convert the received input to String
        Double finalRupees = Double.parseDouble(rupees);    // Convert the String to Double to apply math Operations

        Double dollar = finalRupees/75;     // Convert the rupees to dollar by dividing with exchange rate (changes Daily!)
        String result = "= " + dollar.toString() + " USD !"; // Convert the final answer to a String to provide output

        Toast.makeText(this, result, Toast.LENGTH_SHORT).show();    // Output

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
