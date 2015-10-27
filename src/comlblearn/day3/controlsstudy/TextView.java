package comlblearn.day3.controlsstudy;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class TextView extends Activity
{
    String[] books = new String[] {"book1", "book2", "book3", "book4"};
    
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);
        ArrayAdapter<String> aa = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, books);
        AutoCompleteTextView auto = (AutoCompleteTextView)findViewById(R.id.auto);
        auto.setAdapter(aa);
    }
}
