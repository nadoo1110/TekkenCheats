package com.example.android.tekkencheats.data;

import android.provider.BaseColumns;


public class CheatsContract {
    public static final class CheatList implements BaseColumns{

        public static final String TABLE_NAME = "CheatSheet";
        public static final String CHEAT_CATEGORY = "CheatCategory";
        public static final String CHEAT_NAME = "cheatName";
        public static final String CHEAT_DESCRIPTION = "cheatDescription";

    }
}
