package iics.francisco.zamueljoseph.comparenumbers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button compButton = (Button) findViewById(R.id.compButton);
        compButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText num1 = (EditText) findViewById(R.id.num1);
                EditText num2 = (EditText) findViewById(R.id.num2);
                TextView result = (TextView) findViewById(R.id.result);

                int n1 = Integer.parseInt(num1.getText().toString());
                int n2 = Integer.parseInt(num2.getText().toString());
                int res = n1 - n2;

                if(res>0){
                    result.setText(n1+" is greater than "+n2+".");
                }else if(res<0){
                    result.setText(n2+" is greater than "+n1+".");
                }else{
                    result.setText(n1+" and "+n2+" are equal.");
                }
            }
        });
    }
}
