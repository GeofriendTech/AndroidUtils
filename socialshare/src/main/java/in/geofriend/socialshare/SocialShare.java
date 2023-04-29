package in.geofriend.socialshare;

import android.content.Context;
import android.content.Intent;

public class SocialShare {

    private Context context;

    public SocialShare(Context context) {
        this.context = context;
    }

    public void launchSocialShareDialog(String text) {
        Intent sendIntent = new Intent(Intent.ACTION_SEND);
        sendIntent.setType("image/jpeg"); // might be text, sound, whatever
        sendIntent.putExtra(Intent.EXTRA_TEXT, text);
        Intent shareIntent = Intent.createChooser(sendIntent, null);
        context.startActivity(shareIntent);

    }

}
