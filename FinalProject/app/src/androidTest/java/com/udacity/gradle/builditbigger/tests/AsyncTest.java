package com.udacity.gradle.builditbigger.tests;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.test.AndroidTestCase;
import android.util.Pair;

import com.udacity.gradle.builditbigger.RetrieveJokesTask;

import org.junit.Test;

import java.util.concurrent.ExecutionException;

/**
 * Created by sushant on 4/4/17.
 */

public class AsyncTest extends AndroidTestCase {
    @Test
    public void test_async() throws ExecutionException, InterruptedException {
        String hello = new RetrieveJokesTask().execute(new Pair<Context, String>(InstrumentationRegistry.getContext(),"doesn't matter")).get();
        String to_compare = "Can a kangaroo jump higher than a house? Of course, a house doesn’t jump at all.";
        assertEquals(to_compare,hello);
    }
}
