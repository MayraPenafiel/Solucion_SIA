package com.example.subastainversaapp.sqlite;

import android.content.Context;
import androidx.annotation.Nullable;

public class SearchDBHelper extends DBHelper{


    Context context;

    public SearchDBHelper(@Nullable @org.jetbrains.annotations.Nullable Context context) {
        super(context);
        this.context=context;
    }
}
