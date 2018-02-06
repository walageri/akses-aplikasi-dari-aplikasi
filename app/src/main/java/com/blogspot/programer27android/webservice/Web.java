package com.blogspot.programer27android.webservice;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;


public class Web extends AppCompatActivity {
    Context c;
    Intent intent;
CardView fb,twitter,instagram,path,wa,telegram;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        fb=findViewById(R.id.fb);
        twitter=findViewById(R.id.twitter);
        instagram=findViewById(R.id.instagram);
        path=findViewById(R.id.path);
        wa=findViewById(R.id.WA);
        telegram=findViewById(R.id.telegram);
        onClickCardView();
        //openTelegram();
        //openWA();
        //openTwitter();
        //openInstagram();
        //Intent facebook=openFacebook(Web.this);
        //startActivity(facebook);

    }
    public void onClickCardView(){
        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFacebook();
            }
        });
        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTwitter();
            }
        });
        instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openInstagram();
            }
        });
        path.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPath();
            }
        });
        wa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWA();
            }
        });
        telegram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTelegram();
            }
        });
    }

    public void openPath() {

            startActivity(new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://path.com/profil/1Gxs2u")));
    }
    //sudah benar
    public void openTelegram() {
        Uri uri = Uri.parse("https://t.me/joinchat/Ge4zXkXXM38EIrIK9rU6tA");
        Intent tele = new Intent(Intent.ACTION_VIEW, uri);
        tele.setPackage("org.telegram.messenger");
        try {
            startActivity(tele);
        } catch (ActivityNotFoundException e) {
            startActivity(new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://web.telegram.org/#/im?p=s1171731327_18104478673920306989")));
        }
    }
    //sudah benar
    public void openWA() {
        Uri uri = Uri.parse("https://chat.whatsapp.com");
        Intent WA = new Intent(Intent.ACTION_VIEW, uri);
        WA.setPackage("com.whatapps");
        try {
            startActivity(WA);
        } catch (ActivityNotFoundException e) {
            startActivity(new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://chat.whatsapp.com")));
        }
    }
    //sudah benar
    public void openTwitter() {
//        Intent inUrl=new Intent(Intent.ACTION_VIEW);
//        inUrl.setData(Uri.parse("http://twitter.com/_u/ikalpitu7"));
//        startActivity(inUrl);
//        Uri uri = Uri.parse("http://twitter.com/_u/ikalpitu7");
//        Intent likeIng = new Intent(Intent.ACTION_VIEW, uri);
//        likeIng.setPackage("com.twitter.android");
//        startActivity(likeIng);
//        try {
//            startActivity(likeIng);
//        } catch (ActivityNotFoundException e) {
            startActivity(new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.twitter.com/ikalpitu7")));
//        }
    }
    //sudah benar
    public void openInstagram() {
        Uri uri = Uri.parse("http://instagram.com/_u/ikalpitu7");
        Intent likeIng = new Intent(Intent.ACTION_VIEW, uri);
        likeIng.setPackage("com.instagram.android");
        try {
            startActivity(likeIng);
        } catch (ActivityNotFoundException e) {
            startActivity(new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.instgram.com/ikalpitu7")));
        }

        //berhasil
        //String name="ikalpitu7";
//        try {
//            Intent intent = new Intent(Intent.ACTION_VIEW);
//            intent.setData(Uri.parse("http://instagram.com/_u/" + name));
//            intent.setPackage("com.instagram.android");
//            startActivity(intent);
//        }
//        catch (android.content.ActivityNotFoundException anfe)
//        {
//            startActivity(new Intent(Intent.ACTION_VIEW,
//                    Uri.parse("https://www.instagram.com/" +name)));
//        }
    }
    //sudah benar
    public void openFacebook() {
        Uri uri = Uri.parse("https://www.facebook.com/groups/sltpn1pituruh");
        Intent likeIng = new Intent(Intent.ACTION_VIEW, uri);
        likeIng.setPackage("com.facebook.katana");
        try {
            startActivity(likeIng);
        } catch (ActivityNotFoundException e) {
            startActivity(new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.facebook.com/groups/sltpn1pituruh")));
        }
    }
    //sudah benar tapi cara agak rumit
    public Intent openFacebook(Web web) {
        try {
            c.getPackageManager().getPackageArchiveInfo("com.facebook.katana", 0);
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.facebook.com/groups/sltpn1pituruh"));
        } catch (Exception e) {
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.facebook.com/groups/sltpn1pituruh")
            );
        }
    }

    private void testoOpen() {
        //berhasil
        //String name="ikalpitu7";
//        try {
//            Intent intent = new Intent(Intent.ACTION_VIEW);
//            intent.setData(Uri.parse("http://instagram.com/_u/" + name));
//            intent.setPackage("com.instagram.android");
//            startActivity(intent);
//        }
//        catch (android.content.ActivityNotFoundException anfe)
//        {
//            startActivity(new Intent(Intent.ACTION_VIEW,
//                    Uri.parse("https://www.instagram.com/" +name)));
//        }

        //berhasil
//        Uri uri = Uri.parse("http://instagram.com/_u/ikalpitu7");
//        Intent likeIng = new Intent(Intent.ACTION_VIEW, uri);
//        likeIng.setPackage("com.instagram.android");
//        try {
//            startActivity(likeIng);
//        } catch (ActivityNotFoundException e) {
//            startActivity(new Intent(Intent.ACTION_VIEW,
//                    Uri.parse("https://www.instgram.com/ikalpitu7")));
//        }

        //hanya masuk web
//        try{
//            c.getPackageManager().getPackageArchiveInfo("com.instagram.android",0);
//            return new Intent(Intent.ACTION_VIEW,
//                    Uri.parse("https://www.instgram.com/ikalpitu7"));
//        }catch (Exception e){
//            return new Intent(Intent.ACTION_VIEW,
//                    Uri.parse("https://www.instgram.com/ikalpitu7")
//            );
//        }
        //gagal
//        Intent instaintent = c.getPackageManager().getLaunchIntentForPackage("com.instagram.android");
//        instaintent.setComponent(new ComponentName( "com.instagram.android", "com.instagram.android.activity.UrlHandlerActivity"));
//        instaintent.setData( Uri.parse( "https://www.instagram.com/_u/bitter_truth_lol") );
//        startActivity(instaintent);

        //gagal akses appnamun masuk web
//        String scheme = "http://instagram.com/_u/USER";
//        String path = "https://instagram.com/USER";
//        String nomPackageInfo ="com.instagram.android";
//        try {
//            c.getPackageManager().getPackageInfo(nomPackageInfo, 0);
//            intent = new Intent(Intent.ACTION_VIEW, Uri.parse(scheme));
//        } catch (Exception e) {
//            intent = new Intent(Intent.ACTION_VIEW, Uri.parse(path));
//        }
//        c.startActivity(intent);

        //belum diuji
//        Uri uri = Uri.parse("http://instagram.com/_u/xxx");
//        Intent insta = new Intent(Intent.ACTION_VIEW, uri);
//        insta.setPackage("com.instagram.android");
//        if (isIntentAvailable(c, insta)){
//            startActivity(insta);
//        } else{
//            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://instagram.com/xxx")));
//        }
//        private boolean isIntentAvailable(Context ctx, Intent intent) {
//            final PackageManager packageManager = ctx.getPackageManager();
//            List<ResolveInfo> list = packageManager.queryIntentActivities(intent, PackageManager.MATCH_DEFAULT_ONLY);
//            return list.size() > 0;
//        }

    }
    //send message
//    try{
//        Intent intent = new Intent(Intent.ACTION_SEND);
//        intent.putExtra(Intent.EXTRA_TEXT, "this is a tweet");
//        intent.setType("text/plain");
//        final PackageManager pm = getPackageManager();
//        final List<?> activityList = pm.queryIntentActivities(intent, 0);
//        int len =  activityList.size();
//        for (int i = 0; i < len; i++) {
//            final ResolveInfo app = (ResolveInfo) activityList.get(i);
//            if ("com.twitter.android.PostActivity".equals(app.activityInfo.name)) {
//                final ActivityInfo activity=app.activityInfo;
//                final ComponentName name=new ComponentName(activity.applicationInfo.packageName, activity.name);
//                intent.addCategory(Intent.CATEGORY_LAUNCHER);
//                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_RESET_TASK_IF_NEEDED);
//                intent.setComponent(name);
//                startActivity(intent);
//                break;
//            }
//        }
//    }
//    catch(final ActivityNotFoundException e) {
//        Log.i("twitter", "no twitter native",e );
//    }
}
