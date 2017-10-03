package amanda.com.habittrainer

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup

/**
 * Created by venturus on 03/10/17.
 */

class HabitsAdapter(val habits: List<Habit>) : RecyclerView.Adapter<HabitsAdapter.HabitViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): HabitViewHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(holder: HabitViewHolder?, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    override fun getItemCount(): Int = habits.size

    class HabitViewHolder(val iv: View) : RecyclerView.ViewHolder(iv)


}

