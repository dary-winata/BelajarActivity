package pens.lab.app.belajaractivity.modul.profile;

import android.content.Intent;
import android.view.View;

import pens.lab.app.belajaractivity.base.BaseFragmentHolderActivity;


public class ProfileActivity extends BaseFragmentHolderActivity {
    ProfileFragment profileFragment;
    private final int UPDATE_REQUEST = 2019;

    @Override
    protected void initializeFragment() {
        initializeView();

        btBack.setVisibility(View.VISIBLE);
        btOptionMenu.setVisibility(View.VISIBLE);
//        ivIcon.setImageResource(R.drawable.....);
        ivIcon.setVisibility(View.VISIBLE);

        Intent intent = getIntent();

        profileFragment = new ProfileFragment(intent);
        setCurrentFragment(profileFragment, false);

    }

}
