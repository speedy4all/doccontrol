package com.example.doccontrol.activities.base.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.doccontrol.R
import com.example.doccontrol.activities.base.BaseActivity
import com.example.doccontrol.activities.base.models.BaseModel

class DashboardActivity : BaseActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager

    private var medicList = listOf<BaseModel.MedicListModel>();

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.content_dashboard)
        val resp = createMockData()
        medicList = resp.list
        viewManager = LinearLayoutManager(this)
        viewAdapter = DataTableShow(medicList)
        recyclerView = findViewById<RecyclerView>(R.id.listView).apply {
            setHasFixedSize(true)
            layoutManager = viewManager
            adapter = viewAdapter
        }
    }

    private fun createMockData(): BaseModel.MedicListResponse {
        return BaseModel.MedicListResponse(generateList())
    }

    private fun generateList(): List<BaseModel.MedicListModel> {
        val list = listOf<BaseModel.MedicListModel>()
        for (i in 1..100) {
            list.plus(BaseModel.MedicListModel("Alin", 4.5f, "url", "Generalist"))
        }
        return list
    }

    override fun getContentViewResId(): Int {
        return R.layout.content_dashboard
    }

    override fun getActionTitle(): String {
        return getString(R.string.dashboard)
    }

    override fun getMenuForActivity(): Int {
        return R.menu.main
    }
}
class DataTableShow(private val myDataset: List<BaseModel.MedicListModel>) : RecyclerView.Adapter<DataTableShow.MyViewHolder>() {
    class MyViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataTableShow.MyViewHolder {
        LayoutInflater.from(parent.context).inflate(R.layout.doctor_row_view, parent, false)
        return MyViewHolder(textView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.textView.text = myDataset[position].name
    }
    override fun getItemCount() = myDataset.size
}
