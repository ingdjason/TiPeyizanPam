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


public class ActivityPlages extends Activity implements
        OnItemClickListener {

    public static final String[] titles = new String[] { "Abakabay", "Anse a raisin", "Anse d'azure", "Club indigo", "Labadie", "Moulin sur mer", "Ozana du sud", "Port-Morgan", "Port-salut", "Paradis de l'anse", "Ile de la trompeuse", "Pointe-Ouest"};

    public static final String[] descriptions = new String[] {
            "(Sud-Ile- à- vache) Nichée dans son palais verdoyante de l’Ile-à-Vache, Abaka bay est selon un sondage du grand journal américain CNN, la 57e plus belle plage du monde. Selon les amateurs des belles plages, elle offre une vue exceptionnelle sur l’océan, avec du sable très blanc et de l’eau très claire cette plage est d’une beauté époustouflante.",
            "(Ile de la Gonâve/ L’Ouest) L’île de la Gonâve est presqu’aussi grande que la Martinique. En effet, en dépit de manque d’infrastructure qu’on peut constater sur cette île, elle cache une perle d’une beauté incroyable. Même sans raisin sous les dents, la plage Anse à Raisins vous offre une eau cristalline et des sables plus blanc que la neige pour se lézarder sur ce paradis terrestre",
            "(Grand’ Anse/Jérémie) Port-au-Prince est une ville parfois fiévreuse et agitée, envie de trouver un endroit calme pour se bronzer et délecter la douceur de la nature, il y a bien sûr l’Anse D’Azur dans la cité des poètes. Avec des paysages le long de la côte, offrant un spectacle sauvage d’une terre encore préservée, d’une mer oubliée. L’Anse d’Azur est un endroit calme et paradisiaque du pays pour des excursions exceptionnelles.",
            "(Montrouis-Saint Marc) A environ 45 minutes de la capitale haïtienne, sur la côte des Arcadins où s’allongent plusieurs stations balnéaires du pays. Le club indigo nous attend. C’est une des plages les plus calmes où le décor est particulièrement attrayant pour un rendez-vous très sympas entre amis et amoureux.",
            "(Nord- Cap-Haïtien) Située à 5 km de la ville du Cap-Haitien, Labadie ou Labadee se passe de présentation. Elle est la plus grande et la plus belle station balnéaire du pays. Très réputée pour ses activités nautiques, pour les croisiéristes du monde entier, Labadie est vraiment le paradis des caraïbes et la perle précieuse de la République d’Haïti.",
            "(Montrouis/ Saint-Marc) A quelques km de Port-au-Prince, la côte des Arcadins propose une succession de belles plages très fréquentées. Envie de se prélasser sur des sables fin au bord de la mer des Caraïbes, moulin sur mer est un coin splendide pour passer de bel moment en cette période estivale.",
            "(Ozanana de St Jean du Sud) une plage où la mer est le plus souvent calme et d’un bleu magnifique, se trouve encastrer dans un cadre discret et verdoyant",
            "(Sud/Ile-à-vache) A la recherche d’un refuge total, sur une plage de rêve entourée de nature verdoyante, dans un cadre agréable, la plage de port-Morgan est une destination de choix pour la baignade des grands comme des petits.",
            "(Port-salut)Port-salut  ici, n’est pas ce célèbre fromage très délicieux et de réputation mondiale. Mais, elle est cette commune splendide située sur la cote sud du pays. De passage en Haïti, port-salut, la ville qui a vu naître l’ancien Président Jean Bertrand Aristide est un des plus beaux endroits du pays à visiter.",
            "L’Anse Dufour, l’Anse à l’eau, la Petite anse Dufour, la Hatte sont des plages enchanteresses de sable fin entre végétation émeraude et céruléens.",
            "(Aquin/Sud) Elle n’est pas vraiment trompeuse, cette plage d’une beauté stupéfiante. Mais elle est sur la liste des plus belles plages très prisées de cette région hautement touristique. Le doux parfum de cette commune et des plats de lambis, des crustacés sont un plus pour les friands des excursions dans les Caraïbes.",
            "(Ile- de la tortue/ Port-de-Paix) Plus rarement mis en lumière par la population locale, la sublime plage Pointe- Ouest est une merveille dans les Caraïbes. D’ailleurs, c’est sur cette magnifique plage que Christophe Colomb avait jeté l’ancre. Elle a été désignée par la revue de tourisme Condé Nast, comme l’une des 10 plus belles plages des Caraïbes."

    };

    public static final Integer[] images = { R.drawable.plages_abakabay, R.drawable.plages_ansearaisin, R.drawable.plages_ansedazurgrandanse, R.drawable.plages_clubindigo, R.drawable.plages_labadeenordcaphaitien, R.drawable.plages_moulinsur_mer, R.drawable.plages_ozananadestjeandusud, R.drawable.plages_port_morgan, R.drawable.plages_port_salut, R.drawable.plages_paradisdelansedufour, R.drawable.plages_liledelatrompeuse, R.drawable.plages_pointe_ouest
    };

    ListView listView;
    List<RowItemPlages> rowItems;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_plages);

        rowItems = new ArrayList<RowItemPlages>();
        for (int i = 0; i < titles.length; i++) {
            RowItemPlages item = new RowItemPlages(images[i], titles[i], descriptions[i]);
            rowItems.add(item);
        }

        listView = (ListView) findViewById(R.id.list);
        CustomBaseAdapterPlages adapter = new CustomBaseAdapterPlages(this, rowItems);
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
