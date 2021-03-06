package com.github.satoshun.truth.android.api;

import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.github.satoshun.truth.android.api.view.EditTextSubject;
import com.github.satoshun.truth.android.api.view.TextViewSubject;
import com.github.satoshun.truth.android.api.view.ViewGroupSubject;
import com.github.satoshun.truth.android.api.view.ViewSubject;
import com.github.satoshun.truth.android.api.widget.AbsListViewSubject;
import com.github.satoshun.truth.android.api.widget.AdapterViewSubject;
import com.github.satoshun.truth.android.api.widget.ListViewSubject;
import com.google.common.truth.Truth;

public class TruthAndroid {
  public static ViewSubject assertThat(View target) {
    return Truth.assertAbout(ViewSubject.FACTORY).that(target);
  }

  public static TextViewSubject assertThat(TextView target) {
    return Truth.assertAbout(TextViewSubject.FACTORY).that(target);
  }

  public static EditTextSubject assertThat(EditText target) {
    return Truth.assertAbout(EditTextSubject.FACTORY).that(target);
  }

  public static ViewGroupSubject assertThat(ViewGroup target) {
    return Truth.assertAbout(ViewGroupSubject.FACTORY).that(target);
  }

  public static <T extends Adapter> AdapterViewSubject assertThat(AdapterView<T> target) {
    return Truth.assertAbout(AdapterViewSubject.FACTORY).that(target);
  }

  public static AbsListViewSubject assertThat(AbsListView target) {
    return Truth.assertAbout(AbsListViewSubject.FACTORY).that(target);
  }

  public static ListViewSubject assertThat(ListView target) {
    return Truth.assertAbout(ListViewSubject.FACTORY).that(target);
  }
}
