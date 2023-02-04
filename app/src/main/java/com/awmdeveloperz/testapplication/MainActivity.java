package com.awmdeveloperz.testapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Dialog epicDialog, epicDialog1;
    Button btnPlay, btnPlayAgain;
    TextView titleTv, messageTv;
    ImageView closePopupPositiveImg;
    ImageView ib1,ib2,ib3,ib4,ib5,ib6,ib7,ib8,ib9;
    TextView tvDisplay,tvResults,tvGreet;
    int[] images = {R.drawable.o, R.drawable.cross};
    int value_ib1,value_ib2,value_ib3,value_ib4,value_ib5,value_ib6,value_ib7,value_ib8,value_ib9;
    int win = -1;
    int turn = 0;
    int turn_left = 1;
    String Player1,Player2;
    EditText etPlayer1Name, etPlayer2Name;
    Boolean Played = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        epicDialog = new Dialog(this);
        epicDialog1 = new Dialog(this);
        Player1 = "Player 1";
        Player2 = "Player 2";

        if(!Played){
            ShowPopup();
        }

        ib1 = findViewById(R.id.ib1);
        ib2 = findViewById(R.id.ib2);
        ib3 = findViewById(R.id.ib3);
        ib4 = findViewById(R.id.ib4);
        ib5 = findViewById(R.id.ib5);
        ib6 = findViewById(R.id.ib6);
        ib7 = findViewById(R.id.ib7);
        ib8 = findViewById(R.id.ib8);
        ib9 = findViewById(R.id.ib9);

        tvDisplay = findViewById(R.id.tvDisplay);

        value_ib1 = value_ib2 = value_ib3 = value_ib4 = value_ib5 = value_ib6 = value_ib7 = value_ib8 = value_ib9 = -1;


        ib1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value_ib1 = turn;
                ib1.setImageResource(images[value_ib1]);
                ib1.setClickable(false);
                mainCore();
            }
        });
        ib2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value_ib2 = turn;
                ib2.setImageResource(images[value_ib2]);
                ib2.setClickable(false);
                mainCore();
            }
        });
        ib3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value_ib3 = turn;
                ib3.setImageResource(images[value_ib3]);
                ib3.setClickable(false);
                mainCore();
            }
        });
        ib4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value_ib4 = turn;
                ib4.setImageResource(images[value_ib4]);
                ib4.setClickable(false);
                mainCore();
            }
        });
        ib5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value_ib5 = turn;
                ib5.setImageResource(images[value_ib5]);
                ib5.setClickable(false);
                mainCore();
            }
        });
        ib6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value_ib6 = turn;
                ib6.setImageResource(images[value_ib6]);
                ib6.setClickable(false);
                mainCore();
            }
        });
        ib7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value_ib7 = turn;
                ib7.setImageResource(images[value_ib7]);
                ib7.setClickable(false);
                mainCore();
            }
        });
        ib8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value_ib8 = turn;
                ib8.setImageResource(images[value_ib8]);
                ib8.setClickable(false);
                mainCore();
            }
        });
        ib9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value_ib9 = turn;
                ib9.setImageResource(images[value_ib9]);
                ib9.setClickable(false);
                mainCore();
            }
        });

    }

    protected void mainCore(){
        if((value_ib1 == value_ib2) && (value_ib2 == value_ib3) && (value_ib1 != -1)){
            win = value_ib1;
        }
        else if((value_ib1 == value_ib4) && (value_ib4 == value_ib7) && (value_ib1 != -1)){
            win = value_ib1;
        }
        else if((value_ib1 == value_ib5) && (value_ib5 == value_ib9) && (value_ib1 != -1)){
            win = value_ib1;
        }
        else if((value_ib2 == value_ib5) && (value_ib5 == value_ib8) && (value_ib2 != -1)){
            win = value_ib2;
        }
        else if((value_ib3 == value_ib6) && (value_ib6 == value_ib9) && (value_ib3 != -1)){
            win = value_ib3;
        }
        else if((value_ib3 == value_ib5) && (value_ib5 == value_ib7) && (value_ib3 != -1)){
            win = value_ib3;
        }
        else if((value_ib4 == value_ib5) && (value_ib5 == value_ib6) && (value_ib4 != -1)){
            win = value_ib4;
        }
        else if((value_ib7 == value_ib8) && (value_ib8 == value_ib9) && (value_ib7 != -1)){
            win = value_ib7;
        }

        if(win != -1){
            ib1.setClickable(false);
            ib2.setClickable(false);
            ib3.setClickable(false);
            ib4.setClickable(false);
            ib5.setClickable(false);
            ib6.setClickable(false);
            ib7.setClickable(false);
            ib8.setClickable(false);
            ib9.setClickable(false);
            ShowPopupResults();
        }
        else if(turn_left == 9){
            ShowPopupResults();
        }
        else{
            if(turn == 0){
                tvDisplay.setText(Player2+"'s turn");
                turn = 1;
            }
            else if(turn == 1){
                tvDisplay.setText(Player1+"'s turn");
                turn = 0;
            }
            turn_left++;
        }
    }


    public void ShowPopup(){
        epicDialog.setContentView(R.layout.epic_popup_positive);
        btnPlay = epicDialog.findViewById(R.id.btnPlay);

        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etPlayer1Name = (EditText) epicDialog.findViewById(R.id.etPlayer1Name);
                etPlayer2Name = (EditText) epicDialog.findViewById(R.id.etPlayer2Name);

                if (!TextUtils.isEmpty(etPlayer1Name.getText().toString())){
                    Player1 = etPlayer1Name.getText().toString();
                }
                if (!TextUtils.isEmpty(etPlayer2Name.getText().toString())){
                    Player2 = etPlayer2Name.getText().toString();
                }
                tvDisplay.setText(Player1+"'s turn will have O");
                epicDialog.dismiss();
            }
        });

        epicDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        epicDialog.show();

    }

    public void ShowPopupResults(){
        epicDialog1.setContentView(R.layout.epic_popup_result);
        btnPlayAgain = epicDialog1.findViewById(R.id.btnPlayAgain);
        tvResults = (TextView) epicDialog1.findViewById(R.id.tvResults);
        if(win == 0){
            tvResults.setText(Player1+" wins!");
        }
        else if(win == 1) {
            tvResults.setText(Player2+" wins!");
        }
        else if(turn_left == 9){
            tvResults.setText("Match Draw!!!");
            tvGreet = (TextView) epicDialog1.findViewById(R.id.tvGreet);
            tvGreet.setText("No one Wins...");
        }
        btnPlayAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvDisplay.setText(Player1+"'s turn will have O");
                Played = true;
                Intent intent = getIntent();
                finish();
                startActivity(intent);
                epicDialog.dismiss();
            }
        });

        epicDialog1.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        epicDialog1.show();
    }
}