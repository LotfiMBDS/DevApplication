package android.tp.unice.yoann.poncet.devapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

import org.w3c.dom.Text;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Button register = (Button)findViewById(R.id.button);
        register.setOnClickListener(this);
    }

    @SuppressLint("WrongViewCast")
    @Override
    public void onClick(View v)
    {
        Text nom;
        Text prenom;
        Text email;
        Text mdp;
        Text mpdConfirm;
        Text telephone;
        RadioButton masculin;
        RadioButton feminun;

        nom = (Text) findViewById(R.id.nom);
        prenom = (Text) findViewById(R.id.prenom);
        email = (Text) findViewById(R.id.email);
        mdp = (Text) findViewById(R.id.password);
        mpdConfirm = (Text) findViewById(R.id.confirmPassword);
        telephone = (Text) findViewById(R.id.telephone);
        masculin = (RadioButton) findViewById(R.id.radioButton);
        feminun = (RadioButton) findViewById(R.id.radioButton);


        // si invalide
        if((nom == null)||(mdp == null)||(prenom == null)||(telephone == null)||(email == null)
            ||((masculin == null) && (feminun ==null))|| (mdp != mpdConfirm))
        {

        }

        else   // si formulaire valide
        {
            startActivity(new Intent(RegisterActivity.this, Menu.class));
        }

    }
}
