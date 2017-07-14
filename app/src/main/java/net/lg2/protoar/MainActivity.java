package net.lg2.protoar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import net.lg2.protoar.camerapreview.CameraPreviewActivity;
import net.lg2.protoar.colorblob.ColorBlobDetectionActivity;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button blobButton = (Button) findViewById(R.id.blob_button);
        blobButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ColorBlobDetectionActivity.class);
                startActivity(intent);
            }
        });

        Button cameraPreviewButton = (Button) findViewById(R.id.camerapreview_button);
        cameraPreviewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CameraPreviewActivity.class);
                startActivity(intent);
            }
        });
    }
}
