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


public class ActivityFruits extends Activity implements
        OnItemClickListener {

    public static final String[] titles = new String[] { "Ackee", "Ananas", "Cachiman", "Carambola", "Carotte", "Citron", "Goyave", "Mandarine", "Mango Muscat", "Papaye", "Noix de Coco", "Veritable"  };

    public static final String[] descriptions = new String[] {
            "Le fruit est souvent étuvé dans l’eau salée ou dans du lait, puis légèrement frits dans du beurre.",
            "l’ananas contient environ 11% d’Hydrates de carbone dont la plupart sont des sucres. Sa teneur en graisse et protéines est négligeable. Les vitamines les plus abondantes dans l’ananas sont la C, la B1 et la B6, il constitue aussi une bonne source de folates.",
            "Appelé dans certaines régions « pomme cannelle » ce fruit très délicat qui ne peut se cueillir que mûr, et qui tend à s’écraser si on tarde à le manger, renferme autour de ses graines une espèce de crème.",
            "Carambola",
            "elle est l’aliment le plus riche en provitamine A, elle constitue une assez bonne source de vitamines du groupe B ainsi que de vitamines C et E",
            "Dans la composition du citron, nous trouvons notamment la vitamine C mais les composants les plus intéressants du citron sont les non nutritifs: les acides organiques, acétiques et formiques , Flavonoïdes présents dans l’écorce et la pulpe.",
            "La goyave est l’un des fruits les plus riches en vitamine C, elle est donc fortement recommandée en cas de grippe et, d’une manière générale, comme aliment de santé.",
            "La mandarine est un agrume. C’est le fruit du mandarinier, un arbre de la famille des Rutacées. Sa valeur énergétique est d'environ 40 kcal/100g",
            "Le mango Muscat est rond et n’a pas de bec, elle a une cavité profonde, sa peau est gris-clair avec des points de couleur abricot, sa viande de couleur d'abricot, elle est juteuse et aromatique, on le trouve generalement dans le sud et l’Artibonite.",
            "Fruit à la chair juteuse, de couleur jaune, gros comme le poing et formant une couronne autour de la tête des branches du papayer.",
            "Fruit poussant en régime de 15 à 20, La noix de coco se présente comme un gros fruit de forme ovale, recouvert d'une épaisse écorce brillante vert pâle",
            "L'arbre à pain est consommé en Haiti, grillé, frit, bouilli seul, en purée, ou comme un des éléments des fameux bouillons haïtiens. Dans certaines régions du Nord, on l'appelle \"toupie. On le cultive en grande quantité dans le département de la grande-Anse."
    };

    public static final Integer[] images = { R.drawable.fruits_ackee, R.drawable.fruits_ananas, R.drawable.fruits_cachiman, R.drawable.fruits_carambola, R.drawable.fruits_carotte, R.drawable.fruits_citron, R.drawable.fruits_goyave, R.drawable.fruits_mandarine, R.drawable.fruits_mangomuscat, R.drawable.fruits_papaye, R.drawable.fruits_noixdecoco, R.drawable.fruits_veritab
    };

    ListView listView;
    List<RowItemFruits> rowItems;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_fruits);

        rowItems = new ArrayList<RowItemFruits>();
        for (int i = 0; i < titles.length; i++) {
            RowItemFruits item = new RowItemFruits(images[i], titles[i], descriptions[i]);
            rowItems.add(item);
        }

        listView = (ListView) findViewById(R.id.list);
        CustomBaseAdapterFruits adapter = new CustomBaseAdapterFruits(this, rowItems);
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