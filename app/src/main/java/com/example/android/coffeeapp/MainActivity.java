package com.example.android.coffeeapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    private Order anOrder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        anOrder = new Order(2);
    }
    private float _tips = 0;


    public void plusDrink(View view){
        anOrder.addDrink();
        int number = anOrder.getNumberOfCoffee();
    }
    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {

        displayPrice(anOrder.orderPrice());
    }

    public void cancelOrder(View view){
        while(anOrder.getNumberOfCoffee()!=0)
        {
            anOrder.removeDrink();
        }
        displayPrice(anOrder.orderPrice());
    }
    /**
     * This method displays the given quantity value on the screen.
     */

    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(double number) {
        TextView priceTextView = (TextView) findViewById(R.id.text_view_result);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

}
