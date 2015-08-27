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


public class ActivitySites extends Activity implements
        OnItemClickListener {

    public static final String[] titles = new String[] { "Parc National", "Tiyaa Touyac", "Milot", "Palais Sans-souci", "Saut-Mathurine", "Vierge Miraculeuse", "Lac Azuei", "Grotte Marie-Jeanne", "Bassin Zim", "Citadelle", "Bassin Bleu", "Fort-Oge", };

    public static final String[] descriptions = new String[] {
            "Le Parc National Pic Macaya est l'un des deux parcs nationaux de la République d'Haïti. Le parc est situé au sud du pays et contient sa dernière forêt tropicale vierge. Les plus hauts sommets atteignent une hauteur de 2.347 mètres et ses montagnes sont essentiellement karstiques et volcaniques. ",
            "Les cascades Tiyaya et Touyac qui attirent tous les visiteurs offrent aux plus jeunes frileux des sensations fortes la possibilité de faire des plongeons de quelque dix metres. Pas plus que 15 minutes du Boucanier.",
            "Peut être le premier site touristique du pays, cette commune abrite les deux grands monuments historiques du département du Nord. Il s’agit bien du Palais sans- souci et de la Citadelle La Ferrière, ils sont enregistrés dans le patrimoine mondial de l’UNESCO. Milot, est un coin très calme et fraîche, où il fait très bon de vivre.",
            "Le Palais Sans Souci est un château situé à Milot, dans le nord d'Haïti. Construit au XIXᵉ siècle, le Palais de Sans-Souci est l'œuvre de Henri Christophe, l'un des héros de la guerre de l'indépendance, autoproclamé roi.",
            "une chute d’eau d’une beauté incomparable dont le merveilleux spectacle produit ne le cède en rien aux plus beaux paysages que l’on peut contempler à l’étranger",
            "Puisque tout le monde doit y trouver du sien, dans la ville des Coteaux , 30 minutes de Port-Salut , des pelerins adorent gravir les 500 marches qui conduisent a la Vierge Miraculeuse, tres attentive, dit-on , aux supplications des visiteurs, des femmes en particulier.",
            "le lac Azuéi ou étang Saumâtre",
            "La grotte Marie Jeanne qui a fait sa réputation comme la plus grande de la Caraïbe avec ses quelques 2 kms de longueur et se terminant par un lac pour repeater les experts, elle est localisée à Port-a-Piment du Sud a quelque 45 minutes duBoucanier sur une route pave et longeant le rivage.",
            "Parmi les richesses naturelles que renferme le département du Centre, une se distingue par sa beauté et l’attraction qu’il exerce sur les visiteurs : le Bassin Zim. Véritable joyau de la nature par ses cascades et ses grottes, ce site entouré de légendes constitue cependant une richesse inexploitée sur le plan touristique.",
            "Citadelle",
            "Bassin-Bleu, situé à l'Ouest de Jacmel, dans la section rurale de Lavanneau, à environ 5 kilomètres de la ville. Le site Bassin-Bleu est considéré comme l'une des merveilles du monde. Parmi les beautés naturelles de la région, il est une où la nature s'est voulue particulièrement exquise, un joyau pour les touristes-excursionnistes.",
            "Le Fort Ogé fait partie d'une vingtaine d'ouvrages militaires construits sur le territoire d'Haïti après l'indépendance en 1804: ce système défensif était dirigé contre un éventuel retour des Français, anciens maîtres de la colonie de Saint-Domingue. Le Fort Ogé a été construit sous la direction du général Magloire Ambroise. Les ruines du fort sont situées dans la section communale de Cap-Rouge. Son nom évoque Vincent Ogé, l'une des figures de la révolution haïtienne"
    };

    public static final Integer[] images = { R.drawable.sites_parc_national_macaya, R.drawable.sites_cascade_tiyaya_touyac, R.drawable.sites_milot, R.drawable.sites_palais_sans_souci, R.drawable.sites_saut_mathurine_cayes, R.drawable.sites_vierge_miraculeuse, R.drawable.sites_lac_azuei, R.drawable.sites_grotte_marie_jeanne, R.drawable.sites_bassin_zim_pool, R.drawable.sites_citadellec, R.drawable.sites_bassin_bleu2, R.drawable.sites_fort_oge_jacmel
    };

    ListView listView;
    List<RowItemSites> rowItems;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_sites);

        rowItems = new ArrayList<RowItemSites>();
        for (int i = 0; i < titles.length; i++) {
            RowItemSites item = new RowItemSites(images[i], titles[i], descriptions[i]);
            rowItems.add(item);
        }

        listView = (ListView) findViewById(R.id.list);
        CustomBaseAdapterSites adapter = new CustomBaseAdapterSites(this, rowItems);
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
