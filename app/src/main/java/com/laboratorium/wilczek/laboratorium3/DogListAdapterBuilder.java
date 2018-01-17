package com.laboratorium.wilczek.laboratorium3;
import java.util.ArrayList;
/**
 * Created by konrad on 2018-01-17.
 */

public class DogListAdapterBuilder { private ArrayList<String> dogs;
    private RecyclerViewClickListener listener;

    public DogListAdapterBuilder setDogs(ArrayList<String> dogs) {
        this.dogs = dogs;
        return this;
    }

    public DogListAdapterBuilder setListener(RecyclerViewClickListener listener) {
        this.listener = listener;
        return this;
    }

    public DogsListAdapter createDogsListAdapter() {
        return new DogsListAdapter(dogs, listener);
    }
}
