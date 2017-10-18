package com.androidstudy.networkmanager.livedata;

import android.arch.lifecycle.LiveData;

import com.androidstudy.networkmanager.Monitor;
import com.androidstudy.networkmanager.Status;

/**
 * Created by chweya on 10/10/17.
 */

public abstract class LiveDataMonitor implements Monitor {
    protected LiveData<Status> status;
}
