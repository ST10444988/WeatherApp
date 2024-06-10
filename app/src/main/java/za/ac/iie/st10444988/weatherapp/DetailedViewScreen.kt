package za.ac.iie.st10444988.weatherapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ViewGroup {

}
class DetailedViewScreen() : AppCompatActivity(), Parcelable {

    private val dailyDetails = mutableListOf<DetailedViewScreen>()

    constructor(parcel: Parcel) : this() {
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed_view_screen)


        val temperatures = intent.getDoubleArrayExtra("temperatures")?.toList() ?: emptyList()

        for ((index, temp) in temperatures.withIndex()) {
            val day = index + 1
            val maxTemp = temp
            val minTemp = temp - 5.0 // Simulating a lower minimum temperature
            val weatherCondition = getRandomWeatherCondition()
            dailyDetails.add(DetailedViewScreen(day, maxTemp, minTemp, weatherCondition))
        }

    fun getRandomWeatherCondition(): String {
        val weatherConditions = listOf("Sunny", "Cloudy", "Rainy", "Windy", "Foggy")
        return weatherConditions.random()
    }

    // DailyDetail data class
    data class DailyDetail(
        val day: Int,
        val maxTemp: Double,
        val minTemp: Double,
        val weatherCondition: String
    )

    class DailyDetailsAdapter(private val dailyDetails: List<DailyDetail>) :
        RecyclerView.Adapter<DailyDetailsAdapter.ViewHolder>() {

        inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            val dayTextView: TextView = itemView.findViewById(R.id.dayTextView)
            val maxTempTextView: TextView = itemView.findViewById(R.id.maxTempTextView)
            val minTempTextView: TextView = itemView.findViewById(R.id.minTempTextView)
            val weatherConditionTextView: TextView = itemView.findViewById(R.id.weatherCondition)
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            val dailyDetail = dailyDetails[position]
            holder.dayTextView.text = "Day ${dailyDetail.day}"
            holder.maxTempTextView.text = "Max: ${dailyDetail.maxTemp}°C"
            holder.minTempTextView.text = "Min: ${dailyDetail.minTemp}°C"
            holder.weatherConditionTextView.text = dailyDetail.weatherCondition
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            TODO("Not yet implemented")
        }

        override fun getItemCount(): Int = dailyDetails.size
    }
}

    private fun DetailedViewScreen(
        day: Int,
        maxTemp: Double,
        minTemp: Double,
        weatherCondition: Any
    ): DetailedViewScreen {
        TODO("Not yet implemented")
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<DetailedViewScreen> {
        override fun createFromParcel(parcel: Parcel): DetailedViewScreen {
            return DetailedViewScreen(parcel)
        }

        override fun newArray(size: Int): Array<DetailedViewScreen?> {
            return arrayOfNulls(size)
        }
    }

    private fun getRandomWeatherCondition() {

    }

