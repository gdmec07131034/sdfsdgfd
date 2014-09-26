package cn.edu.gdmec.s07131034.newspace;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.*;

public class Newspace extends Activity {
	private TextView textView2;
	private EditText editText1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newspace);
        TextView textView2 = (TextView)findViewById(R.id.textView2);
        EditText editText1 = (EditText)findViewById(R.id.editText1);
         textView2.setText("”√ªß√˚£∫");
         editText1.setText("≈ÀŒ∞Ω‹");


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.newspace, menu);
        return true;
    }
    
}
