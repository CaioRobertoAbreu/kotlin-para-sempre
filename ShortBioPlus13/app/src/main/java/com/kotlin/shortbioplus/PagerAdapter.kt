package com.kotlin.shortbioplus

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class PagerAdapter(gerenciador: FragmentManager): FragmentPagerAdapter(gerenciador) {
    override fun getCount(): Int {
        return 4
    }

    override fun getItem(position: Int): Fragment {
        return if (position == 0)
            SobreFragment()
        else if (position == 1)
            FormacaoFragment()
        else if (position == 2)
            ExperienciasFragment()
        else
            DiferenciaisFragment()
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return if (position == 0)
            "Sobre"
        else if (position == 1)
            "Formação"
        else if (position == 2)
            "Experiências"
        else
            "Diferenciais"
    }
}