<<<<<<< HEAD
package com.neevtech.imageprocessing.paintutils;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;

public class StringPath implements ICanvasCommand {
/*	public Path path;*/
	public Paint paint;
	public char[] text;	
	int start;
	int end;
	float x, y;

	public void draw(Canvas canvas) {		
		canvas.drawText(text, start, end, x, y, paint);
	}

	public void undo() {
		// Todo this would be changed later
	}
=======
package com.neevtech.imageprocessing.paintutils;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;

public class StringPath implements ICanvasCommand {
/*	public Path path;*/
	public Paint paint;
	public char[] text;	
	int start;
	int end;
	float x, y;

	public void draw(Canvas canvas) {		
		canvas.drawText(text, start, end, x, y, paint);
	}

	public void undo() {
		// Todo this would be changed later
	}
>>>>>>> 89fda57b84f3f45b593875cb6cde08a56a510b8d
}