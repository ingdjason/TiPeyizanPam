package com.djamoli.tipeyizanpam;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import java.util.ArrayList;
import java.util.List;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;


public class ActivityHotels extends Activity implements
        OnItemClickListener {

    public static final String[] titles = new String[] { "Le MontCell", "La Maison hotel", "Hotel Montana", "Moulin sur mer", "Villa Nicole", "Xaragua", "Kaliko", "Karibe hotel", "Best Western", "Royal Oasis", "El rancho", "Serve hotel", "Marriott"};

    public static final String[] descriptions = new String[] {
            "Rte de kenscoff, Belot 14 Km de Petion-Ville, Kenscoff-Haiti.",
            "Situé à seulement 1,5 km de l'aéroport international de Port-au-Prince, l'établissement La Maison propose des transferts aéroport gratuits ainsi que de lumineuses chambres climatisées avec connexion",
            "Situé à Pétionville, à la périphérie sud-est de Port-au-Prince.HOTEL MONTANA HAITI - RUE FRANK CARDOZO - 6119 PORT-AU-PRINCE HAITI TEL: (509)2940-0584 http://www.hotelmontanahaiti.com/default-fr.html",
            "Le complexe balnéaire de style colonial Moulin Sur Mer est situé à Montrouis, au bord des eaux turquoise de la côte des Arcadins.",
            "Villa Nicole est un hôtel familial et une boutique exploité, construit en 2012 et au début de 2013, et a récemment inauguré en mai 2013. http://www.villanicolejacmel.com/",
            "Côte des Arcadins, Route Nationale #1, Km 80, Montrouis",
            "Kaliko Beach Club est situé à seulement 61 km de l’Aéroport International de Port-au-Prince, sur la côte des Arcadins. http://kalikobeachclub.com/resort/?lang=fr ",
            "L'Hôtel Karibe situé à Juvenat, quartier reconnu pour sa sérénité, est à quelques minutes des principaux centres d’activités de Port-au-Prince et de Pétion-Ville. http://www.karibehotel.com/fr/",
            "à environ 12 kilomètres de l'aéroport international de Port-au-Prince.(509) 2814 2222  http://www.bestwesternpremierhaiti.com/",
            "Hôtel Royal Oasis. 115, avenue Panaméricaine Pétion-Ville http://www.occidentalhotels.com/city-hotel/occidental-royal-oasis",
            "Le NH Haiti El Rancho bénéficie d'un emplacement privilégié au cœur de Pétion-Ville, dans une banlieue résidentielle de Port-au-Prince.La chute du Saut-d'Eau est à 25 km du NH Haiti El Rancho.",
            "Le Servotel est situé juste en face de l'aéroport international de la ville. Route de l'aeroport, zone Cargo, 0000 Port-au-Prince, Haïti (+509) 28 12 75 00 http://www.servotelhaiti.com/home/",
            "À seulement 7 miles de l'aéroport international Toussaint Louverture, L'aéroport international est accessible en 20 minutes de route.147, Avenue Jean Paul II, Turgeau  Port-au-Prince  HT 6113  Haiti. http://www.marriott.com/hotels/travel/papmc-marriott-port-au-prince-hotel/"
             };

    public static final Integer[] images = { R.drawable.hotels_le_montcell, R.drawable.hotels_lamaisonhotel, R.drawable.hotels_montana, R.drawable.hotels_moulin_sur_mer, R.drawable.hotels_villa_nicole, R.drawable.hotels_xaragua, R.drawable.hotels_kaliko, R.drawable.hotels_karibehotel, R.drawable.hotels_bestwestern, R.drawable.hotels_royaloasis, R.drawable.hotels_elrancho, R.drawable.hotels_servehotel, R.drawable.hotels_marriothotel
    };

    ListView listView;
    List<RowItemHotels> rowItems;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_hotels);

        rowItems = new ArrayList<RowItemHotels>();
        for (int i = 0; i < titles.length; i++) {
            RowItemHotels item = new RowItemHotels(images[i], titles[i], descriptions[i]);
            rowItems.add(item);
        }

        listView = (ListView) findViewById(R.id.list);
        CustomBaseAdapterHotels adapter = new CustomBaseAdapterHotels(this, rowItems);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position,
                            long id) {

        Toast toast = Toast.makeText(getApplicationContext(),
                "Item " + (position + 1) + ": " + rowItems.get(position),
                Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.BOTTOM|Gravity.CENTER_HORIZONTAL, 0, 0);
        toast.show();
        // Sending image id to FullScreenActivity
        //  Intent i = new Intent(getApplicationContext(), FullImageActivity.class);
        // passing array index
        // i.putExtra("id", position);
        //  startActivity(i);
    }
}
