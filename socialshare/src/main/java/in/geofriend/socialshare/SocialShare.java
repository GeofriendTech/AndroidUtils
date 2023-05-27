package in.geofriend.socialshare;

import android.content.Context;
import android.content.Intent;
import android.text.Html;

public class SocialShare {

    private final Context context;

    public SocialShare(Context context) {
        this.context = context;
    }

    /**
     *
     * @param data text or html data to be shared
     * @param dataType type of data to be shared
     */
    public void launchSocialShareDialog(String data, DataType dataType) {
        Intent intentShareFile = new Intent(Intent.ACTION_SEND);

        if(DataType.HTML == dataType) {
            intentShareFile.setType("text/html");
        } else if (DataType.TEXT == dataType) {
            intentShareFile.setType("text/plain");
        }
        intentShareFile.putExtra(android.content.Intent.EXTRA_TEXT, Html.fromHtml(data));
        context.startActivity(Intent.createChooser(intentShareFile, "Share File"));

    }

}
