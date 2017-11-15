package bd.ac.seu.lovecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void handleCalculateLove(View view) {
        EditText yourNameField = (EditText) findViewById(R.id.yourNameField);
        EditText yourGoatNameField = (EditText) findViewById(R.id.yourGoatNameField);
        TextView loveLabel = (TextView) findViewById(R.id.loveLabel);

        int countMatch = 0;
        String yourName  = yourNameField.getText().toString().toLowerCase();
        String goatName = yourGoatNameField.getText().toString().toLowerCase();

        for (int i = 0; i < yourName.length(); i++)
            for (int j = 0; j < goatName.length(); j++)
                if (yourName.charAt(i) == goatName.charAt(j))
                    countMatch++;
        double lovePercentage = ((double) countMatch) / (yourName.length() + goatName.length()) * 100;
        String formattedText = String.format("Your love for your goat is %.2f%%", lovePercentage);
        loveLabel.setText(formattedText);
        System.out.println(formattedText);
    }
}
