/*
 * Expo brownfield demo: hosts the Expo React Native screen via expo-brownfield's
 * BrownfieldActivity. The React Native runtime and JS bundle ship inside the
 * dev.expo.brownfield:expobrownfield-fused-release AAR.
 */
package eu.faircode.email;

import android.os.Bundle;

import androidx.annotation.Nullable;

import java.util.Collections;

import dev.expo.brownfield.BrownfieldActivity;

public class ExpoActivity extends BrownfieldActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        showReactNativeFragment("main", Collections.emptyList());
    }
}
