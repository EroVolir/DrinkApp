package com.example.android.coffeeapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    private CoffeeOrder anOrder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        anOrder = new CoffeeOrder(2);
    }

    public void minusCoffee(View view){
        anOrder.removeCoffee();
        int number = anOrder.getNumberOfCoffee();
        display(number);
    }

    public void plusCoffee(View view){
        anOrder.addCoffee();
        int number = anOrder.getNumberOfCoffee();
        display(number);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {

        displayPrice(anOrder.orderPrice());
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.text_view_number);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(double number) {
        TextView priceTextView = (TextView) findViewById(R.id.text_view_result);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

}
