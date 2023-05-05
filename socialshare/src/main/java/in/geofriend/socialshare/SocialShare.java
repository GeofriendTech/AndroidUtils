package in.geofriend.socialshare;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

import java.io.File;
import java.net.URLConnection;

public class SocialShare {

    private Context context;

    public SocialShare(Context context) {
        this.context = context;
    }

    /**
     *
     * @param file file tp be shared
     * @param subject sharing file subject
     * @param fileDescription sharing file description
     */
    public void launchSocialShareDialog(File file, String subject, String fileDescription) {
        Intent intentShareFile = new Intent(Intent.ACTION_SEND);

        intentShareFile.setType(URLConnection.guessContentTypeFromName(file.getName()));
        intentShareFile.putExtra(Intent.EXTRA_STREAM,
                Uri.parse("file://"+file.getAbsolutePath()));

        if(subject != null && !subject.isEmpty()) {
            intentShareFile.putExtra(Intent.EXTRA_SUBJECT, subject);
        }

        if(fileDescription != null && !fileDescription.isEmpty()) {
            intentShareFile.putExtra(Intent.EXTRA_TEXT, fileDescription);
        }

        context.startActivity(Intent.createChooser(intentShareFile, "Share File"));

    }

}
