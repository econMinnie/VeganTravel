
package com.vegan.eiko.vegantravel;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by eiko on 1/4/2016.
 */
public class LanguageListEU extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.language_card_listview,
                container, false);
        //create adapter and set it listview
        ListView listview = rootview.findViewById(R.id.listview_language);
        String[] EU = new String[]{"Italian", "French", "German", "Spanish", "Arabic"};
        ArrayAdapter adapter = new ArrayAdapter<String>(
                getActivity(), android.R.layout.simple_list_item_1,
                EU);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override //italian, french, german, spanish, arabic
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent italian = new Intent(getActivity(), VegItalian.class);
                        startActivity(italian);
                        break;
                    case 1:
                        Intent french = new Intent(getActivity(), VegFrench.class);
                        startActivity(french);
                        break;
                    case 2:
                        Intent german = new Intent(getActivity(), VegGerman.class);
                        startActivity(german);
                        break;
                    case 3:
                        Intent spanish = new Intent(getActivity(), VegSpanish.class);
                        startActivity(spanish);
                        break;
                    case 4:
                        Intent arabic = new Intent(getActivity(), VegArabic.class);
                        startActivity(arabic);
                        break;
                }
            }
        });
        return rootview;
    }
}
