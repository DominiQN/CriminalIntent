package com.example.dominiqn.criminalintent;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;

import java.util.UUID;

// 코드의 독립성이 Activity와 Fragment 모두에게 필요한 것은 아니다.
// Activity는 Fragment에 관해 많은 것을 알아야 한다.
// ex) CrimeFragment가 newInstance(UUID)를 갖고 있다.
// 반면 프래그먼트들은 자신들의 호스팅 Activity를 자세히 알 필요가 없다. (재사용성)
@Deprecated
public class CrimeActivity extends SingleFragmentActivity {

    private static final String EXTRA_CRIME_ID =
            "com.example.dominiqn.criminalintent.crime_id";

    @Override
    protected Fragment createFragment() {
        UUID crimeId = (UUID) getIntent().getSerializableExtra(EXTRA_CRIME_ID);

        return CrimeFragment.newInstance(crimeId);
    }

    public static Intent newIntent(Context packageContext, UUID crimeId) {
        Intent i = new Intent(packageContext, CrimeActivity.class);
        i.putExtra(EXTRA_CRIME_ID, crimeId);

        return i;
    }
}
