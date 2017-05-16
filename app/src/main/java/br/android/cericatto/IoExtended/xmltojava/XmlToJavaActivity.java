package br.android.cericatto.IoExtended.xmltojava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import br.android.cericatto.IoExtended.R;

/**
 * XmlToJavaActivity.java.
 *
 * @author Rodrigo Cericatto
 * @since May 10, 2017
 */
public class XmlToJavaActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xmltojava);
        setLayout();
    }

    public void setLayout() {
        final TextView textView = (TextView)findViewById(R.id.id_activity_xmltojava__text_view);
        final EditText editText = (EditText)findViewById(R.id.id_activity_xmltojava__edit_text);

        Button button = (Button)findViewById(R.id.id_activity_xmltojava__button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textTyped = editText.getText().toString();
                if ((textTyped != null) && (textTyped.length() > 0) && (!textTyped.equals(""))) {
                    textView.setText(textTyped);
                } else {
                    Toast.makeText(XmlToJavaActivity.this, getString(R.string.type_text), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}