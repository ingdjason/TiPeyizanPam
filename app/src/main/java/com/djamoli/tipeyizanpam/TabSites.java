package com.djamoli.tipeyizanpam;

import android.app.TabActivity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;


public class TabSites extends TabActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_sites);

/** TabHost will have Tabs */
        TabHost tabHost = (TabHost)findViewById(android.R.id.tabhost);

/** TabSpec used to create a new tab.
 * By using TabSpec only we can able to setContent to the tab.
 * By using TabSpec setIndicator() we can set name to tab. */

/** tid1 is firstTabSpec Id. Its used to access outside. */
        TabSpec firstTabSpec = tabHost.newTabSpec("tid1");
        TabSpec secondTabSpec = tabHost.newTabSpec("tid2");
        TabSpec firstsecondTabSpec = tabHost.newTabSpec("tid3");
        TabSpec secondsecondTabSpec = tabHost.newTabSpec("tid4");

/** TabSpec setIndicator() is used to set name for the tab. */
/** TabSpec setContent() is used to set content for a particular tab. */
        firstTabSpec.setIndicator("FWI").setContent(new Intent(this,ActivityFruits.class));
        secondTabSpec.setIndicator("OTEL").setContent(new Intent(this,ActivityHotels.class));
        firstsecondTabSpec.setIndicator("PLAJ").setContent(new Intent(this,ActivityPlages.class));
        secondsecondTabSpec.setIndicator("SIT TOURISTIK").setContent(new Intent(this,ActivitySites.class));

/** Add tabSpec to the TabHost to display. */
        tabHost.addTab(secondsecondTabSpec);
        tabHost.addTab(firstsecondTabSpec);
        tabHost.addTab(secondTabSpec);
        tabHost.addTab(firstTabSpec);

    }
}
