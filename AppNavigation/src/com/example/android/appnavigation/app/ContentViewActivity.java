/*
 * Copyright (C) 2012 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.appnavigation.app;

import com.example.android.appnavigation.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ContentViewActivity extends Activity {
    public static final String EXTRA_TEXT = "com.example.android.appnavigation.EXTRA_TEXT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_view);

        Intent intent = getIntent();
        if (Intent.ACTION_VIEW.equals(intent.getAction())) {
            TextView tv = (TextView) findViewById(R.id.status_text);
            tv.setText("Viewing content from ACTION_VIEW");
        } else if (intent.hasExtra(EXTRA_TEXT)) {
            TextView tv = (TextView) findViewById(R.id.status_text);
            tv.setText(intent.getStringExtra(EXTRA_TEXT));
        }
    }
}
