package com.example.aplicativoch

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.models.SlideModel

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val imageList = ArrayList<SlideModel>() // Cria a Imagem Slide 1

        imageList.add(SlideModel("https://www.baraoervamate.com.br/wp-content/uploads/2019/09/benefi%CC%81cios-do-cha%CC%81-de-camomila.jpg"))
        imageList.add(SlideModel("https://www.dicasdemulher.com.br/wp-content/uploads/2020/09/cha-de-maca-2.jpg"))
        imageList.add(SlideModel("https://doutorjairo.com.br/media/_versions/istock-_cha_de_camomila_widelg.jpg"))
        imageList.add(SlideModel("https://www.receiteria.com.br/wp-content/uploads/receitas-de-cha-de-mac%CC%A7a-com-canela-0.jpg"))
// Adiciona a imagem do Slide
        val imageSlider = findViewById<ImageSlider>(R.id.slider) // chama a função do Slide
        imageSlider.setImageList(imageList)

//Fim do Silde 1

        val imageList2 = ArrayList<SlideModel>() // Cria a imagem do slide 2

        imageList2.add(SlideModel("https://blog.pajaris.com.br/wp-content/uploads/2020/10/Cha-gelado-preto-com-hibisco-e-limao.jpg"))
        imageList2.add(SlideModel("https://kafa.com.br/wp-content/uploads/2021/04/shutterstock_420898555-1.jpg"))

        val imageSlider2 = findViewById<ImageSlider>(R.id.slider2) // Variavel que chama o slide 2
        imageSlider2.setImageList(imageList2)

         // Fim do slide 2

        val imageList3 = ArrayList<SlideModel>() // Cria a imagem do slide 3

        imageList3.add(SlideModel("https://abir.org.br/abir2022/wp-content/uploads/2019/04/chas-leao-preparacao-agua-gelada.jpg"))
        imageList3.add(SlideModel("https://qualyvida.net.br/wp-content/uploads/2013/10/Ch%C3%A1-Le%C3%A3o-Sabores.jpg"))

        val imageSlider3 = findViewById<ImageSlider>(R.id.slider3) // Variavel que chama o slide 3
        imageSlider3.setImageList(imageList3)

        // Fim do slide 3

        val button = findViewById<Button>(R.id.button4)
        val button2 = findViewById<Button>(R.id.button5)
        val button3 = findViewById<Button>(R.id.button6)

        button.setOnClickListener {

            Firescreen()

        }
        button2.setOnClickListener {

            IceScreen()

        }

        button3.setOnClickListener {

            Indscreen()

        }

    }

    private fun Firescreen() {
        val PushButton1 = Intent(this, FireActivity::class.java)
        startActivity(PushButton1)
    }

    private fun IceScreen() {
        val PushButton2 = Intent(this, IceActivity::class.java)
        startActivity(PushButton2)
    }
    private fun Indscreen() {
        val PushButton3 = Intent(this, IndusActivity::class.java)
        startActivity(PushButton3)
    }



}