package amanda.com.habittrainer

/**
 * Created by venturus on 03/10/17.
 */

data class Habit(val title: String, val description: String, val image: Int)

fun getSampleHabits(): List<Habit>{
    return listOf(
            Habit("Run", "Swim and bike later", R.drawable.walk),
            Habit("Drink water", "Must keep hydrated", R.drawable.water)
    )
}