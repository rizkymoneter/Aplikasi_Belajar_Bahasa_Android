package com.example.belajarbahasa;


import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import com.example.belajarbahasa.Hewan.HewanActivity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class HewanActivityTest {

    @Rule
    public ActivityTestRule<HewanActivity> mActivityTestRule = new ActivityTestRule<>(HewanActivity.class);

    @Test
    public void hewanActivityTest() {
    }
}
