package com.ndt.tchatapp.activities;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.view.View;
import android.widget.Toast;

import androidx.activity.result.ActivityResultCaller;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.firestore.FirebaseFirestore;
import com.ndt.tchatapp.databinding.ActivitySignUpBinding;
import com.ndt.tchatapp.utilities.Constants;
import com.ndt.tchatapp.utilities.PreferenceManager;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.HashMap;

public class assa extends AppCompatActivity {
//    private String encodedImage;
//
//    private PreferenceManager preferenceManager;
//
//    private static final String KEY_COLLECT_USERS = "users";
//    private final SharedPreferences sharedPreferences;
//    public PreferenceManager(Context context){
//        sharedPreferences= context.getSharedPreferences(Constants.KEY_PREFERENCE_NAME, Context.MODE_PRIVATE);
//        preferenceManager = new PreferenceManager(getApplicationContext());
//        Intent intent = new Intent(getApplicationContext(), MainActivity::class.java);
//        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK );
//    }
//    public  void putBoolean(String key, Boolean value){
//        SharedPreferences.Editor editor = sharedPreferences.edit();
//        editor.putBoolean(key, value);
//        editor.apply();
//    }
//    public Boolean getBoolean(String key ){
//        return sharedPreferences.getBoolean(key, false);
//
//    }
//    public void putString(String key, String value){
//
//    }
//    public String getString(String key){
//        return sharedPreferences.getString(key, null);
//    }
//    public void clear(){
//SharedPreferences.Editor editor = sharedPreferences.edit();
//editor.clear()
//    }
//
//    private String encodeImage(Bitmap bitmap) {
//        int previewWidth = 150;
//        int previewHeight = 150;
//        Bitmap previewBitmap = Bitmap.createScaledBitmap(bitmap, previewWidth, previewHeight, false);
//        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
//        byte[] bytes = byteArrayOutputStream.toByteArray();
//    }
//
//    private final ActivityResultLauncher<Intent> pickImage = registerForActivityResult(
//            new ActivityResultContracts.StartActivityForResult(), result -> {
//                if (result.getResultCode() == RESULT_OK) {
//                    if (result.getData() != null) {
//                        Uri imageUri = result.getData().getData();
//                        try {
//                            InputStream inputStream = getContentResolver().openInputStream(imageUri);
//                            Bitmap bitmap = BitmapFactory.decodeStream(inputStream);
//                            encodedImage = encodeImage(bitmap);
//                        } catch (FileNotFoundException e) {
//                            e.printStackTrace();
//                        }
//                    }
//                }
//            }
//    )
//
//    private void showToast() {
//        FirebaseFirestore db = FirebaseFirestore.getInstance();
//        HashMap<String, Object> user = new HashMap<>();
//    }
}
