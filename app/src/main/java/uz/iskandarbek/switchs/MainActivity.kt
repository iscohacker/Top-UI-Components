package uz.iskandarbek.switchs

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.os.Bundle
import android.widget.Switch
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import uz.iskandarbek.switchs.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    @SuppressLint("UseSwitchCompatOrMaterialCode")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.svitch.setOnClickListener {
            val dialog = android.app.AlertDialog.Builder(this)
            val inflater = layoutInflater
            val dialogView = inflater.inflate(R.layout.item_switch, null)
            dialog.setView(dialogView)
            val swiitch = dialogView.findViewById<Switch>(R.id.customSwitch)
            val alertDialog = dialog.create()
            alertDialog.show()
            swiitch.setOnCheckedChangeListener { _, isChecked ->
                if (isChecked) {
                    Toast.makeText(this, "Faollashtirildi", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(this, "Faolsizlantirildi", Toast.LENGTH_SHORT).show()
                }

            }
        }

        binding.sekbar.setOnClickListener {
            val dialog =  AlertDialog.Builder(this)
            val inflater = layoutInflater
            val dialogView = inflater.inflate(R.layout.item_seekbar, null)
            dialog.setView(dialogView)
            dialog.show()
        }

        binding.slider.setOnClickListener {
            val dialog = AlertDialog.Builder(this)
            val inflater = layoutInflater
            val dialogView = inflater.inflate(R.layout.item_slider, null)
            dialog.setView(dialogView)
            dialog.show()
        }

        binding.chekboks.setOnClickListener {
            val dialog = AlertDialog.Builder(this)
            val inflater = layoutInflater
            val dialogView = inflater.inflate(R.layout.item_chekooks, null)
            dialog.setView(dialogView)
            dialog.show()
        }

        binding.radiogroup.setOnClickListener {
            val dialog = AlertDialog.Builder(this)
            val inflater = layoutInflater
            val dialogView = inflater.inflate(R.layout.item_radiogroup, null)
            dialog.setView(dialogView)
            dialog.show()
        }

        binding.rating.setOnClickListener {
            val dialog = AlertDialog.Builder(this)
            val inflater = layoutInflater
            val dialogView = inflater.inflate(R.layout.item_rating, null)
            dialog.setView(dialogView)
            dialog.show()
        }
        binding.superedt.setOnClickListener {
            val dialog = AlertDialog.Builder(this)
            val inflater = layoutInflater
            val dialogView = inflater.inflate(R.layout.item_edt, null)
            dialog.setView(dialogView)
            dialog.show()
        }
        binding.chip.setOnClickListener {
            val dialog = AlertDialog.Builder(this)
            val inflater = layoutInflater
            val dialogView = inflater.inflate(R.layout.item_chip, null)
            dialog.setView(dialogView)
            dialog.show()
        }
    }
}
