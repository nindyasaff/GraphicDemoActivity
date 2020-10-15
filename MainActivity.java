package com.pend.graphicdemoactivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ImageView ourView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        draw();
        setContentView(ourView);
    }
    public void draw(){
        Bitmap blankBitmap = Bitmap.createBitmap(600, 600, Bitmap.Config.ARGB_8888);
        Canvas canvas;
        canvas = new Canvas(blankBitmap);
        ourView = new ImageView(this);
        ourView.setImageBitmap(blankBitmap);
        Paint paint;
        paint = new Paint();
        canvas.drawColor(Color.argb(255, 255, 255, 255));
        paint.setColor(Color.argb(255,  26, 128, 182));
        Bitmap bitmapbarbie;
        bitmapbarbie = BitmapFactory.decodeResource(this.getResources(), R.drawable.barbie);
        canvas.drawBitmap(bitmapbarbie, 500, 50, paint);
        canvas.drawLine(50,50,250,250,paint);
        canvas.drawText("Barbie Cantik", 50, 50, paint);
        canvas.drawPoint(40,50,paint);
        canvas.drawCircle(350,250,100,paint);
        paint.setColor(Color.argb(255,  249, 129, 0));
        canvas.drawRect(50,450,500,550,paint);
    }
}