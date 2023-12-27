package com.example.hw1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public int cake = 10;
    public float cakeDiscount = 26;
    public int cream = 14;
    public float creamDiscount = 5;
    public int fruits = 3;
    public float fruitsDiscount = 12;
    public int nuts = 5;
    public float nutsDiscount = 55;
    public int berries = 7;

    public int account = 45;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView outputText =findViewById(R.id.outputText);
        float sum = (cake * (100 - cakeDiscount)
                + cream * (100 - creamDiscount)
                + fruits * (100 - fruitsDiscount)
                + nuts * (100 - nutsDiscount)) / 100 + berries;

        if (sum > account) {
            outputText.setText("Не хватит денег");
            return;
        }

        outputText.setText("Денег хватит\n" + "Остаток: " + (account - sum) + " монет.");
    }
}