// Generated by view binder compiler. Do not edit!
package com.boycillz.sqliteapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.boycillz.sqliteapp.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityAddEditBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final MaterialButton btnCancel;

  @NonNull
  public final MaterialButton btnSubmit;

  @NonNull
  public final TextInputLayout textInputLayoutTask;

  @NonNull
  public final TextInputLayout textInputLayoutTask2;

  @NonNull
  public final TextInputEditText txtAddress;

  @NonNull
  public final EditText txtId;

  @NonNull
  public final TextInputEditText txtName;

  private ActivityAddEditBinding(@NonNull LinearLayout rootView, @NonNull MaterialButton btnCancel,
      @NonNull MaterialButton btnSubmit, @NonNull TextInputLayout textInputLayoutTask,
      @NonNull TextInputLayout textInputLayoutTask2, @NonNull TextInputEditText txtAddress,
      @NonNull EditText txtId, @NonNull TextInputEditText txtName) {
    this.rootView = rootView;
    this.btnCancel = btnCancel;
    this.btnSubmit = btnSubmit;
    this.textInputLayoutTask = textInputLayoutTask;
    this.textInputLayoutTask2 = textInputLayoutTask2;
    this.txtAddress = txtAddress;
    this.txtId = txtId;
    this.txtName = txtName;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAddEditBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAddEditBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_add_edit, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAddEditBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_cancel;
      MaterialButton btnCancel = ViewBindings.findChildViewById(rootView, id);
      if (btnCancel == null) {
        break missingId;
      }

      id = R.id.btn_submit;
      MaterialButton btnSubmit = ViewBindings.findChildViewById(rootView, id);
      if (btnSubmit == null) {
        break missingId;
      }

      id = R.id.textInputLayoutTask;
      TextInputLayout textInputLayoutTask = ViewBindings.findChildViewById(rootView, id);
      if (textInputLayoutTask == null) {
        break missingId;
      }

      id = R.id.textInputLayoutTask2;
      TextInputLayout textInputLayoutTask2 = ViewBindings.findChildViewById(rootView, id);
      if (textInputLayoutTask2 == null) {
        break missingId;
      }

      id = R.id.txt_address;
      TextInputEditText txtAddress = ViewBindings.findChildViewById(rootView, id);
      if (txtAddress == null) {
        break missingId;
      }

      id = R.id.txt_id;
      EditText txtId = ViewBindings.findChildViewById(rootView, id);
      if (txtId == null) {
        break missingId;
      }

      id = R.id.txt_name;
      TextInputEditText txtName = ViewBindings.findChildViewById(rootView, id);
      if (txtName == null) {
        break missingId;
      }

      return new ActivityAddEditBinding((LinearLayout) rootView, btnCancel, btnSubmit,
          textInputLayoutTask, textInputLayoutTask2, txtAddress, txtId, txtName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
