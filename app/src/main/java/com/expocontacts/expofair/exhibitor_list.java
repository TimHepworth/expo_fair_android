package com.expocontacts.expofair;

import android.app.ListActivity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;

public class exhibitor_list extends ListActivity {

    String[] itemname ={
            "Acal BFi UK",
            "Acrovision Ltd.",
            "Alrad Imaging",
            "Alrad Photonics",
            "Analytik Ltd.",
            "AP Technologies",
            "Armstrong Optical",
            "Aston Institute of Photonic Technologies (Aston University)",
            "Avantes UK",
            "Bentham Instruments",
            "Buhler",
            "CASIX Inc.",
            "CeramOptec GmbH",
            "ClearView Imaging Ltd.",
            "COTEC GmbH",
            "Crystran Ltd.",
            "Delta Optical Thin Film",
            "Drives & Controls",
            "EG Electronics",
            "Electro Optics / Imaging & Machine Vision Europe",
            "Elliot Scientific",
            "ELUXI Ltd.",
            "EKSMA Optics",
            "EZConn Czech",
            "FLIR Systems",
            "Fraunhofer UK Research",
            "Hamamatsu Photonics",
            "Hellma UK",
            "HHV Ltd.",
            "High Finesse GmbH",
            "Industrial Technology Magazine",
            "Island Optics",
            "Key Photonics Ltd.",
            "Lambda Photometrics",
            "Laser 2000",
            "Laser Components Ltd.",
            "Laser Lines",
            "Linkam Scientific Instruments",
            "Lumatec GmbH",
            "LumOptica Ltd.",
            "Manx Precision Optics",
            "Microscopy & Analysis",
            "MotionLink Ltd.",
            "Multipix Imaging Ltd.",
            "Newport Spectra-Physics",
            "Novus Light Technologies Today",
            "Ocean Optics",
            "OHARA GmbH",
            "Omniscan Ltd.",
            "Ophir Spiricon Europe GmbH",
            "Optics.org",
            "OPTIX Co.",
            "Orion Photonics",
            "P & T Consulting",
            "Photon Engineering LLC",
            "Photon Lines",
            "Photonic Solutions",
            "Photonics Technologies",
            "PHOTONIS",
            "PI Ltd",
            "PI-KEM Ltd",
            "Princeton Instruments",
            "Pro-Lite Technology Ltd",
            "Redlux Ltd",
            "Santec Europe",
            "Scanwel Imaging",
            "Scitec Instruments",
            "Senop Oy",
            "SLS Optics Ltd",
            "Stemmer Imaging",
            "Surface Optics",
            "Teesside University",
            "Thorlabs",
            "Toptica Photonics",
            "UQG (Optics) Ltd",
            "Vision Engineering",
            "Vortex Optical Coatings Ltd",
            "Zemax"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exhibitor_list);

        this.setListAdapter(new ArrayAdapter<String>(
                this, R.layout.exhibitor_list_item,
                R.id.ExhibitorName,itemname));
    }
}
