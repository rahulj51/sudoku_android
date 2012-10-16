package org.example.sudoku;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;

public class Sudoku extends Activity implements OnClickListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sudoku);
        
        View continueButton = findViewById(R.id.continue_button);
        continueButton.setOnClickListener(this);
        
        View newButton = findViewById(R.id.new_button);
        newButton.setOnClickListener(this);

        View aboutButton = findViewById(R.id.about_button);
        aboutButton.setOnClickListener(this);

        View exitButton = findViewById(R.id.exit_button);
        exitButton.setOnClickListener(this);

        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_sudoku, menu);
        return true;
    }

	public void onClick(View v) {

		switch(v.getId()) {
		
		case R.id.about_button :
			Intent intent = new Intent(this, About.class);
			startActivity(intent);
			break;
		
		}
	}
}
