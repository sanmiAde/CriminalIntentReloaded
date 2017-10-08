package com.sanmiaderibigbe.criminalintentreloaded;

import android.support.v4.app.Fragment;

import com.sanmiaderibigbe.criminalintentreloaded.CrimeFragment;
import com.sanmiaderibigbe.criminalintentreloaded.SingleFragmentActivity;

/**
 * Created by oluwasanmi on 10/7/17.
 */

public class CrimeListActivity extends SingleFragmentActivity
{
    @Override
    protected Fragment createFragment()
    {
        return new CrimeListFragment();
    }
}
