package pens.lab.app.belajaractivity.modul.profile;

import android.content.Intent;

/**
 * Created by fahrul on 13/03/19.
 */

public class ProfilePresenter implements ProfileContract.Presenter{
    private final ProfileContract.View view;



    public ProfilePresenter(ProfileContract.View view) {
        this.view = view;
    }

    @Override
    public void start() {}

//    @Override
//    public void performLogin(final String email, final String password){
//        //proses login
//        //if login success call redirect to profile
//        view.redirectToProfile();
//    }

    @Override
    public String[] getValueIntent(Intent intent) {
        String[] value = new String[2];

        //value 0 adalah username value 1 adalah password
        value[0] = intent.getStringExtra("username");
        value[1] = intent.getStringExtra("password");

        return value;
    }


}
