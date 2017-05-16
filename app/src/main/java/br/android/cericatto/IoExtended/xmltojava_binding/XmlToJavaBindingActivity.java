package br.android.cericatto.IoExtended.xmltojava_binding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import br.android.cericatto.IoExtended.R;
import br.android.cericatto.IoExtended.databinding.ActivityXmltojavaWithBinding;

/**
 * XmlToJavaBindingActivity.java.
 *
 * @author Rodrigo Cericatto
 * @since May 10, 2017
 */
public class XmlToJavaBindingActivity extends AppCompatActivity {
    private ActivityXmltojavaWithBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_xmltojava_with);
        setLayout();
    }

    public void setLayout() {
        mBinding.idActivityXmltojavaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textTyped = mBinding
                .idActivityXmltojavaEditText.getText().toString();
                if ((textTyped != null) && (textTyped.length() > 0) && (!textTyped.equals(""))) {
                    mBinding.idActivityXmltojavaTextView.setText(textTyped);
                } else {
                    Toast.makeText(XmlToJavaBindingActivity.this, getString(R.string.type_text), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}