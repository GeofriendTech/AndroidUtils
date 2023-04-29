package in.geofriend.androidutils.socialshare;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import in.geofriend.androidutils.R;
import in.geofriend.socialshare.SocialShare;

public class SocialShareDemoActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social_share);
        final SocialShare socialShare = new SocialShare(this);
        findViewById(R.id.btn_social_share).setOnClickListener(v -> socialShare.launchSocialShareDialog("text"));
    }
}
