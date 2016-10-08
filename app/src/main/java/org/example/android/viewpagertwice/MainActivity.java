package org.example.android.viewpagertwice;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;

public class MainActivity extends FragmentActivity {
    private ViewPager mViewPager;
    private PagerAdapter mPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mViewPager=(ViewPager)findViewById(R.id.pager);
        mPager=new SliderAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(mPager);
    }

    public class SliderAdapter extends FragmentStatePagerAdapter {

        public SliderAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public int getCount() {
            return 2;
        }

        @Override
        public Fragment getItem(int position) {
            Log.d("working","check");
            if(position==0){
                return new SecondFragment();
            }else{
                return new ThirdFragment();
            }
        }
    }
}
