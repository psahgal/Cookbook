package com.cookbook;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CookbookActivity extends Activity {	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
    Button SelectRecipe = (Button) findViewById(R.id.SelectRecipe);
    Button Options = (Button) findViewById(R.id.Options);
    Button FindRecipes = (Button) findViewById(R.id.findRecipes);
    
    final Intent ToRecipeSelection = new Intent(this, RecipeSelectionActivity.class);
	final Intent ToOptions = new Intent(this, Options.class);
	final Intent ToFindRecipes = new Intent(this, findRecipes.class);
        
    SelectRecipe.setOnClickListener(new View.OnClickListener() {
		public void onClick(View v) {
			/* Go to screen for recipe selection */
			startActivity(ToRecipeSelection);
		}
	});

    Options.setOnClickListener(new View.OnClickListener() {
		public void onClick(View v) {
			/* Go to Options screen */
			startActivity(ToOptions);
		}
	});
    
    FindRecipes.setOnClickListener(new View.OnClickListener() {
		public void onClick(View v) {
			/* Find recipes online */
			startActivity(ToFindRecipes);
		}
	});
        
    }
}