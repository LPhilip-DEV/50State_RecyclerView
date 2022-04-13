package com.example.mad_ind05_philip_lijo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {

    private lateinit var newRecyclerview: RecyclerView
    private lateinit var newArrayList : ArrayList<States>
    lateinit var imageId : Array<Int>
    lateinit var stateName : Array<String>
    lateinit var stateNickname:Array<String>
    lateinit var stateArea: Array<String>
    lateinit var imageId2 : Array<Int>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // State flag images array
        imageId = arrayOf(
            R.drawable.alabama, R.drawable.alaska, R.drawable.arizona, R.drawable.arkansas, R.drawable.california,
            R.drawable.colorado, R.drawable.connecticut, R.drawable.delaware, R.drawable.florida, R.drawable.georgia,
            R.drawable.hawaii, R.drawable.idaho, R.drawable.illinois, R.drawable.indiana, R.drawable.iowa,
            R.drawable.kansas, R.drawable.kentucky, R.drawable.louisiana, R.drawable.maine, R.drawable.maryland,
            R.drawable.massachusetts, R.drawable.michigan, R.drawable.minnesota, R.drawable.mississippi, R.drawable.missouri,
            R.drawable.montana, R.drawable.nebraska, R.drawable.nevada, R.drawable.new_hampshire, R.drawable.new_jersey,
            R.drawable.new_mexico, R.drawable.new_york, R.drawable.north_carolina, R.drawable.north_dakota, R.drawable.ohio,
            R.drawable.oklahoma, R.drawable.oregon, R.drawable.pennsylvania, R.drawable.rhode_island, R.drawable.south_carolina,
            R.drawable.south_dakota, R.drawable.tennessee, R.drawable.texas, R.drawable.utah, R.drawable.vermont,
            R.drawable.virginia, R.drawable.washington, R.drawable.west_virginia, R.drawable.wisconsin, R.drawable.wyoming

        )

        // State images array
        imageId2 = arrayOf(
            R.drawable.alabama1, R.drawable.alaska1, R.drawable.arizona1, R.drawable.arkansas1, R.drawable.california1,
            R.drawable.colorado1, R.drawable.connecticut1, R.drawable.delaware1, R.drawable.florida1, R.drawable.georgia1,
            R.drawable.hawaii1, R.drawable.idaho1, R.drawable.illinois1, R.drawable.indiana1, R.drawable.iowa1,
            R.drawable.kansas1, R.drawable.kentucky1, R.drawable.louisiana1, R.drawable.maine1, R.drawable.maryland1,
            R.drawable.massachusetts1, R.drawable.michigan1, R.drawable.minnesota1, R.drawable.mississippi1, R.drawable.missouri1,
            R.drawable.montana1, R.drawable.nebraska1, R.drawable.nevada1, R.drawable.new_hampshire1, R.drawable.new_jersey1,
            R.drawable.new_mexico1, R.drawable.new_york1, R.drawable.north_carolina1, R.drawable.north_dakota1, R.drawable.ohio1,
            R.drawable.oklahoma1, R.drawable.oregon1, R.drawable.pennsylvania1, R.drawable.rhode_island1, R.drawable.south_carolina1,
            R.drawable.south_dakota1, R.drawable.tennessee1, R.drawable.texas1, R.drawable.utah1, R.drawable.vermont1,
            R.drawable.virginia1, R.drawable.washington1, R.drawable.west_virginia1, R.drawable.wisconsin1, R.drawable.wyoming1

        )

        // State names array
        stateName = arrayOf(
            "Alabama", "Alaska", "Arizona", "Arkansas", "California",
            "Colorado", "Connecticut", "Delaware", "Florida", "Georgia",
            "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa",
            "Kansas", "Kentucky", "Louisiana", "Maine", "Maryland",
            "Massachusetts", "Michigan", "Minnesota", "Mississippi", "Missouri",
            "Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey",
            "New Mexico", "New York", "North Carolina", "North Dakota", "Ohio",
            "Oklahoma", "Oregon", "Pennsylvania", "Rhode Island", "South Carolina",
            "South Dakota", "Tennessee", "Texas", "Utah", "Vermont",
            "Virginia", "Washington", "West Virginia", "Wisconsin", "Wyoming"

            )

        // State nicknames array
        stateNickname = arrayOf(
            "The Yellowhammer State", "The Last Frontier State", "The Grand Canyon State", "The Natural State", "The Golden State",
            "The Centennial State", "The Constitution State", "The First State", "The Sunshine State", "The Peach State",
            "The Aloha State", "The Gem State", "The Prairie State", "The Hoosier State", "The Hawkeye State" ,
            "The Sunflower State", "The Bluegrass State", "The Pelican State", "The Pine Tree State", "The Old Line State",
            "The Bay State", "The Great Lakes State", "The North Star State", "The Magnolia State", "The Show Me State",
            "The Treasure State", "The Cornhusker State", "The Silver State", "The Granite State", "The Garden State",
            "The Land of Enchantment State", "The Empire State", "The Tar Heel State", "The Peace Garden State", "The Buckeye State",
            "The Sooner State", "The Beaver State", "The Keystone State", "The Ocean State", "The Palmetto State",
            "The Mount Rushmore State", "The Volunteer State", "The Lone Star State", "The Beehive State", "The Green Mountain State",
            "The Old Dominion State", "The Evergreen State", "The Mountain State", "The Badger State", "The Equality or Cowboy State"

            )

        // State areas array from strings.xml
        stateArea = arrayOf(
            getString(R.string.alabama), getString(R.string.alaska), getString(R.string.arizona), getString(R.string.arkansas), getString(R.string.california),
            getString(R.string.colorado), getString(R.string.connecticut), getString(R.string.delaware), getString(R.string.florida), getString(R.string.georgia),
            getString(R.string.hawaii), getString(R.string.idaho), getString(R.string.illinois), getString(R.string.indiana), getString(R.string.iowa),
            getString(R.string.kansas), getString(R.string.kentucky), getString(R.string.louisiana), getString(R.string.maine), getString(R.string.maryland),
            getString(R.string.massachusetts), getString(R.string.michigan), getString(R.string.minnesota), getString(R.string.mississippi), getString(R.string.missouri),
            getString(R.string.montana), getString(R.string.nebraska), getString(R.string.nevada), getString(R.string.new_hampshire), getString(R.string.new_jersey),
            getString(R.string.new_mexico), getString(R.string.new_york), getString(R.string.north_carolina), getString(R.string.north_dakota), getString(R.string.ohio),
            getString(R.string.oklahoma), getString(R.string.oregon), getString(R.string.pennsylvania), getString(R.string.rhode_island), getString(R.string.south_carolina),
            getString(R.string.south_dakota), getString(R.string.tennessee), getString(R.string.texas), getString(R.string.utah), getString(R.string.vermont),
            getString(R.string.virginia), getString(R.string.washington), getString(R.string.west_virginia), getString(R.string.wisconsin), getString(R.string.wyoming)

        )

        // Referring to the RecyclerView
        newRecyclerview =findViewById(R.id.recyclerView)
        newRecyclerview.layoutManager = LinearLayoutManager(this)
        newRecyclerview.setHasFixedSize(true)

        // Passing State image, name, and nickname into the array list States data class.
        newArrayList = arrayListOf<States>()
        getUserdata()

    }

    // Loop through all state data and pass it to newArrayList.
    private fun getUserdata() {

        for (i in imageId.indices) {

            val states = States(imageId[i],stateName[i], stateNickname[i])
            newArrayList.add(states)
        }

        val adapter = StateAdapter(newArrayList)
        newRecyclerview.adapter = adapter
        adapter.setOnItemClickListener(object : StateAdapter.OnStateClickListener {
            override fun onStateClick(position: Int) {


                // Passing state data to the second activity on click at a particular position.
                // Portion of the code was referenced and modified from https://stackoverflow.com/questions/45157567/how-to-pass-the-values-from-activity-to-another-activity on (4/8/22)
                val intent = Intent(this@MainActivity,SecondaryActivity::class.java)
                // Passing a key and its value
                intent.putExtra("name", newArrayList[position].name)
                intent.putExtra("imageId", newArrayList[position].flagImage)
                intent.putExtra("area", stateArea[position])
                intent.putExtra("imageId2", imageId2[position])
                startActivity(intent)
            }

        })

    }
}