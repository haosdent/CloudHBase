package me.haosdent.cloud_base.example;

import afzkl.development.colorpickerview.dialog.ColorPickerDialog;
import afzkl.development.colorpickerview.preference.ColorPickerPreference;
import afzkl.development.colorpickerview.view.ColorPanelView;
import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.preference.PreferenceCategory;
import android.preference.PreferenceFragment;
import android.widget.Toast;

public class ColorActivity extends PreferenceActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    getFragmentManager().beginTransaction()
        .replace(android.R.id.content, new ColorFragment()).commit();
  }

  public static class ColorFragment extends PreferenceFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      addPreferencesFromResource(R.xml.main);
    }

    public void likeColor() {
      likeColor(1);
    }

    public void likeColor(int value) {
      // TODO
    }

    public void addColor(int color) {
      // TODO
    }
  }
}
