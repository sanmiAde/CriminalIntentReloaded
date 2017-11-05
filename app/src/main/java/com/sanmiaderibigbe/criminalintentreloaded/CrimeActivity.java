package com.sanmiaderibigbe.criminalintentreloaded;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

import java.util.UUID;

public class CrimeActivity extends SingleFragmentActivity
{
    private final static String CRIME_ID_EXTRA = "com.android.bignerdranch.criminalintentreloaded.crime_id.extra";

    @Override
    protected Fragment createFragment()
    {
        UUID crime_id = ((UUID) getIntent().getSerializableExtra(CRIME_ID_EXTRA));
        return CrimeFragment.newInstance(crime_id);
    }

    public static Intent newIntent(Context packageContext, UUID id)
    {
        Intent intent = new Intent(packageContext, CrimeActivity.class);
        intent.putExtra(CRIME_ID_EXTRA, id);

        return intent;
    }
}
