package com.example.wtww;

import android.graphics.Color;

public class ColorPopper {
    private static final String[] color = {
            "#15F698", // blue
            "#D70F97", // pink
            "#99CC00", // green
            "#EE620A", // orange
            "#E91E63", // fuschia
            "#f092b0", // pink
            "#e0ab18", // mustard
    };

    public static int pickColor(){
        int num = (int) (Math.random()*color.length);
        int colorNum = Color.parseColor(color[num]);
        return colorNum;
    }
}