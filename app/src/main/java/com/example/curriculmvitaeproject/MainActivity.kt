package com.example.curriculmvitaeproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import android.util.Patterns.EMAIL_ADDRESS



class MainActivity : AppCompatActivity() {

    private lateinit var imageView : ImageView;
    private lateinit var name : EditText;
    private lateinit var age : EditText;
    private lateinit var mail : EditText
    private lateinit var gender : RadioGroup;
    private lateinit var homme : RadioButton;
    private lateinit var femme : RadioButton
    private lateinit var seekBar_android : SeekBar;
    private lateinit var seekBar_iOS : SeekBar;
    private lateinit var seekBar_Flutter : SeekBar;
    private lateinit var btn_next : Button;
    private lateinit var btn_reset : Button;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.linear_layout_compat)

        imageView=findViewById(R.id.imageView)
        name=findViewById(R.id.name);
        age=findViewById(R.id.age);
        mail=findViewById(R.id.mail)
        gender=findViewById(R.id.gender);
        homme=findViewById(R.id.homme);
        femme=findViewById(R.id.femme)
        seekBar_android=findViewById(R.id.seekBar_android);
        seekBar_iOS=findViewById(R.id.seekBar_iOS);
        seekBar_Flutter=findViewById(R.id.seekBar_Flutter)
        btn_next=findViewById(R.id.btn_next);
        btn_reset=findViewById(R.id.btn_reset)


    }

}