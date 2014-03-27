
package net.uchidak.carduiwithanimationsample;

import java.util.ArrayList;
import java.util.List;
import android.os.Bundle;
import android.app.Activity;
import android.widget.ListView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<CardItem> objects = new ArrayList<CardItem>();

        for (int i = 0; i < 20; i++) {
            CardItem tmpItem = new CardItem();
            tmpItem.setTitleText("カードUIをアニメーション付きで実装してみました:" + i);
            objects.add(tmpItem);
        }

        CardArrayAdapter adapter = new CardArrayAdapter(this, 0, objects);

        ListView listView = (ListView) findViewById(R.id.card_list);
        listView.setAdapter(adapter);
    }

}
