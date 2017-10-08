package com.sanmiaderibigbe.criminalintentreloaded;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by oluwasanmi on 10/7/17.
 */

public class CrimeLab
{

    private static CrimeLab sCrimeLab;
    private List<Crime> mCrimes;

    private CrimeLab(Context context)
    {
        mCrimes = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Crime crime = new Crime();
            crime.setTitle("Crime #" + i);
            crime.setSolved(i % 2 == 0); // Every otherone
            mCrimes.add(crime);
        }

    }

    public static CrimeLab getCrimeLab(Context context)
    {
        if(sCrimeLab == null)
        {
            sCrimeLab = new CrimeLab(context);
        }

        return sCrimeLab;
    }

    public List<Crime> getCrimes()
    {
        return mCrimes;
    }

    public Crime getCrime(UUID id)
    {
        for (Crime crime : mCrimes)
        {
            if ( crime.getID().equals(id))
            {
                return  crime;
            }
        }
        return  null;
    }

}
