package bh.ahlia.edu.formvalid;



import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {


    private EditText tID;
    private EditText tname;
    private EditText tAdd;
    private EditText tTel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tID = (EditText) findViewById(R.id.txt_ID);
        tname = (EditText) findViewById(R.id.txt_name);
        tAdd =  (EditText) findViewById(R.id.txt_address);
        tTel = (EditText) findViewById(R.id.txt_tel);





    }

    public void submit(View view) {

        if ((tID.getText().length()==0)||(tname.getText().length()==0
             ||  (tAdd.getText().length()==0) || (tTel.getText().length()==0))){
            Toast.makeText(this, "please  write in form", Toast.LENGTH_SHORT).show();
        }

    }


    public void reset(View view) {
        tID.setText("");
        tname.setText("");
        tAdd.setText("");
        tTel.setText("");
    }
}
