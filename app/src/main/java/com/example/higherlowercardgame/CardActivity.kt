package com.example.higherlowercardgame


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random


class CardActivity : AppCompatActivity() {


    lateinit var imageView: ImageView
    lateinit var Button: Button

    lateinit var imageView2: ImageView
    lateinit var Button2: Button


    val deck = mutableListOf<Card>()
    init {
        createDeck()
    }
    fun createDeck(){

    val card1 = Card(R.drawable.c2, 2)
    val card2 = Card(R.drawable.c3, 3)
    val card3 = Card(R.drawable.c4, 4)
    val card4 = Card(R.drawable.c5, 5)
    val card5 = Card(R.drawable.c6, 6)
    val card6 = Card(R.drawable.c7, 7)
    val card7 = Card(R.drawable.c8, 8)
    val card8 = Card(R.drawable.c9, 9)
    val card9 = Card(R.drawable.c10, 10)
    val card10 = Card(R.drawable.cj, 11)
    val card11 = Card(R.drawable.cq, 12)
    val card12 = Card(R.drawable.ck, 13)
    val card13 = Card(R.drawable.ca, 14)

    val card14 = Card(R.drawable.ht, 2)
    val card15 = Card(R.drawable.h3, 3)
    val card16 = Card(R.drawable.h4, 4)
    val card17 = Card(R.drawable.h5, 5)
    val card18 = Card(R.drawable.h6, 6)
    val card19 = Card(R.drawable.h7, 7)
    val card20 = Card(R.drawable.h8, 8)
    val card21 = Card(R.drawable.h9, 9)
    val card22 = Card(R.drawable.h10, 10)
    val card23 = Card(R.drawable.hj, 11)
    val card24 = Card(R.drawable.hq, 12)
    val card25 = Card(R.drawable.hk, 13)
    val card26 = Card(R.drawable.ha, 14)

    val card27 = Card(R.drawable.s2, 2)
    val card28 = Card(R.drawable.s3, 3)
    val card29 = Card(R.drawable.s4, 4)
    val card30 = Card(R.drawable.s5, 5)
    val card31 = Card(R.drawable.s6, 6)
    val card32 = Card(R.drawable.s7, 7)
    val card33 = Card(R.drawable.s8, 8)
    val card34 = Card(R.drawable.s9, 9)
    val card35 = Card(R.drawable.s10, 10)
    val card36 = Card(R.drawable.sj, 11)
    val card37 = Card(R.drawable.sq, 12)
    val card38 = Card(R.drawable.sk, 13)
    val card39 = Card(R.drawable.sa, 14)

    val card40 = Card(R.drawable.d2, 2)
    val card41 = Card(R.drawable.d3, 3)
    val card42 = Card(R.drawable.d4, 4)
    val card43 = Card(R.drawable.d5, 5)
    val card44 = Card(R.drawable.d6, 6)
    val card45 = Card(R.drawable.d7, 7)
    val card46 = Card(R.drawable.d8, 8)
    val card47 = Card(R.drawable.d9, 9)
    val card48 = Card(R.drawable.d10, 10)
    val card49 = Card(R.drawable.dj, 11)
    val card50 = Card(R.drawable.dq, 12)
    val card51 = Card(R.drawable.dk, 13)
    val card52 = Card(R.drawable.da, 14)

    deck.add(card1)
    deck.add(card2)
    deck.add(card3)
    deck.add(card4)
    deck.add(card5)
    deck.add(card6)
    deck.add(card7)
    deck.add(card8)
    deck.add(card9)
    deck.add(card10)
    deck.add(card11)
    deck.add(card12)
    deck.add(card13)
    deck.add(card14)
    deck.add(card15)
    deck.add(card16)
    deck.add(card17)
    deck.add(card18)
    deck.add(card19)
    deck.add(card20)
    deck.add(card21)
    deck.add(card22)
    deck.add(card23)
    deck.add(card24)
    deck.add(card25)
    deck.add(card26)
    deck.add(card27)
    deck.add(card28)
    deck.add(card29)
    deck.add(card30)
    deck.add(card31)
    deck.add(card32)
    deck.add(card33)
    deck.add(card34)
    deck.add(card35)
    deck.add(card36)
    deck.add(card37)
    deck.add(card38)
    deck.add(card39)
    deck.add(card40)
    deck.add(card41)
    deck.add(card42)
    deck.add(card43)
    deck.add(card44)
    deck.add(card45)
    deck.add(card46)
    deck.add(card47)
    deck.add(card48)
    deck.add(card49)
    deck.add(card50)
    deck.add(card51)
    deck.add(card52)}





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card)


        createDeck()



        val random = Random.nextInt(deck.size)
        val random2 = Random.nextInt(deck.size)

            val firstCard = deck[random]
            val secondCard = deck[random2]

            val imageView = findViewById<ImageView>(R.id.firstCard)
            val imageView2 = findViewById<ImageView>(R.id.secondCard)

            imageView.setImageResource(firstCard.image)



        val Button = findViewById<Button>(R.id.lowButton)
        val Button2 = findViewById<Button>(R.id.highButton)


        Button.setOnClickListener {
            imageView2.setImageResource(secondCard.image)
            if (firstCard.value > secondCard.value){
                val intent = Intent(this, CorrectActivity::class.java)
                startActivity(intent)
            }
            if (firstCard.value == secondCard.value){
                val intent = Intent(this, CorrectActivity::class.java)
                startActivity(intent)
            }
            if (firstCard.value < secondCard.value){
                val intent = Intent(this, IncorrectActivity::class.java)
                startActivity(intent)
            }
        }

        Button2.setOnClickListener {
            imageView2.setImageResource(secondCard.image)
            if (firstCard.value < secondCard.value){
                val intent = Intent(this, CorrectActivity::class.java)
                startActivity(intent)
            }
            if (firstCard.value == secondCard.value){
                val intent = Intent(this, CorrectActivity::class.java)
                startActivity(intent)
            }
            if (firstCard.value > secondCard.value){
                val intent = Intent(this, IncorrectActivity::class.java)
                startActivity(intent)
            }
        }





        }





    }








