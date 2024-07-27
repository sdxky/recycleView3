package com.example.recycleview3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class DrinkListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_drink_list, container, false)
        val recyclerView: RecyclerView = view.findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        val drinkList = listOf(
            Drink("Coffee", "Горячий напиток, приготовленный из обжаренных кофейных зерен."),
            Drink("Tea", "Горячий или холодный напиток из затвердевших или свежих чайных листьев."),
            Drink("Smoothie", "Холодный напиток, приготовленный из смешанных фруктов и овощей."),
            Drink("Soda", "Газированный напиток с различными вкусами."),
            Drink("Water", "Освежающий и необходимый для жизни напиток.")
        )
        recyclerView.adapter = DrinkAdapter(drinkList)

        return view
    }
}
