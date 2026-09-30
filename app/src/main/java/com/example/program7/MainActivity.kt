package com.example.program7

import android.os.Bundle
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

data class Student(
    val name: String,
    val rollNumber: String,
    val department: String,
    val course: String,
    val iconResId: Int
)

class StudentAdapter(
    private val context: Context,
    private val students: List<Student>
) : BaseAdapter() {

    override fun getCount(): Int = students.size

    override fun getItem(position: Int): Any = students[position]

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = convertView ?: LayoutInflater.from(context).inflate(
            R.layout.item_student,
            parent,
            false
        )

        val student = students[position]
        val imageView = view.findViewById<ImageView>(R.id.studentImageView)
        val nameTextView = view.findViewById<TextView>(R.id.studentNameTextView)
        val detailsTextView = view.findViewById<TextView>(R.id.studentDetailsTextView)

        imageView?.setImageResource(student.iconResId)
        nameTextView?.text = "${student.name} (${student.rollNumber})"
        detailsTextView?.text = "${student.department} - ${student.course}"

        return view
    }
}

class MainActivity : AppCompatActivity() {

    private lateinit var studentListView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        studentListView = findViewById(R.id.studentListView)

        val studentList = listOf(
            Student(
                "Swarupa S",
                "25MCAR0137",
                "MCA",
                "Android Development",
                android.R.drawable.ic_menu_myplaces
            ),
            Student(
                "Rahul Kumar",
                "25MCAR0101",
                "MCA",
                "Database Management",
                android.R.drawable.ic_menu_agenda
            ),
            Student(
                "Ananya Sharma",
                "25MCAR0102",
                "MCA",
                "Web Development",
                android.R.drawable.ic_menu_edit
            ),
            Student(
                "Arjun Rao",
                "25MCAR0103",
                "MCA",
                "Cloud Computing",
                android.R.drawable.ic_menu_upload
            ),
            Student(
                "Priya N",
                "25MCAR0104",
                "MCA",
                "Artificial Intelligence",
                android.R.drawable.ic_menu_search
            ),
            Student(
                "Kiran S",
                "25MCAR0105",
                "MCA",
                "Software Engineering",
                android.R.drawable.ic_menu_manage
            )
        )

        val adapter = StudentAdapter(this, studentList)
        studentListView.adapter = adapter
    }
}
