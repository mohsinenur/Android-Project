package bd.ac.seu.my.hangman;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {
    private char targetWord[] = {'S', 'O', 'M', 'E', 'O', 'N', 'E'};
    private char currentWord[];
    private ArrayList<String> words;

    private void generateWords() {
        words = new ArrayList<>();
        words.add("HELLO");
        words.add("SOMEONE");
        words.add("NOBODY");
        words.add("SOMEBODY");
        words.add("CRICKET");
        words.add("FOOTBALL");
        Collections.shuffle(words);
        String firstWord = words.get(0);
        targetWord = new char[firstWord.length()];
        for (int i = 0; i < targetWord.length; i++)
            targetWord[i] = firstWord.charAt(i);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        generateWords();
        currentWord = new char[targetWord.length];
        for (int i = 0; i < currentWord.length; i++)
            currentWord[i] = '_';
        displayCurrentWord();
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

    public void handleEClick(View view) {
        for (int i = 0; i < targetWord.length; i++) {
            if (targetWord[i] == 'E')
                currentWord[i] = 'E';
        }

        TextView word = (TextView) findViewById(R.id.word);
        word.setText(new String(currentWord));
    }

    private void displayCurrentWord() {
        TextView word = (TextView) findViewById(R.id.word);
        String displayString = "";
        for (int i = 0; i < currentWord.length; i++) {
            if (i != 0)
                displayString += " ";
            displayString += currentWord[i];
        }
        word.setText(displayString);
    }

    public void handleButtonClick(View view) {
        Button button = (Button) view;
        char buttonText = button.getText().toString().charAt(0);
        System.out.printf("User clicked %c button\n", buttonText);

        for (int i = 0; i < targetWord.length; i++)
            if (targetWord[i] == buttonText)
                currentWord[i] = buttonText;

        displayCurrentWord();
    }
}
