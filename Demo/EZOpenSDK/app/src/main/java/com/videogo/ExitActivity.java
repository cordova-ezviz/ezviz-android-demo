package com.videogo;

import java.util.LinkedList;
import java.util.List;

import android.app.Activity;

/**
 * Created by fx on 17-11-30.
 */

public class ExitActivity {
    //运用list来保存们每一个activity是关键
    private List<Activity> mList = new LinkedList<Activity>();

    //为了实现每次使用该类时不创建新的对象而创建的静态对象
    private static ExitActivity instance;
    //构造方法
    private ExitActivity(){}
    //实例化一次
    public synchronized static ExitActivity getInstance(){
        if (null == instance) {
            instance = new ExitActivity();
        }
        return instance;
    }

    public void addActivity(Activity activity) {
        mList.add(activity);
    }
    //关闭每一个list内的activity
    public void activityExit() {
        try {
            for (Activity activity:mList) {
                if (activity != null)
                    activity.finish();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            mList = new LinkedList<Activity>();
//            System.exit(0);
        }
    }
}
